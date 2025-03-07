package com.example.spring08;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling//이 애노테이션을 써야 스케쥴러가 작동한다
@SpringBootApplication
public class Spring08publicdataApplication {

	public static void main(String[] args) {
		SpringApplication.run(Spring08publicdataApplication.class, args);
	}

}
