package com.example.quiz1.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @Builder @NoArgsConstructor @AllArgsConstructor
@Entity
public class Trainee {
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Long no;
	@Column
	private String name;
	@Column
	private int age;
	@Column
	private String gender;
	@Column
	private String speicality;
}
