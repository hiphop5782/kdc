package com.example.spring06.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Data//Setter+Getter+ToString+EqualsAndHashCode
//@Setter @Getter @ToString
public class Book {
	@Id
	private Long bookId;
	@Column(length = 300, nullable = false)
	private String bookTitle;
	@Column(length = 90)
	private String bookPublisher;
	@Column(length = 90)
	private String bookAuthor;
	@Column(nullable = false)
	private Integer bookPrice;
	@Column(length = 12, nullable = false)
	private String bookGenre;
}
