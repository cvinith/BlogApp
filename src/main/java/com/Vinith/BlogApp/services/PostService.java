package com.Vinith.BlogApp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Vinith.BlogApp.models.Post;
import com.Vinith.BlogApp.repositories.PostRepository;

@Service
public class PostService {

	@Autowired
	PostRepository postRepository;

	public List<Post> getAllPosts() {
		return postRepository.findAll();
	}

	public Optional<Post> getPostById(Integer id) {
		return postRepository.findById(id);
	}

	public List<Post> getPostsByUserId(Integer id) {
		return postRepository.findByUserId(id);
	}

	public void addPost(Post post) {
		postRepository.save(post);
	}

	public void deletePostById(Integer id) {
		postRepository.deleteById(id);
	}

}
