package com.example.spring08;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpHeaders;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.example.spring08.entity.Weather;
import com.example.spring08.repository.WeatherRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootTest
public class PublicDataTest {
	
	@Autowired
	private WeatherRepository weatherRepository;

	@Test
	public void test() throws JsonMappingException, JsonProcessingException {
		LocalDateTime now = LocalDateTime.now().truncatedTo(ChronoUnit.HOURS);
		String date = now.format(DateTimeFormatter.ofPattern("yyyyMMdd"));
		String time = now.format(DateTimeFormatter.ofPattern("HHmm"));
		System.out.println("date = " + date);
		System.out.println("time = " + time);
		
		//통신도구 준비
		RestTemplate template = new RestTemplate();
		
		//주소
		String url = UriComponentsBuilder.fromUriString("http://apis.data.go.kr/1360000/VilageFcstInfoService_2.0/getUltraSrtNcst")
				.queryParam("serviceKey", "B5K/WhfF5ybLmPWVSNvy0TlaKL2wAHx9c4Uiy7rBDqVA0XF9E9H7NKwwZTi5QGuPgTjEhiLARhYbmFzkzvZlww==")
				.queryParam("numOfRows", "1000")
				.queryParam("pageNo", "1")
				.queryParam("dataType", "JSON")
				.queryParam("base_date", "20241210")
				.queryParam("base_time", "0000")
				.queryParam("nx", "60")
				.queryParam("ny", "127")
				.build().toUriString();
		
		//헤더
		HttpHeaders headers = new HttpHeaders();
		headers.add("Content-Type", "application/json");
		
		//바디(GET/DELETE 처럼 존재하지 않는 방식일 때는 없을 수 있음)
		
		//최종 통신 요청
		String response = template.getForObject(url, String.class);
		System.out.println("<response>");
		System.out.println(response);
		
		//Jackson이라는 스프링부트에 기본 포함된 라이브러리를 이용하여 response를 해석
		ObjectMapper objectMapper = new ObjectMapper();//해석도구
		JsonNode rootNode = objectMapper.readTree(response);//해석을 지시	
		
		JsonNode responseNode = rootNode.get("response");//항목 내 response라는 이름의 필드값을 추출
		//헤더
		JsonNode headerNode = responseNode.get("header");//항목 내 header라는 이름의 필드값을 추출
		String resultCode = headerNode.get("resultCode").asText();//문자열 추출
		String resultMsg = headerNode.get("resultMsg").asText();//문자열 추출
		System.out.println("resultCode = " + resultCode);
		System.out.println("resultMsg = " + resultMsg);
		//바디
		JsonNode bodyNode = responseNode.get("body");
		JsonNode itemsNode = bodyNode.get("items");
		JsonNode itemNode = itemsNode.get("item");
		
		//실질적인 항목에 대한 접근
		//for(int i=0; i < itemNode.size(); i++) {
		//	JsonNode node = itemNode.get(i);
		
		Weather weather = new Weather();
		for(JsonNode node : itemNode) {
			//baseDate, baseTime, nx, ny
			weather.setBaseDate(node.get("baseDate").asText());
			weather.setBaseTime(node.get("baseTime").asText());
			weather.setNx(node.get("nx").asInt());
			weather.setNy(node.get("ny").asInt());
			
			//습도 = REH , 온도 = T1H
			String category = node.get("category").asText();
			String obsrValue = node.get("obsrValue").asText();
			if(category.equalsIgnoreCase("REH")) {
				weather.setHumidity(Double.parseDouble(obsrValue));
			}
			else if(category.equalsIgnoreCase("T1H")) {
				weather.setTemperature(Double.parseDouble(obsrValue));
			}
		}
		
		//weather의 정보가 잘 설정되었는지 확인
		System.out.println(weather);
		
		//DB 저장
		weatherRepository.save(weather);
	}
	
}
