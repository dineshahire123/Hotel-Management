package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.User;
import com.example.demo.Services.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;

	//create
	@PostMapping
	public ResponseEntity<User> createUser(@RequestBody User user)
	{
	
		User user1 = userService.saveUser(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(user1);
	}
	
	
	//single user get
	@GetMapping("/{userId}")
	public ResponseEntity<User> getSingleUser(@PathVariable String userId)
	{
		User user = userService.getUser(userId);
		
		return ResponseEntity.ok(user);
		
	}
	
	
	//all user get
	
	@GetMapping
	public ResponseEntity<List<User>> getAllUser()
	{
	  List<User> allUser =  userService.getAllUser();
     
	  return ResponseEntity.ok(allUser);
	  
	}
}
