package com.example.spring09;

import java.io.UnsupportedEncodingException;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.spring09.service.PromptService;
import com.example.spring09.vo.PromptRequestVO;
import com.example.spring09.vo.PromptResponseVO;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;

@SpringBootTest
public class Test02OllamaServiceTest {

	@Autowired
	private PromptService promptService;
	
	@Test
	public void test() throws JsonMappingException, JsonProcessingException, UnsupportedEncodingException {
		PromptRequestVO request = new PromptRequestVO();
		request.setPrompt("다이어트에 좋은 음식 알려주세요!");
		
		PromptResponseVO response = promptService.ask(request);
		System.out.println(response.getContent());
		System.out.println(response.getTime());
	}
	
}
