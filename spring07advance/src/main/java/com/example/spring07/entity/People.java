package com.example.spring07.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class People {
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Long no;
	@Column(nullable = false)
	private String name;
	@Column
	private String mbti;
	@Column
	private String color;
	@Column
	private String idol;
}
