package com.example.demo.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.Entity.User;

@Service
public interface UserService {

	
	User saveUser(User user);
	
	List<User> getAllUser();
	
	User getUser(String userId);
	
	//todo delete
	
	// update
	
}
