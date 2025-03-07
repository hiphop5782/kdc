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
public class PeopleListTest {

	@Autowired
	private PeopleRepository peopleRepository;
	
	@Test
	public void test() {
		//조회
		//List<People> list = peopleRepository.findAll();//전체조회
		
		//Pageable pageable = PageRequest.of(0, 10);//0페이지 10개씩(페이지가 0부터 시작)
		//Pageable pageable = PageRequest.of(0, 10, Sort.by("name").ascending());//이름순 0페이지 (10개씩)
		
		Sort sort = Sort.by(
			Sort.Order.asc("name"), 
			Sort.Order.asc("no")
		);
		Pageable pageable = PageRequest.of(0, 10, sort);//이름순+번호순 0페이지 (10개씩)
		Page<People> result = peopleRepository.findAll(pageable);//페이지 분할 조회
		
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
