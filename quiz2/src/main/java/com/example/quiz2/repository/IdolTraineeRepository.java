package com.example.quiz2.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.quiz2.entity.IdolTrainee;

public interface IdolTraineeRepository extends JpaRepository<IdolTrainee, Long>{
	public Page<IdolTrainee> findByNameContaining(String name, Pageable pageable);
}
