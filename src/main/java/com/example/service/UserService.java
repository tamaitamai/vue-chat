package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.domain.User;
import com.example.repository.UserRepository;

@Transactional
@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;
	
	/**
	 * ユーザー新規登録
	 * @param user
	 */
	public void insert(User user) {
		userRepository.insert(user);
	}
	
	/**
	 * ログイン
	 * @param mail
	 * @param password
	 * @return
	 */
	public User login(String mail, String password) {
		return userRepository.login(mail, password);
	}
	
	/**
	 * ユーザー情報の更新
	 * @param user
	 */
	public void update(User user) {
		userRepository.update(user);
	}
}
