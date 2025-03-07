package com.example.spring08.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity @Data
public class Weather {
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column
	private String baseDate;
	
	@Column
	private String baseTime;
	
	@Column
	private int nx, ny;
	
	@Column
	private double humidity;
	
	@Column
	private double temperature;
}
