package com.example.spring10;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling//이 애노테이션을 써야 스케쥴러가 작동한다
@SpringBootApplication
public class Spring10dietApplication {

	public static void main(String[] args) {
		SpringApplication.run(Spring10dietApplication.class, args);
	}

}
