package com.example.spring04.controller;

import java.util.List;
import java.util.Random;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//QuizController를 만들고 다음 요청을 처리할 수 있는 매핑을 생성하세요
//(공용주소 : /quiz)

@RestController
@RequestMapping("/quiz")//공용주소는 @RequestMapping으로 설정
public class QuizController {
	
//1. 두 개의 정수 a, b가 전달되었을 때 a부터 b까지 숫자의 합계를 반환
//   요청 주소 : /acc
	@GetMapping("/acc")
	public int acc(@RequestParam int a, @RequestParam int b) {
		int total = 0;
		//a부터 b까지 합계를 계산
		for(int i=a; i <= b; i++) {
			total += i;
		}
		return total;
	}
	
//2. menuList라는 이름으로 여러개의 음식이름이 전달되었을 때 무작위로 한 개의 음식이름을 추첨하여 반환하는 점심메뉴 추천페이지 생성
//   요청 주소 : /lunch
//	(+참고) 같은 이름으로 여러 개의 요청 파라미터가 전달될 경우 배열 또는 리스트 등으로 수신할 수 있다
	@GetMapping("/lunch")
//	public String lunch(@RequestParam String[] menuList) {
	public String lunch(@RequestParam List<String> menuList) {
		Random r = new Random();
		int position = r.nextInt(menuList.size());
		String menu = menuList.get(position);
		return menu;
	}
	
}


