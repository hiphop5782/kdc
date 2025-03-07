package com.example.spring10.advice;

import java.util.NoSuchElementException;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import jakarta.persistence.PersistenceException;

//BookController 뿐 아니라 여러 컨트롤러에서 발생하는 문제 상황에 대한 메세지를 정의
//스프링에서 제공하는 간섭 도구(작업에 변화를 일으킬 수 있다. AOP, Aspect Oriented Programming)
//@RestControllerAdvice(basePackages = {"com.example.spring10.controller"})
@RestControllerAdvice(annotations = {RestController.class})
public class ExceptionControllerAdvice {
	
	//NoSuchElementException - 조회 대상이 존재하지 않을 경우 발생
	//PersistenceException - 이미 존재하는 항목이 다시 등록되려 할 때
	//Exception - 그 외 나머지 상황
	
	//메세지와 상태를 같이 반환하기 위해서 반환형을 ResponseEntity로 설정한다
	//상태와 메세지를 같이 포함시켜서 인스턴스를 만들어 반환하면 스프링이 그에 맞게 처리를 해준다
	
	//사용자에게 보내는 메세지와는 별개로 서버에는 에러와 관련된 기록을 남겨야 한다.
	//@ExceptionHandler에서는 매개변수에 예외정보를 전달받을 수 있으며 이를 이용하여 stack trace를 출력한다.
	
	@ExceptionHandler(NoSuchElementException.class)
	public ResponseEntity<String> notFound() {
		//return ResponseEntity.status(상태번호).build();
		return ResponseEntity.status(404).build();//사용자에게 상태코드 404를 전달하세요
	}
	@ExceptionHandler(PersistenceException.class)
	public ResponseEntity<String> duplicateError(PersistenceException e) {
		e.printStackTrace();//서버에 추적 기록을 출력
		return ResponseEntity.status(500).body("duplicate key");//사용자에게 상태코드 500과 메세지를 전달하세요
	}
	@ExceptionHandler(Exception.class)
	public ResponseEntity<String> etc(Exception e) {
		e.printStackTrace();//서버에 추적 기록을 출력
		return ResponseEntity.status(500).body("server error");//사용자에게 상태코드 500과 메세지를 전달하세요
	}
	
}
