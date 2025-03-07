package com.example.spring10.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring10.entity.Member;
import com.example.spring10.repository.MemberRepository;

@RestController
@RequestMapping("/member")
public class MemberController {

	@Autowired
	private MemberRepository memberRepository;
	
	//CRUD 구현을 위한 매핑 생성
	@PostMapping("/")
	public void insert(@RequestBody Member member) {
		member.setNo(null);
		memberRepository.save(member);
	}
	
	@GetMapping("/")
	public List<Member> listAll() {
		return memberRepository.findAll();
	}
	@GetMapping("/page/{page}/size/{size}")
	public Page<Member> listAllByPaging(@PathVariable int page, @PathVariable int size) {
		Pageable pageable = PageRequest.of(page-1, size, Sort.by("no").ascending());
		return memberRepository.findAll(pageable);
	}
	@GetMapping("/no/{no}")
	public Member find(@PathVariable long no) {
		return memberRepository.findById(no).orElseThrow();
	}
	
	@PutMapping("/{no}")
	public void editAll(@PathVariable long no, @RequestBody Member member) {
		//대상 탐색
		Member target = memberRepository.findById(no).orElseThrow();
		//정보 복사
		target.setName(member.getName());
		target.setNationality(member.getNationality());
		target.setHeight(member.getHeight());
		target.setWeight(member.getWeight());
		target.setGender(member.getGender());
		//변경 요청
		memberRepository.save(target);
	}
	@PatchMapping("/{no}")
	public void editField(@PathVariable long no, @RequestBody Member member) {
		//대상 탐색
		Member target = memberRepository.findById(no).orElseThrow();
		//정보 복사(단, 있으면)
		if(member.getName() != null)			target.setName(member.getName());
		if(member.getNationality() != null) 	target.setNationality(member.getNationality());
		if(member.getHeight() != null)			target.setHeight(member.getHeight());
		if(member.getWeight() != null) 			target.setWeight(member.getWeight());
		if(member.getGender() != null) 		target.setGender(member.getGender());
		//변경 요청
		memberRepository.save(target);
	}
	
	@DeleteMapping("/{no}")
	public void delete(@PathVariable long no) {
		Member target = memberRepository.findById(no).orElseThrow();
		memberRepository.delete(target);
		//memberRepository.deleteById(no);
	}
	
}



