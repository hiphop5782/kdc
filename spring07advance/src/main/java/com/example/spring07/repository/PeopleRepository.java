package com.example.spring07.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.spring07.entity.People;

public interface PeopleRepository extends JpaRepository<People, Long>{

	//추가 메소드를 생성하여 원하는 작업이 처리되도록 구현
	//- 단, 아무렇게나 만드는 것이 아니라 이름의 규칙을 지켜서 구현하면 구문을 자동 생성해 준다(네이밍 메소드)
	//- 혹은 JPQL이라는 구문을 직접 생성하는 방법도 존재
	
	//찾고자 하는 항목이 있다면 find + by + 항목명을 이용하여 메소드 이름을 작명(여러개라면 And 혹은 Or로 연결)
	
	//List<People> findAll();
	List<People> findByName(String name);//이름이 일치하는 데이터를 조회
	List<People> findByNameAndColor(String name, String color);//이름과 색상이 일치하는 데이터 조회
	
	//일부분만 같아도 조회가 되는 명령(StartingWith, EndingWith, Containing)
	List<People> findByNameStartingWith(String name);//name으로 이름이 시작하는 데이터 조회 
	
	//숫자 구간 조회(no)
	List<People> findByNoBetween(int start, int end);
	
	
	//네이밍 메소드로 규칙에 맞게 만든 구문들은 전부다 Pageable을 추가 매개변수로 가질 수 있다(페이징은 기본 제공)
	Page<People> findByNameStartingWith(String name, Pageable pageable);
}








