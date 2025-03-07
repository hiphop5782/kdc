package com.example.spring10.vo;

import java.time.LocalDateTime;

import lombok.Data;

//인공지능 서비스 응답을 위한 정보 객체
@Data
public class PromptResponseVO {
	private String content;
	private LocalDateTime time;
}
