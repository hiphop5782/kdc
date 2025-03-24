package com.example.quiz1;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.quiz1.entity.Trainee;
import com.example.quiz1.repository.TraineeRepository;

@SpringBootTest
public class TraineeListTest {

	@Autowired
	private TraineeRepository traineeRepository;
	
	@Test
	public void test() {
		List<Trainee> list = traineeRepository.findAll();
		System.out.println("데이터 개수 : " +list.size());
		for(Trainee trainee : list) {
			System.out.println(trainee);
		}
	}
	
}
