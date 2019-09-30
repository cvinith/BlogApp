package com.Vinith.BlogApp.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.Vinith.BlogApp.models.Post;
import com.Vinith.BlogApp.services.PostService;

@RestController
public class PostController {
	
	@Autowired
	PostService postService;
	
	@GetMapping("/posts")
	public List<Post> getAllPosts(){
		return postService.getAllPosts();
	}
	
	@GetMapping("/post/{id}")
	public Optional<Post> getPostById(@PathVariable("id") Integer id) {
		return postService.getPostById(id);
	}

}
