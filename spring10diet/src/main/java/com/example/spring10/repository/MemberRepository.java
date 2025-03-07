package com.example.spring10.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.spring10.entity.Member;

public interface MemberRepository extends JpaRepository<Member, Long>{
	//추가 기능이 필요하다면 네이밍 메소드를 생성
}
