package com.example.spring05.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.spring05.entity.Pokemon;

//Pokemon 엔티티를 이용하여 데이터베이스 작업을 처리하기 위한 도구
//JpaRepository를 상속받아서 JPA에서 제공하는 대부분의 기능을 사용
//JpaRepository<T, ID>에서 T는 제어할 개체의 이름을 말하고 ID는 개체 내부에 있는 @ID의 형태를 말함
//JpaRepository를 상속받은 클래스들은 자동으로 스캔되어 등록된다(JpaRepositoriesAutoConfiguration)
public interface PokemonRepository extends JpaRepository<Pokemon, Integer>{
	//기본적인 명령들은 모두 상속받아져 있으며 필요하다면 추가 메소드를 구현하여 명령을 만들 수 있다
}
