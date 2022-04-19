package com.spring.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.spring.course.entities.User;
import com.spring.course.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	public List<User> findAll(){
		return repository.findAll();
	}
	
	@GetMapping
	public User findById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.get();
	}
}