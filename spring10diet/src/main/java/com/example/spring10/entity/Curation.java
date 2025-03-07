package com.example.spring10.entity;

import java.sql.Timestamp;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import lombok.Data;

@Data
@Entity
public class Curation {
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Long no;
	
	@Column(nullable = false)
	private Long target;
	
	@Lob//대용량 데이터
	@Column(nullable = false)
	private String content;
	
	@CreationTimestamp //참고 : @UpdateTimestamp를 사용하면 수정시각이 자동저장
	private Timestamp time;
}
