package com.example.spring10.service;

import java.io.UnsupportedEncodingException;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.spring10.vo.PromptRequestVO;
import com.example.spring10.vo.PromptResponseVO;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class PromptService {
	
	@Autowired
	private TranslateService translateService;
	
	public PromptResponseVO ask(PromptRequestVO request) throws JsonMappingException, JsonProcessingException, UnsupportedEncodingException {
		//1. 서버 메세지 전송을 위한 도구를 준비
		RestTemplate template = new RestTemplate();
		
		//2. 요청을 보낼 주소를 설정
		String url = "http://localhost:11434/api/generate";
		
		//3. 요청 헤더 준비
		HttpHeaders header = new HttpHeaders();
		header.add("Content-Encoding", "UTF-8");
		
		//4. 요청 바디 준비
		Map<String, String> body = new HashMap<>();
		body.put("model", "llama3.2");
		body.put("prompt", request.getPrompt());
		
		//5. 헤더와 바디를 합쳐 요청개체 생성
		HttpEntity entity = new HttpEntity(body, header);
		
		//6. 최종 요청 전송
		String responseText = template.postForObject(url, entity, String.class);
		
		//7. 읽은 내용 해석 및 변환
		ObjectMapper mapper = new ObjectMapper();//변환 도구
		StringBuffer buffer = new StringBuffer();//문자열 합성 도구
		Scanner sc = new Scanner(responseText);//문자열 입력 도구
		while(sc.hasNextLine()) {
			String line = sc.nextLine();
			try {
				Map<String, Object> map = mapper.readValue(line, Map.class);
				buffer.append(map.get("response"));
			}catch(Exception e) {}
		}
		sc.close();
		
		//8. 아스키(ISO-8859-1) 형태로 된 결과를 UTF-8로 복구
		String ascii = buffer.toString();
		byte[] data = ascii.getBytes("ISO-8859-1");
		String utf8 = new String(data, "UTF-8");
		
		//9. 결과 형태를 생성
		PromptResponseVO response = new PromptResponseVO();
		response.setTime(LocalDateTime.now());//현재 시각(생성 시각)
		response.setContent(utf8);//olllama가 생성한 결과 텍스트
		return response;
	}
	
	//(+추가) 사용자가 입력한 프롬프트에 텍스트를 추가해서 원하는 답변에 가까워지도록 구현
	public PromptResponseVO askWithAdvice(PromptRequestVO request) throws JsonMappingException, JsonProcessingException, UnsupportedEncodingException {
		String prompt = request.getPrompt() + "(설명은 한글로 해주시고 용어는 번역하지마세요)";
		request.setPrompt(prompt);//프롬프트 재설정
		return ask(request);
	}
	
	//(+추가) 사용자가 입력한 프롬프트를 영문으로 번역해서 ollama 요청을 보내고 다시 한글로 번역해서 반환
	public PromptResponseVO askWithTranslate(PromptRequestVO request) throws JsonMappingException, JsonProcessingException, UnsupportedEncodingException {
		String prompt = request.getPrompt();//사용자가 입력한 한글 프롬프트
		String englishPrompt = translateService.kor2eng(prompt);//한글 → 영어
		request.setPrompt(englishPrompt);//프롬프트 재설정
		PromptResponseVO response = ask(request);
		String koreanResponse = translateService.eng2kor(response.getContent());//영어 → 한글
		response.setContent(koreanResponse);//응답결과 재설정
		return response;//응답 반환
	}
	
}
