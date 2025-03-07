package com.example.spring10.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring10.entity.Curation;
import com.example.spring10.repository.CurationRepository;

@RestController
@RequestMapping("/curation")
public class CurationController {

	@Autowired
	private CurationRepository curationRepository;
	
	//오직 상세조회(회원 no를 기반으로 한)만 필요
	@GetMapping("/{target}")
	public Curation find(@PathVariable long target) {
		//return curationRepository.findById(target).orElseThrow();//잘못된 방법(target이 ID가 아님)
		return curationRepository.findTopByTargetOrderByNoDesc(target);
	}
	
}
