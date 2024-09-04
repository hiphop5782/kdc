package com.kh.kdc.restcontroller;

import java.net.URISyntaxException;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.kh.kdc.resreq.PromptRequest;
import com.kh.kdc.resreq.PromptResponse;
import com.kh.kdc.service.OllamaService;

@RestController
@RequestMapping("/ollama")
public class OllamaRestController {
	
	@Autowired
	private OllamaService ollamaService;
	
	@GetMapping("/")
	public String hello() {
		return "hello";
	}
	
	@PostMapping("/prompt")
	public PromptResponse prompt(@RequestBody PromptRequest promptRequest) 
				throws JsonMappingException, JsonProcessingException, URISyntaxException {
		String result = ollamaService.usePrompt(promptRequest.getPrompt());
		return PromptResponse.builder().result(result).time(LocalDateTime.now()).build();
	}
	
}
