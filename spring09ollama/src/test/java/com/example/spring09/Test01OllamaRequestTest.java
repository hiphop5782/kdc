package com.example.spring09;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootTest
public class Test01OllamaRequestTest {
	
	@Test
	public void test() throws JsonMappingException, JsonProcessingException {
		RestTemplate template = new RestTemplate();
		
		String url = "http://localhost:11434/api/generate";
		
		HttpHeaders header = new HttpHeaders();
		header.add("Content-Encoding", "UTF-8");
		
		Map<String, String> body = new HashMap<>();
		body.put("model", "llama3.2");
		body.put("prompt", "Hello! 안녕하세요!");
		
		//HttpEntity<Map<String, String>> entity = new HttpEntity<>(body, header);
		HttpEntity entity = new HttpEntity(body, header);
		
		String response = template.postForObject(url, entity, String.class);
		//System.out.println("<response>");
		//System.out.println(response);
		
		ObjectMapper mapper = new ObjectMapper();
		StringBuffer buffer = new StringBuffer();
		Scanner sc = new Scanner(response);
		while(sc.hasNextLine()) {
			String line = sc.nextLine();
			System.out.println("line = " + line);
			
			Map<String, Object> map = mapper.readValue(line, Map.class);
			//System.out.println("response = " + map.get("response"));
			buffer.append(map.get("response"));
		}
		sc.close();
		
		String result = buffer.toString();
		System.out.println(result);
	}
	
}
