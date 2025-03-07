package com.example.spring08.service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.example.spring08.entity.Weather;
import com.example.spring08.repository.WeatherRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

//단위작업을 처리하는 도구
@Service
public class WeatherService {
	
	@Autowired
	private WeatherRepository weatherRepository;
	
	//cron 표현식으로 실행 주기를 지정하여 스케쥴러 실행
	//cron = "초 분 시 일 월 요일"
	//*은 모든(all)의 의미를 가짐
	//?는 아무거나(any)의 의미를 가짐
	@Scheduled(cron = "0 0 * * * *")
	public void work() throws JsonMappingException, JsonProcessingException {
		//조회할 날짜 정보를 생성
		LocalDateTime now = LocalDateTime.now().truncatedTo(ChronoUnit.HOURS).minusHours(1L);
		String date = now.format(DateTimeFormatter.ofPattern("yyyyMMdd"));
		String time = now.format(DateTimeFormatter.ofPattern("HHmm"));
		
		//통신도구 준비
		RestTemplate template = new RestTemplate();
		
		//주소
		String url = UriComponentsBuilder.fromUriString("http://apis.data.go.kr/1360000/VilageFcstInfoService_2.0/getUltraSrtNcst")
				.queryParam("serviceKey", "B5K/WhfF5ybLmPWVSNvy0TlaKL2wAHx9c4Uiy7rBDqVA0XF9E9H7NKwwZTi5QGuPgTjEhiLARhYbmFzkzvZlww==")
				.queryParam("numOfRows", "1000")
				.queryParam("pageNo", "1")
				.queryParam("dataType", "JSON")
				.queryParam("base_date", date)
				.queryParam("base_time", time)
				.queryParam("nx", "60")
				.queryParam("ny", "127")
				.build().toUriString();
		
		//헤더
		HttpHeaders headers = new HttpHeaders();
		headers.add("Content-Type", "application/json");
		
		//바디(GET/DELETE 처럼 존재하지 않는 방식일 때는 없을 수 있음)
		
		//최종 통신 요청
		String response = template.getForObject(url, String.class);
		//System.out.println("<response>");
		//System.out.println(response);
		
		//Jackson이라는 스프링부트에 기본 포함된 라이브러리를 이용하여 response를 해석
		ObjectMapper objectMapper = new ObjectMapper();//해석도구
		JsonNode rootNode = objectMapper.readTree(response);//해석을 지시	
		
		JsonNode responseNode = rootNode.get("response");//항목 내 response라는 이름의 필드값을 추출
		//헤더
		JsonNode headerNode = responseNode.get("header");//항목 내 header라는 이름의 필드값을 추출
		String resultCode = headerNode.get("resultCode").asText();//문자열 추출
		String resultMsg = headerNode.get("resultMsg").asText();//문자열 추출
		//System.out.println("resultCode = " + resultCode);
		//System.out.println("resultMsg = " + resultMsg);
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
		//System.out.println(weather);
		
		//DB 저장
		weatherRepository.save(weather);
	}
	
}
