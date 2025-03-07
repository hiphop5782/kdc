package com.example.spring08.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

//프로젝트의 설정 중에서 프로그래밍적인 요소가 필요할 경우 생성하는 파일(application.properties의 보충파일)
@Configuration//등록
public class SpringDocConfiguration {
	
	@Bean//하단 메소드에서 생성되는 결과물은 스프링에 등록됨
	public OpenAPI api() {
		//정보 생성
		Info info = new Info();
		info.setVersion("v0.0.1");
		info.setTitle("지역별 날씨 조회 API");
		info.setDescription("Front-End에서 날씨 정보가 필요할 경우 조회할 수 있는 데이터에 대한 문서입니다");
		
		OpenAPI api = new OpenAPI();
		api.setInfo(info);//정보 설정
		
		return api;
	}

}
