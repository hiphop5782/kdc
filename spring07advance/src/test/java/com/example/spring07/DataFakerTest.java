package com.example.spring07;

import java.util.Locale;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import net.datafaker.Faker;

@SpringBootTest
public class DataFakerTest {

	@Test
	public void test() {
		//faker 인스턴스 생성
		Faker faker = new Faker(Locale.KOREA);
		
		System.out.println(faker.name().fullName().replace(" ", ""));
		System.out.println(faker.mbti().type());
		System.out.println(faker.color().name());
		System.out.println(faker.kpop().iiiGroups());
	}
	
}
