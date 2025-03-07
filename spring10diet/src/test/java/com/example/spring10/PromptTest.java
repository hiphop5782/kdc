package com.example.spring10;

import java.io.UnsupportedEncodingException;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.spring10.service.PromptService;
import com.example.spring10.vo.PromptRequestVO;
import com.example.spring10.vo.PromptResponseVO;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;

@SpringBootTest
public class PromptTest {
	
	@Autowired
	private PromptService promptService;
	
	@Test
	public void test() throws JsonMappingException, JsonProcessingException, UnsupportedEncodingException {
		PromptRequestVO request = new PromptRequestVO();
		request.setPrompt("안녕하세요!");
		
		PromptResponseVO response = promptService.askWithTranslate(request);
		System.out.println(response.getContent());
	}
	
}
