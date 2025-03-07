package com.example.spring08.repository;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.spring08.entity.Weather;

public interface WeatherRepository extends JpaRepository<Weather, Long>{

	List<Weather> findByNxAndNyAndBaseDate(
					int nx, int ny, String baseDate,Pageable pageable);

}
