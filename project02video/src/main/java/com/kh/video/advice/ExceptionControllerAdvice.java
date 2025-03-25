package com.kh.video.advice;

import java.util.NoSuchElementException;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import jakarta.persistence.PersistenceException;

@RestControllerAdvice(annotations = {RestController.class})
public class ExceptionControllerAdvice {
	
	//NoSuchElementException - 조회 대상이 존재하지 않을 경우 발생
	//PersistenceException - 이미 존재하는 항목이 다시 등록되려 할 때
	//Exception - 그 외 나머지 상황
	@ExceptionHandler(NoSuchElementException.class)
	public ResponseEntity<String> notFound() {
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
