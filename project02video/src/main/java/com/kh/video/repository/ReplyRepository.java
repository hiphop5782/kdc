package com.kh.video.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kh.video.entity.Reply;

public interface ReplyRepository extends JpaRepository<Reply, Long>{
	List<Reply> findByVideoOrderByIdAsc(Long id);
}
