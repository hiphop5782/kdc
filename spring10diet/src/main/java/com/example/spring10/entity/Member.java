package com.example.spring10.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Member {
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Long no;//회원의 고유번호(자동생성)
	
	@Column(nullable = false)
	private String name;//회원의 이름
	@Column(nullable = false)
	private String nationality;//회원의 국적
	@Column(nullable = false)
	private Float height;//회원의 신장(cm)
	@Column(nullable = false)
	private Float weight;//체중(kg)
	@Column(nullable = false, length = 1)
	private String gender;//성별(M/F)
}
