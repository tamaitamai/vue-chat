package com.example.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.domain.User;
import com.example.form.EditUserForm;
import com.example.form.LoginForm;
import com.example.form.UserInsertForm;
import com.example.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;
	
	/**
	 * ログイン情報を確認
	 * @param loginForm
	 * @return
	 */
	@PostMapping("/login")
	public User login(@RequestBody @Validated LoginForm loginForm) {
		User user = new User();
		BeanUtils.copyProperties(loginForm, user);
		if(userService.login(user.getMail(), user.getPassword()) == null) {
			System.out.println("ユーザーを取得できませんでした");
		}
		return userService.login(user.getMail(), user.getPassword());
	}
	
	/**
	 * 新しくユーザーを登録
	 * @param userInsertForm
	 */
	@PostMapping("/insert")
	public void insert(@RequestBody @Validated UserInsertForm userInsertForm) {
		User user = new User();
		BeanUtils.copyProperties(userInsertForm, user);
		userService.insert(user);
	}
	
	@PostMapping("/edit")
	public User editUser(@RequestBody @Validated EditUserForm editUserForm) {
		System.out.println(editUserForm);
		User user = new User();
		BeanUtils.copyProperties(editUserForm, user);
		System.out.println(user);
		userService.update(user);
		return user;
	}
}
