package com.example.spring03.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dummy")//이 컨트롤러의 모든 매핑에 /dummy가 앞부분에 추가된다
public class DummyController {
	
	@RequestMapping("/home")
	public String home() {
		return "dummy home";
	}
	
}
