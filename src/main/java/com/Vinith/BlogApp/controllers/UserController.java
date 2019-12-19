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
import com.Vinith.BlogApp.models.User;
import com.Vinith.BlogApp.services.UserService;

@RestController
public class UserController {

	@Autowired
	UserService userService;

	@GetMapping("/users")
	public List<User> getAllUsers() {
		return userService.getAllUsers();
	}

	@GetMapping("/user/{id}")
	public Optional<User> getUserById(@PathVariable("id") Integer id) {
		return userService.getUserById(id);
	}

	// fetching all posts of a particular user based on userId
	@GetMapping("/user/{id}/posts")
	public List<Post> getPostsByUserId(@PathVariable("id") Integer id) {
		Optional<User> user = userService.getUserById(id);
		if (user.isPresent())
			return user.get().getPosts();
		return null;
	}


	@PostMapping("/user")
	public void addUser(@RequestBody User user) {
		userService.addUser(user);
	}

	@PutMapping("/user/{id}")
	public void updateUser(@RequestBody User user) {
		userService.addUser(user);
	}

	@DeleteMapping("/user/{id}")
	public void deleteUserById(@PathVariable("id") Integer id) {
		userService.deleteUserById(id);
	}

}
