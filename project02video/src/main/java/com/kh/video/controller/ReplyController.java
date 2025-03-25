package com.kh.video.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kh.video.entity.Reply;
import com.kh.video.entity.Video;
import com.kh.video.repository.ReplyRepository;
import com.kh.video.repository.VideoRepository;

@RestController
@RequestMapping("/reply")
public class ReplyController {
	@Autowired
	private ReplyRepository replyRepository;
	@Autowired
	private VideoRepository videoRepository;
	
	@PostMapping("/")
	public void insert(@RequestBody Reply reply) {
		//video 탐색(없으면 예외처리)
		Video video = videoRepository.findById(reply.getVideo()).orElseThrow();
		//등록
		replyRepository.save(reply);
	}
	@GetMapping("/{id}")
	public List<Reply> list(@PathVariable Long id) {
		Video video = videoRepository.findById(id).orElseThrow();
		return replyRepository.findByVideoOrderByIdAsc(video.getId());
	}
	@PutMapping("/{id}")
	public void edit(@PathVariable Long id, @RequestBody Reply reply) {
		Reply target = replyRepository.findById(id).orElseThrow();
		target.setAuthor(reply.getAuthor());
		target.setContent(reply.getContent());
		replyRepository.save(target);
	}
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		Reply target = replyRepository.findById(id).orElseThrow();
		replyRepository.delete(target);
	}
	
}
