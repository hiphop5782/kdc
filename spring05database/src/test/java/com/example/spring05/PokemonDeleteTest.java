package com.example.spring05;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.spring05.entity.Pokemon;
import com.example.spring05.repository.PokemonRepository;

@SpringBootTest
public class PokemonDeleteTest {

	@Autowired
	private PokemonRepository pokemonRepository;
	
	@Test
	public void test() {
		//데이터 삭제는 ID를 이용하여 하나만 삭제하거나 전체삭제
		//- 전체 삭제는 할 일이 많지 않음
		//- ID는 @Id로 지정된 항목을 사용
		//- 지워지든 안지워지든 코드는 실행된다
		int no = 1;
		//pokemonRepository.deleteById(no);
		Pokemon target = pokemonRepository.findById(no).orElseThrow();
		pokemonRepository.delete(target);
	}
	
}
