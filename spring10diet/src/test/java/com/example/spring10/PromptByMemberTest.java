package com.example.spring10;

import java.io.UnsupportedEncodingException;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.spring10.entity.Curation;
import com.example.spring10.entity.Member;
import com.example.spring10.repository.CurationRepository;
import com.example.spring10.repository.MemberRepository;
import com.example.spring10.service.PromptService;
import com.example.spring10.vo.PromptRequestVO;
import com.example.spring10.vo.PromptResponseVO;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;

@SpringBootTest
public class PromptByMemberTest {

	@Autowired
	private PromptService promptService;
	
	@Autowired
	private MemberRepository memberRepository;

	@Autowired
	private CurationRepository curationRepository;
	
	@Test
	public void test() throws JsonMappingException, JsonProcessingException, UnsupportedEncodingException {
		long no = 1L;
		
		Member target = memberRepository.findById(no).orElseThrow();
		
		//문자열 합성 도구
		StringBuffer buffer = new StringBuffer();
		buffer.append("지금부터 알려주는 사람의 정보를 토대로 정상적인 체중을 유지할 수 있는 식사 메뉴를 추천해주세요.");
		buffer.append("이름은 "+target.getName()+", ");
		buffer.append("국적은 "+target.getNationality()+", ");
		buffer.append("키는 "+target.getHeight()+"cm, ");
		buffer.append("체중은 "+target.getWeight()+"kg, ");
		String gender = target.getGender().equals("M") ? "남자" : "여자";
		buffer.append("성별은 "+gender+"입니다.");
		buffer.append("해당 나라의 음식 위주로 추천해주시고 아침, 점심, 저녁 총 세번의 식사에 대한 메뉴를 추천해주세요.");
		buffer.append("메뉴 이름과 칼로리를 알려주고 그 외 부가적인 텍스트는 알려주지 않아도 됩니다.");
		buffer.append("Markdown을 사용하지 말고 텍스트로만 알려주세요!");
		
		//프롬프트 요청
		PromptRequestVO request = new PromptRequestVO();
		request.setPrompt(buffer.toString());
		PromptResponseVO response = promptService.askWithTranslate(request);
		//System.out.println(response.getContent());
		
		//저장
		Curation curation = new Curation();
		curation.setContent(response.getContent());//프롬프트
		curation.setTarget(target.getNo());//회원 고유번호
		curationRepository.save(curation);//저장
	}
	
}
