package com.gpch.login.facade;

import java.util.List;

import com.gpch.login.model.Role;
import com.gpch.login.model.User;

public interface Facade {

	public User findUserByEmail(String email);

	public User saveUser(User user);

	public List<Role> findAllRole();

	public Role findByRole(String role);
	
	public String encode(CharSequence rawPassword);

}
