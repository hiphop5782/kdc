package com.example.spring07;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.spring07.entity.People;
import com.example.spring07.repository.PeopleRepository;

import net.datafaker.Faker;

@SpringBootTest
public class PeopleInsertTest {
	
	@Autowired
	private PeopleRepository peopleRepository;
	
	@Test
	public void test() {
		//save로 1개씩 or saveAll로 한번에
		List<People> list = new ArrayList<>();
		
		Faker faker = new Faker(Locale.KOREA);
		
		for(int i=0; i < 1000; i++) {
			People people = new People();
			people.setName(faker.name().fullName().replace(" ", ""));
			people.setMbti(faker.mbti().type());
			people.setColor(faker.color().name());
			people.setIdol(faker.kpop().iiiGroups());
			list.add(people);
		}
		
		peopleRepository.saveAll(list);
	}
	
}



