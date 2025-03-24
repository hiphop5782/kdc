package com.example.quiz2;

import java.util.Locale;
import java.util.Random;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.quiz2.entity.IdolTrainee;
import com.example.quiz2.repository.IdolTraineeRepository;

import net.datafaker.Faker;

@SpringBootTest
public class IdolTraineeInsertTest {

	@Autowired
	private IdolTraineeRepository idolTraineeRepository;
	
	@Test
	public void test() {
		//DataFaker 인스턴스 생성
		Faker kor = new Faker(Locale.KOREA);
		Faker eng = new Faker(Locale.ENGLISH);
		Random r = new Random();
		
		for(int i=0; i < 1000; i++) {
			idolTraineeRepository.save(IdolTrainee.builder()
						.name(kor.name().fullName())
						.nickname(eng.name().firstName())
						.period(r.nextInt(10) + 1)
						.wannabe(kor.kpop().iiiGroups())
					.build());
		}
	}
	
}
