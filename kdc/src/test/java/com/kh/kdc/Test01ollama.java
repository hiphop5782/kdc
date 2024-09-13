package com.kh.kdc;

import java.net.URISyntaxException;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.kh.kdc.service.OllamaService;

@SpringBootTest
class Test01ollama {
	
	@Autowired
	private OllamaService service;

	@Test
	void contextLoads() throws JsonMappingException, JsonProcessingException, URISyntaxException {
		
		String prompt = """
아침 메뉴 추천해줘.

우선 알아야 할 점은 다음과 같아.
1.여기는 한국이다.
2.영어가 아닌 한국어로 결과를 보고 싶다.
3.칼로리와 영양분에 대한 설명을 듣고 싶다.
4.재료는 마트에서 쉽게 구할 수 있는 것이어야 한다.

다음 세 가지 컨셉에 맞는 메뉴를 추천해줘.
1.아침부터 중요한 일이 있어서 든든하게 먹어야 할 경우에 추천할 음식
2.어제 저녁에 술을 많이 먹어서 숙취를 해소해야 할 경우에 추천할 음식
3.다이어트를 하기 위해 필요한 건강식
""";
		
		String result = service.usePrompt(prompt);
		System.out.println(result);
		
	}

}
