package com.example.spring10.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.spring10.entity.Curation;

public interface CurationRepository extends JpaRepository<Curation, Long>{
	//target을 기반으로 대상을 찾는 처리 메소드
	//findTopByTarget = target을 이용해서 찾은 첫번째 데이터를 반환
	//OrderByNoDesc = 조회결과를 no 역순으로 정렬(최신순)
	Curation findTopByTargetOrderByNoDesc(Long target);
	
	//특정 target에 대한 모든 큐레이션을 최신순으로 정리해서 반환
	List<Curation> findByTargetOrderByNoDesc(Long target);
	Page<Curation> findByTargetOrderByNoDesc(Long target, Pageable pageable);
}
