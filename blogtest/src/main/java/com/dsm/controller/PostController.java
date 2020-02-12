package com.dsm.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dsm.dto.PostDTO;
import com.dsm.service.PostService;

@Controller
public class PostController {
	@Autowired
	private PostService postService;
	
	@GetMapping("/post")
	public String reg(Map<String, Object> model) {
		model.put("post", new PostDTO());
		return "Post";
	}
	
	@PostMapping("/home")
	public String createPost(@ModelAttribute("post") PostDTO postDto) {
		postService.createOrUpdatePost(postDto);
		return "redirect:/list";	
	}
	
	@GetMapping("/list")
	public String listOfPost(Model model) {
		List<PostDTO> postList = postService.getAllPost();
		model.addAttribute("postList", postList);
		return "postList";
	}
	
	@PostMapping("/delete")
	public String deletePost(@RequestParam("id") String id) {
		postService.deletePost(Long.parseLong(id));
		return "redirect:/list";		
	}
	
	@GetMapping("/edit")
	public String editPost(@RequestParam("id") String id, Map<String, Object> model) {
		PostDTO postDTO = postService.editPost(Long.parseLong(id));
		model.put("post", postDTO);
		return "Post";
	}
}
