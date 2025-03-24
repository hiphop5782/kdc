package com.example.quiz2;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Order;

import com.example.quiz2.entity.IdolTrainee;
import com.example.quiz2.repository.IdolTraineeRepository;

@SpringBootTest
public class IdolTraineeListTest {
	@Autowired
	private IdolTraineeRepository idolTraineeRepository;
	
	@Test
	public void test() {
		Sort sort = Sort.by(Order.asc("period"), Order.asc("no"));
		Pageable pageable = PageRequest.of(0, 10, sort);
		Page<IdolTrainee> result = idolTraineeRepository.findAll(pageable);
		System.out.print("조회 결과 : " + (result.getPageable().getPageNumber()+1) + " of " + result.getTotalPages() + " page");
		System.out.println("(총 "+result.getTotalElements()+"개의 데이터, "+result.getSize()+"개씩 표시)");
		for(IdolTrainee idolTrainee : result.getContent()) {
			System.out.println(idolTrainee);
		}
	}
}
