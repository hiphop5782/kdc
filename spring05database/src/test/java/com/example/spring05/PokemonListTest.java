package com.example.spring05;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.spring05.entity.Pokemon;
import com.example.spring05.repository.PokemonRepository;

@SpringBootTest
public class PokemonListTest {

	@Autowired
	private PokemonRepository pokemonRepository;
	
	@Test
	public void test() {
		//포켓몬 조회 테스트
		//- 이 프로그램에서 포켓몬 한 마리를 Pokemon 클래스로 정의해 두었다.
		//- 조회를 하면 포켓몬 여러 마리의 정보가 나온다.
		//- 프로그램에서 조회 결과를 List<Pokemon> 이라 표현한다.
		
		List<Pokemon> list = pokemonRepository.findAll();
		System.out.println("데이터 개수 : " + list.size());
		
		for(Pokemon pokemon : list) {
			System.out.println(pokemon);
		}
		
	}
	
}
