package com.example.spring03.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//스프링은 사용할 도구들을 모두 "등록"하도록 권장한다
//등록하려면 애노테이션(Annotation)을 사용해야 하며 용도에 맞는 애노테이션을 사용해야 한다
//@RestController는 사용자의 요청(request)을 받아 처리한 응답(response)을 보여줄 수 있는 도구
//같은 주소가 두 개 있으면 서버가 중지되므로 컨트롤러마다 공용 주소를 둬서 충돌을 예방할 수 있다

@RestController
@RequestMapping("/demo")//이 컨트롤러의 모든 주소에는 /demo가 앞에 붙는다
public class DemoController {
	
	//페이지마다 처리할 수 있는 고유의 메소드를 생성해야 한다
	//@RequestMapping 이라는 애노테이션으로 주소를 부여해야 한다
	@RequestMapping("/home")
	public String home() {
		return "Welcome Spring Boot";
	}
	
	@RequestMapping("/test")//사용자가 /test라는 주소로 들어온다면
	public String test() {
		return "Test Page";//다음 문구를 사용자에게 전송하세요
	}
	
}
