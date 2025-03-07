package com.example.spring07.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring07.entity.People;
import com.example.spring07.repository.PeopleRepository;

@RestController
@RequestMapping("/people")
public class PeopleController {
	
	@Autowired
	private PeopleRepository peopleRepository;
	
	//전체 조회
	@GetMapping("/")
	public List<People> list() {
		return peopleRepository.findAll();
	}
	
	//분할 조회 - page번호, page크기, 정렬방식
	@GetMapping("/page/{pageNo}")
	public Page<People> listByPaging(@PathVariable int pageNo) {
		int pageSize = 10;
		
		Pageable pageable = PageRequest.of(pageNo-1, pageSize, Sort.by("no").ascending());
		return peopleRepository.findAll(pageable);
	}
	
	@GetMapping("/page/{pageNo}/size/{pageSize}")
	public Page<People> listByPaging(@PathVariable int pageNo, @PathVariable int pageSize) {
		Pageable pageable = PageRequest.of(pageNo-1, pageSize, Sort.by("no").ascending());
		return peopleRepository.findAll(pageable);
	}
	
	@GetMapping("/page/{pageNo}/size/{pageSize}/order/{pageOrder}")
	public Page<People> listByPaging(@PathVariable int pageNo, 
				@PathVariable int pageSize, @PathVariable String pageOrder) {
		//pageOrder가 "name asc"와 같은 형태라면 직접 분할해서 Sort 인스턴스를 생성
		String column = pageOrder.split("\\s+")[0];
		String order = pageOrder.split("\\s+")[1];
		
		Sort sort;
		if(order.equalsIgnoreCase("asc")) {
			sort = Sort.by(Sort.Order.asc(column));
		}
		else {
			sort = Sort.by(Sort.Order.desc(column));
		}
		
		Pageable pageable = PageRequest.of(pageNo-1, pageSize, sort);
		return peopleRepository.findAll(pageable);
	}
	
	//이름 검색(자동완성에서 쓰일 시작검사)
	@GetMapping("/name/{name}")
	public List<People> findName(@PathVariable String name) {
		return peopleRepository.findByNameStartingWith(name);
	}
	
	@GetMapping("/name/{name}/page/{page}")
	public Page<People> findName(@PathVariable String name, @PathVariable int page) {
		Sort sort = Sort.by(Sort.Order.asc("name"), Sort.Order.asc("no"));
		Pageable pageable = PageRequest.of(page-1, 10, sort);
		return peopleRepository.findByNameStartingWith(name, pageable);
	}
	
}







