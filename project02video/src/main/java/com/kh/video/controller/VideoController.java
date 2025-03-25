package com.kh.video.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Order;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kh.video.entity.Video;
import com.kh.video.repository.VideoRepository;

@RestController
@RequestMapping("/video")
public class VideoController {

	@Autowired
	private VideoRepository videoRepository;
	
	@PostMapping("/")
	public void insert(@RequestBody Video video) {
		videoRepository.save(video);
	}
	@GetMapping("/")
	public List<Video> listAll() {
		return videoRepository.findAll(Sort.by(Order.desc("id")));
	}
	@GetMapping("/page/{page}")
	public Page<Video> listAll(@PathVariable int page) {
		Pageable pageable = PageRequest.of(page-1, 10, Sort.by(Order.desc("id")));	
		return videoRepository.findAll(pageable);
	}
	@GetMapping("/{id}")
	public Video find(@PathVariable Long id) {
		return videoRepository.findById(id).orElseThrow();
	}
	@PutMapping("/{id}")
	public void edit(@PathVariable Long id, @RequestBody Video video) {
		Video target = videoRepository.findById(id).orElseThrow();
		target.setTitle(video.getTitle());
		target.setDescription(video.getDescription());
		target.setCreator(video.getCreator());
		target.setUrl(video.getUrl());
		videoRepository.save(target);
	}
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		Video target = videoRepository.findById(id).orElseThrow();
		videoRepository.delete(target);
	}
	
}
