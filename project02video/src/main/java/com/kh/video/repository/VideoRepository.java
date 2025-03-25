package com.kh.video.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kh.video.entity.Video;

public interface VideoRepository extends JpaRepository<Video, Long>{

}
