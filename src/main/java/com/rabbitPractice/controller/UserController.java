package com.rabbitPractice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rabbitPractice.entity.UserEntity;
import com.rabbitPractice.service.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping
	public UserEntity createUser(@RequestBody UserEntity user) {
		return userService.saveUser(user);
	}
	
//	POST http://localhost:8080/api/users
//		Content-Type: application/json
//
//		{
//		  "name": "Amrit",
//		  "email": "amrit@example.com"
//		}

}
