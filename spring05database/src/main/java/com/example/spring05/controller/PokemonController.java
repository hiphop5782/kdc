package com.example.spring05.controller;

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

import com.example.spring05.entity.Pokemon;
import com.example.spring05.repository.PokemonRepository;

import jakarta.persistence.PersistenceException;

@RestController
@RequestMapping("/pokemon")
public class PokemonController {
	
	//(중요) 
	//이미 만들어놓은 JPA Repository를 이 곳에서 사용할 수 있도록 연결해주세요(의존성 주입 : DI, Dependency Injection)
	//연결할 대상이 모두 등록되어 있어야 한다
	@Autowired
	private PokemonRepository pokemonRepository;
	
	//주소를 분배하는 방식
	//- 같은 주소에 같은 전송방식이 두 개 이상이면 에러가 발생
	//- 한 주소에 다섯 가지의 매핑을 설정할 수 있다
	//- 주소에 기능에 대한 내용을 작성하지 말고 오로지 자원에 대한 내용만 적고 방식으로 구분하는 것을 권장
	//- 등록(@PostMapping), 조회(@GetMapping), 수정(@PutMapping/@PatchMapping), 삭제(@DeleteMapping)
	
	@PostMapping("/")
	public void insert(@RequestBody Pokemon pokemon) {
		//조회 후 있으면 등록을 멈추고 예외를 발생시킨다
		if(pokemonRepository.findById(pokemon.getNo()).isPresent()) {//해당 번호의 데이터가 있다면
			throw new PersistenceException("이미 존재하는 데이터");
		}
		//존재하지 않는다면 저장 처리
		pokemonRepository.save(pokemon);
	}
	
	//목록
	@GetMapping("/")
	public List<Pokemon> list() {
		return pokemonRepository.findAll();
	}
	
	//상세조회
	//- 목록과 주소가 겹치지 않도록 주소에 번호를 넣어서 주소에 변수가 존재하는 형태로 처리 (경로변수, PathVariable)
	//- /pokemon/1은 /pokemon/?no=1과 같은 의미를 가지나 목록과 구분되는 주소 형태이다.
	@GetMapping("/{no}")
	public Pokemon find(@PathVariable int no) {
		return pokemonRepository.findById(no).orElseThrow();
	}
	
	//수정
	// - PutMapping은 데이터를 덮어쓰기할 때 사용 (경로변수로 ID를 전달)
	// - PatchMapping은 데이터의 일부분을 교체할 때 사용 (경로변수로 ID를 전달)
	// - 예제에서는 ID 항목인 no를 제외한 나머지 요소를 수정하도록 구현
	@PutMapping("/{no}")
	public void edit(@PathVariable int no, @RequestBody Pokemon pokemon) {
		Pokemon target = pokemonRepository.findById(no).orElseThrow();
		
		target.setName(pokemon.getName());
		target.setType1(pokemon.getType1());
		target.setType2(pokemon.getType2());
		
		pokemonRepository.save(target);
	}
	
	@PatchMapping("/{no}")
	public void patch(@PathVariable int no, @RequestBody Pokemon pokemon) {
		Pokemon target = pokemonRepository.findById(no).orElseThrow();
		
		if(pokemon.getName() != null)//이름이 존재한다면
			target.setName(pokemon.getName());//변경하세요
		if(pokemon.getType1() != null)//속성1이 존재한다면
			target.setType1(pokemon.getType1());//변경하세요
		if(pokemon.getType2() != null)//속성2가 존재한다면
			target.setType2(pokemon.getType2());//변경하세요
		
		pokemonRepository.save(target);
	}
	
	
	//삭제
	//- 다 지울것이 아니라 하나만 지울 것이므로  @Id 항목을 사용하여 삭제
	//- deleteById()에 들어갈 값을 하나 구해야 한다
	//- 조회하여 존재할 경우 해당 엔티티로 삭제도 가능
	//- 데이터는 "경로변수"로 전달받아 처리
	@DeleteMapping("/{no}")
	public void delete(@PathVariable int no) {
		Pokemon target = pokemonRepository.findById(no).orElseThrow();
		pokemonRepository.delete(target);
		//pokemonRepository.deleteById(no);
	}
}


















