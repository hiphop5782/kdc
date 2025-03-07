package com.example.spring05;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.spring05.entity.Pokemon;
import com.example.spring05.repository.PokemonRepository;

//번호를 이용하여 포켓몬스터 한마리의 정보를 불러오는 테스트
@SpringBootTest
public class PokemonFindTest {

	@Autowired
	private PokemonRepository pokemonRepository;
	
	@Test
	public void test() {
		//JPA에서는 @Id로 선언된 항목으로 정보를 불러오는 메소드를 제공
		//- findById()를 사용
		//- Optional이란 데이터가 없을 수도 있는 상황을 쉽게 처리하도록 나온 도구(Java 8+)
		
		int no = 2;
		
		//Optional<Pokemon> result = pokemonRepository.findById(no);
		//Pokemon pokemon = result.get();//그냥 추출(없으면 null)
		//Pokemon pokemon = result.orElse(new Pokemon());//없을 경우에는 빈 객체를 반환 (없을 경우 기본값 설정)
		//Pokemon pokemon = result.orElseThrow();//없으면 예외를 발생시킴
		
		//no를 이용하여 정보를 찾고 없으면 예외를 발생시키고 있으면 pokemon에 넣으세요!
		Pokemon pokemon = pokemonRepository.findById(no).orElseThrow();
		System.out.println(pokemon);
	}
	
}




