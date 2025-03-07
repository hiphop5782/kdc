package com.example.spring08.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring08.entity.Weather;
import com.example.spring08.repository.WeatherRepository;
import com.example.spring08.vo.WeatherSearchVO;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.ExampleObject;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;

//SpringDoc에 표시될 정보를 변경하도록 설정
@Tag(name = "날씨 정보 조회 도구")

@RestController
@RequestMapping("/weather")
public class WeatherController {

	@Autowired
	private WeatherRepository weatherRepository;
	
	
	//문서에 표시될 정보에 대한 설정
	@Operation(
		description = "위치와 날짜를 이용하여 날씨 정보를 조회합니다",
		responses = {//예상 가능한 응답코드에 대해 안내
			@ApiResponse(
				responseCode = "200",
				description = "조회 완료",
				content = @Content(
					mediaType = "application/json",
					array = @ArraySchema(//결과가 배열(List)일 경우
						schema = @Schema(implementation = Weather.class)
					)
				)
			),
			@ApiResponse(
				responseCode = "500",
				description = "서버 내부 오류",
				content = @Content(
					mediaType = "text/plain",//결과 메세지의 형태(MIME-TYPE)
					schema = @Schema(implementation = String.class),//자료형
					examples = @ExampleObject("server error")//예시
				)
			)
		}
	)
	
	@GetMapping("/nx/{nx}/ny/{ny}/baseDate/{baseDate}")
	public List<Weather> list(@PathVariable int nx, @PathVariable int ny,@PathVariable String baseDate) {
	//public List<Weather> list(@ModelAttribute WeatherSearchVO vo){
		Pageable pageable = PageRequest.of(0, 50, Sort.by("id").ascending());
		return weatherRepository.findByNxAndNyAndBaseDate(nx, ny, baseDate, pageable);
	}
	
	
	@Operation(
			description = "위치와 날짜를 이용하여 날씨 정보를 조회합니다",
			responses = {//예상 가능한 응답코드에 대해 안내
				@ApiResponse(
					responseCode = "200",
					description = "조회 완료",
					content = @Content(
						mediaType = "application/json",
						array = @ArraySchema(//결과가 배열(List)일 경우
							schema = @Schema(implementation = Weather.class)
						)
					)
				),
				@ApiResponse(
					responseCode = "500",
					description = "서버 내부 오류",
					content = @Content(
						mediaType = "text/plain",//결과 메세지의 형태(MIME-TYPE)
						schema = @Schema(implementation = String.class),//자료형
						examples = @ExampleObject("server error")//예시
					)
				)
			}
		)
	
	//원래 PostMapping에서 /는 등록 주소이므로 중복이 발생할 염려가 있다면 다른 주소를 써야 한다
	//RESTful한 주소에서는 기능을 적지 않는 것이 	원칙이지만 중복을 피하기 위해서 적는 경우도 더러 있다
	@PostMapping("/search")
	public List<Weather> list(@RequestBody WeatherSearchVO vo) {
		Pageable pageable = PageRequest.of(0, 50, Sort.by("id").ascending());
		return weatherRepository.findByNxAndNyAndBaseDate(
									vo.getNx(), vo.getNy(), vo.getBaseDate(), pageable);
	}
}





