package com.example.spring09;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.web.client.RestTemplate;

import com.example.spring09.service.PromptService;
import com.example.spring09.vo.PromptRequestVO;
import com.example.spring09.vo.PromptResponseVO;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;

@SpringBootTest
public class Test03TranslateTest {

//	@Test
	public void test() {
		RestTemplate template = new RestTemplate();
		
		String url = "http://localhost:5000/translate";
		
		HttpHeaders header = new HttpHeaders();
		header.add("Content-Type", "application/json");
		
		Map<String, String> body = new HashMap<>();
		//body.put("q", "다이어트에 좋은 음식을 알려주세요!");//번역할 문장
		//body.put("source", "ko");//문장의 언어 코드
		//body.put("target", "en");//번역할 목표 언어 코드
		
		body.put("q", "Let’s tell you a good food for your diet!");
		body.put("source", "en");
		body.put("target", "ko");
		
		//HttpEntity<Map<String, String>> entity = new HttpEntity<>(body, header);
		HttpEntity entity = new HttpEntity(body, header);
		
		//String response = template.postForObject(url, entity, String.class);
		Map<String, String> response = template.postForObject(url, entity, Map.class);
		System.out.println("<response>");
		System.out.println(response.get("translatedText"));
	}
	
	@Autowired
	private PromptService promptService;
	
	@Test
	public void test2() throws JsonMappingException, JsonProcessingException, UnsupportedEncodingException {
		PromptRequestVO request = new PromptRequestVO();
		request.setPrompt("""
				내가 알려주는 사람의 정보를 잘 기억해두고 이 사람이 정상적인 체중을 유지할 수 있도록 아침, 점심, 저녁 식사를 추천해줘.
				국적은 한국이고 나이는 39세, 키는 180cm, 몸무게는 120kg, 성별은 남자야.
				한국 사람들이 주로 먹는 음식을 기준으로 추천해주고 오늘 하루 분량만 알려주면 돼.
				메뉴 이름과 효과만 알려주고 다른 텍스트는 알려주지 않아도 돼
				markdown을 사용하지 말고 텍스트만 사용하세요
				""");
		
		PromptResponseVO response = promptService.askWithTranslate(request);
		System.out.println(response.getContent());
	}
	
}
