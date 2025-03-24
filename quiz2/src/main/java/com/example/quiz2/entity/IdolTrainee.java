package com.example.quiz2.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @Builder @NoArgsConstructor @AllArgsConstructor
public class IdolTrainee {
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Long no;
	@Column
	private String name;
	@Column
	private String nickname;
	@Column
	private int period;
	@Column
	private String wannabe;
}
