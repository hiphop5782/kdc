package com.example.spring05;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.spring05.entity.Pokemon;
import com.example.spring05.repository.PokemonRepository;

@SpringBootTest
public class PokemonEditTest {

	@Autowired
	private PokemonRepository pokemonRepository;
	
	@Test
	public void test() {
		//포켓몬스터의 번호를 제외한 다른 정보를 수정
		
		//정보 준비
		Pokemon pokemon = new Pokemon();
		pokemon.setNo(1);//변경할 몬스터 번호
		pokemon.setName("테스트");//몬스터의 변경될 이름
		pokemon.setType1("불");//몬스터의 변경될 속성1
		pokemon.setType2("비행");//몬스터의 변경될 속성2
		
		//번호를 이용하여 정보를 조회
		Pokemon target = pokemonRepository.findById(pokemon.getNo()).orElseThrow();
		
		//target의 정보를 변환하고
		target.setName(pokemon.getName());//이름 복사(pokemon → target)
		target.setType1(pokemon.getType1());//속성1 복사(pokemon → target)
		target.setType2(pokemon.getType2());//속성2 복사(pokemon → target)
		
		//target을 저장 (등록과 명령이 같지만 이미 데이터베이스에는 동일한 번호(no)를 가진 몬스터가 존재)
		//pokemonRepository.save(pokemon);//번호가 같기 때문에 가능
		pokemonRepository.save(target);//코드를 개선하여 일부 항목만 수정할 수도 있음(확장성이 좋다)
	}
	
}
