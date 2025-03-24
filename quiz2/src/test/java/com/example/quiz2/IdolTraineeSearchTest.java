package com.example.quiz2;

import java.util.Scanner;

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
public class IdolTraineeSearchTest {

	@Autowired
	private IdolTraineeRepository idolTraineeRepository;
	
	@Test
	public void test() {
		Scanner sc = new Scanner(System.in);
		System.out.print("키워드 : ");
		String keyword = sc.nextLine();
		sc.close();
		
		Sort sort = Sort.by(Order.asc("period"), Order.asc("no"));
		Pageable pageable = PageRequest.of(0, 10, sort);
		Page<IdolTrainee> result = idolTraineeRepository.findByNameContaining(keyword, pageable);
		System.out.print("조회 결과 : " + result.getPageable().getPageNumber() + " of " + result.getTotalPages() + " page");
		System.out.println("(총 "+result.getTotalElements()+"개의 데이터)");
		for(IdolTrainee idolTrainee : result.getContent()) {
			System.out.println(idolTrainee);
		}		
	}
	
}
