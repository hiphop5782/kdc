package com.example.spring10.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class TranslateService {

	public String eng2kor(String eng) {
		//[1] 요청 도구를 생성
		RestTemplate template = new RestTemplate();
		
		//[2] 주소 설정
		String url = "http://localhost:5000/translate";
		
		//[3] 헤더 설정
		HttpHeaders header = new HttpHeaders();
		header.add("Content-Type", "application/json");
		
		//[4] 바디 설정
		Map<String, String> body = new HashMap<>();
		body.put("q", eng);
		body.put("source", "en");
		body.put("target", "ko");
		
		//[5] 엔티티 생성
		HttpEntity entity = new HttpEntity(body, header);
		
		//[6] 요청 전송 및 응답 수신
		Map<String, String> response = template.postForObject(url, entity, Map.class);
		
		//[7] 결과만 반환
		return response.get("translatedText");
	}
	
	public String kor2eng(String kor) {
		//[1] 요청 도구를 생성
		RestTemplate template = new RestTemplate();
		
		//[2] 주소 설정
		String url = "http://localhost:5000/translate";
		
		//[3] 헤더 설정
		HttpHeaders header = new HttpHeaders();
		header.add("Content-Type", "application/json");
		
		//[4] 바디 설정
		Map<String, String> body = new HashMap<>();
		body.put("q", kor);
		body.put("source", "ko");
		body.put("target", "en");
		
		//[5] 엔티티 생성
		HttpEntity entity = new HttpEntity(body, header);
		
		//[6] 요청 전송 및 응답 수신
		Map<String, String> response = template.postForObject(url, entity, Map.class);
		
		//[7] 결과만 반환
		return response.get("translatedText");
	}
	
}
