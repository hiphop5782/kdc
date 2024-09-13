package com.kh.kdc.service;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class TranslateService {
	
	public String englishToKorean(String english) throws URISyntaxException {
		RestTemplate template = new RestTemplate();
		
		URI uri = new URI("http://localhost:5000/translate");
		
		HttpHeaders headers = new HttpHeaders();
		headers.add("Content-Type", "application/json");
		
		Map<String, String> body = new HashMap<>();
		body.put("q", english);
		body.put("source", "en");
		body.put("target", "ko");
		
		HttpEntity entity = new HttpEntity(body, headers);
		
		Map<String, String> response = template.postForObject(uri, entity, Map.class);
		return response.get("translatedText");
	}
	public String koreanToEnglish(String korean) throws URISyntaxException {
		RestTemplate template = new RestTemplate();
		
		URI uri = new URI("http://localhost:5000/translate");
		
		HttpHeaders headers = new HttpHeaders();
		headers.add("Content-Type", "application/json");
		
		Map<String, String> body = new HashMap<>();
		body.put("q", korean);
		body.put("source", "ko");
		body.put("target", "en");
		
		HttpEntity entity = new HttpEntity(body, headers);
		
		Map<String, String> response = template.postForObject(uri, entity, Map.class);
		return response.get("translatedText");
	}
}
