package com.example.spring06.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring06.entity.Book;
import com.example.spring06.repository.BookRepository;

import jakarta.persistence.PersistenceException;

@RestController
@RequestMapping("/book")
public class BookController {

	@Autowired
	private BookRepository bookRepository;
	
	@PostMapping("/")//등록
	public void add(@RequestBody Book book) {
		//이미 존재할 경우에 대한 필터링 코드
		if(bookRepository.findById(book.getBookId()).isPresent()) {
			throw new PersistenceException();
		}
		//없으면 저장
		bookRepository.save(book);
	}
	
	@GetMapping("/")//목록
	public List<Book> list() {
		return bookRepository.findAll();
	}
	
	@GetMapping("/{bookId}")//상세 - 경로변수 사용
	public Book find(@PathVariable Long bookId) {
		return bookRepository.findById(bookId).orElseThrow();
	}
	
	@PutMapping("/{bookId}")//전체수정
	public void put(@PathVariable Long bookId, @RequestBody Book book) {
		Book target = bookRepository.findById(bookId).orElseThrow();
		
		target.setBookTitle(book.getBookTitle());
		target.setBookPublisher(book.getBookPublisher());
		target.setBookAuthor(book.getBookAuthor());
		target.setBookPrice(book.getBookPrice());
		target.setBookGenre(book.getBookGenre());
		
		bookRepository.save(target);
	}
	
	@PatchMapping("/{bookId}")//부분수정
	public void patch(@PathVariable Long bookId, @RequestBody Book book) {
		Book target = bookRepository.findById(bookId).orElseThrow();
		
		if(book.getBookTitle() != null)			target.setBookTitle(book.getBookTitle());
		if(book.getBookPublisher() != null) 	target.setBookPublisher(book.getBookPublisher());
		if(book.getBookAuthor() != null)		target.setBookAuthor(book.getBookAuthor());
		if(book.getBookPrice() != null)			target.setBookPrice(book.getBookPrice());
		if(book.getBookGenre() != null) 		target.setBookGenre(book.getBookGenre());
		
		bookRepository.save(target);
	}
	
	@DeleteMapping("/{bookId}")//삭제 - 경로변수 사용
	public void delete(@PathVariable Long bookId) {
		//bookRepository.deleteById(bookId);//성공 여부를 알 수 없음
		
		Book target = bookRepository.findById(bookId).orElseThrow();
		bookRepository.delete(target);
	}
	
}



