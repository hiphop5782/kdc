package com.example.spring06.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.spring06.entity.Book;

//상속을 통해 구조만 구현하면 기본 명령을 모두 제공
public interface BookRepository extends JpaRepository<Book, Long>{
	
}
