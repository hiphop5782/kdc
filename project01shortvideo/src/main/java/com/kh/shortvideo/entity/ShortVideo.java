package com.kh.shortvideo.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data @Entity
public class ShortVideo {
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(length = 200, nullable = false)
	private String title;
	
	@Column(length = 1000, nullable = true)
	private String description;
	
	@Column(length = 255, nullable = false)
	private String url;
	
	@Column(length = 20, nullable = false)
	private String creator;
	
	@CreationTimestamp @Column(nullable = false)
	private LocalDateTime createdAt;
	
	@Column(nullable = false)
	private long views;
}
