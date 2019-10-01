package com.Vinith.BlogApp.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Vinith.BlogApp.models.Post;
import com.Vinith.BlogApp.services.PostService;

@RestController
public class PostController {

	@Autowired
	PostService postService;

	@GetMapping("/posts")
	public List<Post> getAllPosts() {
		return postService.getAllPosts();
	}

	@GetMapping("/post/{id}")
	public Optional<Post> getPostById(@PathVariable("id") Integer id) {
		return postService.getPostById(id);
	}

	@GetMapping("/posts/user/{id}/posts")
	public List<Post> getPostsByUserId(@PathVariable("id") Integer id) {
		return postService.getPostsByUserId(id);
	}

	@PostMapping("/post")
	public void addPost(@RequestBody Post post) {
		postService.addPost(post);
	}

	@PutMapping("/post/{id}")
	public void updatePost(@RequestBody Post post) {
		postService.addPost(post);
	}

	@DeleteMapping("/post/{id}")
	public void deletePostById(@PathVariable("id") Integer id) {
		postService.deletePostById(id);
	}
}
