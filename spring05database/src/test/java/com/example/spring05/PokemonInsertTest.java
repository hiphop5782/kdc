package com.example.spring05;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.spring05.entity.Pokemon;
import com.example.spring05.repository.PokemonRepository;

//테스트 파일
//- 스프링에서 테스트는 JUnit이라는 기술에 기반하여 이루어진다
//- JUnit을 Spring과 연결하기 위한 어댑터 라이브러리로 Spring-Test가 존재
//- 기본적으로 스프링부트 프로젝트에 포함된 라이브러리

@SpringBootTest//테스트에서 스프링 환경을 연동해서 사용할 수 있도록 처리
public class PokemonInsertTest {

	@Autowired//등록된 도구들 중에서 가능한 도구를 찾아 연동해주세요 (DI, 의존성 주입)
	private PokemonRepository pokemonRepository;
	
	@Test//이 메소드가 테스트 메소드임을 명시
	public void test() {
		
		//목표 : 임의의 포켓몬 정보를 생성해서 데이터베이스에 추가할 수 있다.
		Pokemon pokemon = new Pokemon();
		pokemon.setNo(2);
		pokemon.setName("이상해풀");
		pokemon.setType1("풀");
		pokemon.setType2("독");
		
		pokemonRepository.save(pokemon);//저장명령
		System.out.println("등록 완료");
	}
	
}




