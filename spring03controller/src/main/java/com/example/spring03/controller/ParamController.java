package com.example.spring03.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//파라미터를 처리하는 방법
@RestController
@RequestMapping("/param")
public class ParamController {

	//@RequestParam은 주소에 포함된 파라미터를 받는 애노테이션 (생략 가능하지만 작성하는 것을 권장)
	//전달된 데이터를 바로 뒤에 있는 변수에 저장 (없으면 null)
	@RequestMapping("/test1")
	public int test1(@RequestParam int a) {
		return a * a;
	}
	
	//이 매핑에 요청을 보내려면 left, right라는 이름의 파라미터가 필요하다
	//주소?left=OO&right=OO
	@RequestMapping("/plus")
	public int plus(@RequestParam int left, @RequestParam int right) {
		return left + right;
	}
	
}







