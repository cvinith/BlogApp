package com.Vinith.BlogApp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Vinith.BlogApp.models.User;
import com.Vinith.BlogApp.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;

	public List<User> getAllUsers() {
		return userRepository.findAll();
	}

	public Optional<User> getUserById(Integer id) {
		return userRepository.findById(id);
	}

	public List<User> getUserByLocationId(Integer id) {
		return userRepository.findByLocationId(id);
	}

	public void addUser(User user) {
		userRepository.save(user);
	}

	public void deleteUserById(Integer id) {
		userRepository.deleteById(id);
	}
}
