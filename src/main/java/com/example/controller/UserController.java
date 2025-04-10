package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.domain.User;
import com.example.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;
	
	@PostMapping("/login")
	public User login(@RequestBody User user) {
		System.out.println("login");
		System.out.println(user);
		if(userService.login(user.getMail(), user.getPassword()) == null) {
			System.out.println("ユーザーを取得できませんでした");
		}
		return userService.login(user.getMail(), user.getPassword());
	}
	
	@PostMapping("/insert")
	public void insert(@RequestBody User user) {
		System.out.println("insert");
		System.out.println(user);
		userService.insert(user);
	}
}
