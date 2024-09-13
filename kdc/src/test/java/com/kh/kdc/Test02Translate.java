package com.kh.kdc;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.kh.kdc.service.OllamaService;
import com.kh.kdc.service.TranslateService;

@SpringBootTest
public class Test02Translate {
	
	@Autowired
	private TranslateService translateService;
	
	@Autowired
	private OllamaService ollamaService;

	@Test
	public void test() throws URISyntaxException, JsonMappingException, JsonProcessingException {
		String prompt = "아침 메뉴 추천해줘!";
		String advice = """
다음 세 가지 컨셉에 맞는 메뉴를 추천해줘.
1.중요한 일이 있어서 든든하게 먹어야 할 경우에 추천할 음식
2.술을 많이 먹어서 숙취를 해소해야 할 경우에 추천할 음식
3.다이어트를 하기 위해 필요한 건강식
""";
		StringBuffer buffer = new StringBuffer(prompt);
		buffer.append(advice);
		String english = translateService.koreanToEnglish(buffer.toString());
		String result = ollamaService.usePrompt(english);
		String korean = translateService.englishToKorean(result);
		
		System.out.println("<buffer>");
		System.out.println(buffer);
		System.out.println("<english>");
		System.out.println(english);
		System.out.println("<result>");
		System.out.println(result);
		System.out.println("<korean>");
		System.out.println(korean);
	}
}
