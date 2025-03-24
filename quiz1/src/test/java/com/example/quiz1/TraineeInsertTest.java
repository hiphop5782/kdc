package com.example.quiz1;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.quiz1.entity.Trainee;
import com.example.quiz1.repository.TraineeRepository;

@SpringBootTest
public class TraineeInsertTest {
	
	@Autowired
	private TraineeRepository traineeRepository;
	
	@Test
	public void test() {
		traineeRepository.save(Trainee.builder()
					.name("김루나").age(16).gender("F").speicality("댄스")
			.build());
		traineeRepository.save(Trainee.builder()
				.name("홍현석").age(17).gender("M").speicality("연기")
			.build());
		traineeRepository.save(Trainee.builder()
				.name("박정식").age(15).gender("M").speicality("댄스")
			.build());
		traineeRepository.save(Trainee.builder()
				.name("김윤아").age(14).gender("F").speicality("댄스")
			.build());
		traineeRepository.save(Trainee.builder()
				.name("최태현").age(14).gender("M").speicality("연기")
			.build());
	}
}


