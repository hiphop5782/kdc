package com.example.spring03.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController//사용자가 접속 가능한 도구로 등록해주세요! (IoC : 제어 반전)
@RequestMapping("/quiz")//이 컨트롤러의 모든 매핑에 공용주소 /quiz를 추가하세요 (주소 충돌 방지)
public class QuizController {
	
	@RequestMapping("/dice")
	public int dice() {
		Random r = new Random();
		int number = r.nextInt(6) + 1;
		return number;
	}
	
	@RequestMapping("/lotto")
	public int lotto() {
		Random r = new Random();
		int number = r.nextInt(45) + 1;
		return number;
	}
	
	//(+추가) 로또번호 6개를 추첨
	@RequestMapping("/lottoNumbers")
	public List<Integer> lottoNumber() {
		List<Integer> base = new ArrayList<>();
		for(int i=1; i <= 45; i++) {
			base.add(i);
		}
		Collections.shuffle(base);
		return base.subList(0, 6);//base에서 0부터 6 전까지 잘라서 반환
	}
	
	//(Q) 사용자의 출생년도 4자리를 전달받아 지하철 요금을 계산하여 출력
	//(+추가) 출생년도가 전달되지 않는다면 성인요금을 출력
	// - 8세미만 : 무료
	// - 8세~14세미만 : 500원
	// - 14세~20세미만 : 1000원
	// - 20세~65세미만 : 1500원
	// - 65세이상 : 무료
	
	//@RequestParam에 옵션을 부여해서 값이 없는 경우를 처리하거나 대체할 수 있다
	//- required를 통해 필수인지 설정할 수 있으나, 필수가 아닌 경우 없으면 null이므로 주의해야 한다
	//- int는 null을 저장할 수 없으므로 Integer로 변환하거나, defaultValue 옵션을 줘서 기본값을 설정
	
	@RequestMapping("/subway")
	//public int subway(@RequestParam(required = false, defaultValue = "2005") int year) {
	public int subway(@RequestParam(required = false) Integer year) {
		if(year == null) 				return 1500;
		
		int age = LocalDate.now().getYear() - year + 1;
		if(age < 8 || age >= 65) 	return 0;
		else if(age < 14) 				return 500;
		else if(age < 20) 				return 1000;
		else									return 1500;
	}
	
}





