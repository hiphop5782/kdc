package com.kh.kdc.service;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class OllamaService {
	
	public String usePrompt(String prompt) throws URISyntaxException, JsonMappingException, JsonProcessingException {
		RestTemplate template = new RestTemplate();
		
		URI uri = new URI("http://localhost:11434/api/generate");
		
		HttpHeaders header = new HttpHeaders();
		
		Map<String, String> body = new HashMap<>();
		body.put("model", "llama3");
		body.put("prompt", prompt);
		
		HttpEntity entity = new HttpEntity(body, header);
		
		String response = template.postForObject(uri, entity, String.class);
		ObjectMapper mapper = new ObjectMapper();
		Scanner sc = new Scanner(response);
		List<Map<String, Object>> list = new ArrayList<>();
		StringBuffer buffer = new StringBuffer();
		while(sc.hasNextLine()) { 
			String line = sc.nextLine();
			//JsonNode node = mapper.readTree(line);
			//System.out.println(node);
			Map<String, Object> map = mapper.readValue(line, Map.class);
			buffer.append(map.get("response"));
			list.add(map);
		}
		sc.close();
		
		return buffer.toString();
	}
	
}
