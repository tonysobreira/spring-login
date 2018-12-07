package com.gpch.login.service;

import com.gpch.login.model.User;

public interface UserService {

	public User findUserByEmail(String email);

	public User saveUser(User user);

}