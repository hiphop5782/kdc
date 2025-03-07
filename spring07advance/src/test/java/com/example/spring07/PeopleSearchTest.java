package com.example.spring07;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.example.spring07.entity.People;
import com.example.spring07.repository.PeopleRepository;

@SpringBootTest
public class PeopleSearchTest {

	@Autowired
	private PeopleRepository peopleRepository;
	
//	@Test
	public void test() {
		//(Q) 강씨 성을 가진 학생들을 조회?
		//1. 전체를 조회한 뒤 List를 필터링하여 원하는 데이터를 탐색 (findAll 사용)
		//2. 조회를 원하는 조건에 맞게 수행하도록 처리 (커스텀 메소드 생성)
		
		//(ex) "강수빈" 데이터 조회
		//List<People> list = peopleRepository.findByName("강수빈");
		
		//(ex) "파랑색"을 좋아하는 "강수빈" 데이터 조회
		//List<People> list = peopleRepository.findByNameAndColor("강수빈", "파랑색");
		
		//(ex) "강"씨 성을 가진 데이터 조회
		//List<People> list = peopleRepository.findByNameStartingWith("강");
		
		//(ex) 51번부터 100번까지 데이터 조회
		List<People> list = peopleRepository.findByNoBetween(51, 100);
		System.out.println("결과 수 : " + list.size());
		for(People p : list) {
			System.out.println(p);
		}
	}
	
	@Test
	public void test2() {
		Sort sort = Sort.by(Sort.Order.asc("name"), Sort.Order.asc("no"));
		Pageable pageable = PageRequest.of(0, 10, sort);
		Page<People> result = peopleRepository.findByNameStartingWith("강", pageable);
		//result에서 추출 가능한 정보들 확인
		System.out.println("총 페이지 수 = " + result.getTotalPages());
		System.out.println("총 데이터 수 = " + result.getTotalElements());
		System.out.println("현재 페이지 번호 = " + result.getNumber());
		System.out.println("페이지 당 데이터 개수 = " + result.getSize());
		System.out.println("다음 페이지 유무 = " + result.hasNext());
		System.out.println("이전 페이지 유무 = " + result.hasPrevious());
		
		List<People> list = result.getContent();
		for(People p : list) {
			System.out.println(p);
		}
	}
	
}
