package com.gpch.login.service;

import java.util.List;

import com.gpch.login.model.Role;

public interface RoleService {

	public List<Role> findAllRole();

	public Role findByRole(String role);

}
