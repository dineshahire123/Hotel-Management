package com.example.demo.Services;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.User;
import com.example.demo.Exception.ResourceNotFoundException;
import com.example.demo.Repositories.UserRepository;


@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	
	@Override
	public User saveUser(User user) {
		// TODO Auto-generated method stub
		//Generate unique UserId
		String randomUser = UUID.randomUUID().toString();
		user.setUserId(randomUser);
		return userRepository.save(user);
	}

	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	@Override
	public User getUser(String userId) {
		// TODO Auto-generated method stub
		return userRepository.findById(userId).orElseThrow(()-> new ResourceNotFoundException("User with given id is not found on server"));
	}

}
