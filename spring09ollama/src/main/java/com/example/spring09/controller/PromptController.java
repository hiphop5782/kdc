package com.example.spring09.controller;

import java.io.UnsupportedEncodingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring09.service.PromptService;
import com.example.spring09.vo.PromptRequestVO;
import com.example.spring09.vo.PromptResponseVO;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;

@RestController
@RequestMapping("/prompt")
public class PromptController {
	
	@Autowired
	private PromptService promptService;
	
	@PostMapping("/ask")
	public PromptResponseVO ask(@RequestBody PromptRequestVO request) throws JsonMappingException, JsonProcessingException, UnsupportedEncodingException {
		return promptService.ask(request);
	}
	
	@PostMapping("/askWithAdvice")
	public PromptResponseVO askWithAdvice(@RequestBody PromptRequestVO request) throws JsonMappingException, JsonProcessingException, UnsupportedEncodingException {
		return promptService.askWithAdvice(request);
	}
	
	@PostMapping("/askWithTranslate")
	public PromptResponseVO askWithTranslate(@RequestBody PromptRequestVO request) throws JsonMappingException, JsonProcessingException, UnsupportedEncodingException {
		return promptService.askWithTranslate(request);
	}
	
}
