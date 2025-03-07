package com.example.spring04.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring04.vo.MemberVO;

@RestController
@RequestMapping("/demo")
public class DemoController {
	
//	HTTP의 통신 방식에는 여러 가지가 있다.
//	- GET - 가장 일반적인 요청 방식이며, 조회 등의 작업을 할 때 사용하는 것을 권장 (@GetMapping)
//	- POST - 데이터를 등록하기 위하여 사용하는 요청 방식 (@PostMapping)
//	- PUT - 데이터를 수정하거나 대체하기 위하여 사용하는 요청 방식 (@PutMapping)
//	- PATCH - 데이터를 부분 수정하기 위해서 사용하는 요청 방식 (@PatchMapping)
//	- DELETE - 데이터를 삭제하기 위한 요청 방식 (@DeleteMapping)
//	- HEAD - 데이터를 본문을 제거한 정보만 주고받는 요청 방식 (X)
//	- OPTIONS - 서버에서 지원하는 처리 방식을 확인하기 위한 요청 방식 (X)
	
//	@RequestMapping으로 주소를 할당하면 위의 모든 방식이 다 허용된다
//	일부러 전부 다 허용한 것이 아니라면 요청 방식을 하나 특정하여 허용하는 것을 권장한다 
	
//	@RequestMapping("/home")
	@GetMapping("/home")//GET 방식의 요청만 허용
	public String home() {
		return "Hello World!";
	}
	
//	@RequestMapping("/test")
	@GetMapping("/test")
	public String test() {
		return "Test Page";
	}
	
//	(ex) 파라미터가 존재하는 요청 매핑의 생성
	@GetMapping("/plus")
	public int plus(@RequestParam int left, @RequestParam int right) {
		return left + right;
	}
	
	@PostMapping("/member")
	public void member(@RequestBody MemberVO memberVO) {
		System.out.println(memberVO);
	}
	
}






