package com.kh.shortvideo.controller;

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

import com.kh.shortvideo.entity.ShortVideo;
import com.kh.shortvideo.repository.ShortVideoRepository;

@RestController
@RequestMapping("/short")
public class ShortVideoController {

	@Autowired
	private ShortVideoRepository shortVideoRepository;
	
	@PostMapping("/")
	public void insert(@RequestBody ShortVideo shortVideo) {
		shortVideoRepository.save(shortVideo);
	}
	
	@GetMapping("/")
	public List<ShortVideo> listAll() {
		return shortVideoRepository.findAll(Sort.by(Order.desc("id")));
	}
	
	@GetMapping("/page/{page}")
	public Page<ShortVideo> listAll(@PathVariable int page) {
		Pageable pageable = PageRequest.of(page-1, 10, Sort.by(Order.desc("id")));
		return shortVideoRepository.findAll(pageable);
	}
	
	@GetMapping("/{id}")
	public ShortVideo find(@PathVariable Long id) {
		ShortVideo video = shortVideoRepository.findById(id).orElseThrow();
		video.setViews(video.getViews()+1);//조회수 1 증가
		return shortVideoRepository.save(video);
	}
	
	@PutMapping("/{id}")
	public void edit(@PathVariable Long id, @RequestBody ShortVideo shortVideo) {
		ShortVideo target = shortVideoRepository.findById(id).orElseThrow();
		target.setTitle(shortVideo.getTitle());
		target.setDescription(shortVideo.getDescription());
		target.setUrl(shortVideo.getUrl());
		target.setCreator(shortVideo.getCreator());
		shortVideoRepository.save(target);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		ShortVideo target = shortVideoRepository.findById(id).orElseThrow();
		shortVideoRepository.delete(target);
	}
	
}
