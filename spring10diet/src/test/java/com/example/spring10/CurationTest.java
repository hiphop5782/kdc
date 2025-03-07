package com.example.spring10;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.spring10.entity.Member;
import com.example.spring10.repository.MemberRepository;
import com.example.spring10.service.CurationService;

@SpringBootTest
public class CurationTest {

	@Autowired
	private CurationService curationService;
	
	@Autowired
	private MemberRepository memberRepository;
	
	@Test
	public void test() {
		System.out.println("자동화 큐레이션 서비스 시작");
		
		List<Member> memberList = memberRepository.findAll();
		for(Member member : memberList) {
			//문제가 생겨도 다음 멤버로 넘어가도록 예외처리를 구현
			try {
				curationService.curationByMember(member);
			}
			catch(Exception e) {
				System.err.println("큐레이션 오류 발생");
				e.printStackTrace();
			}
		}
		
		System.out.println("자동화 큐레이션 서비스 종료");
	}
	
}
