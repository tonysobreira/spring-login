package com.gpch.login.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gpch.login.model.Role;
import com.gpch.login.repository.RoleRepository;
import com.gpch.login.service.RoleService;

@Service("roleService")
public class RoleServiceImpl implements RoleService {

	private RoleRepository roleRepository;

	@Autowired
	public RoleServiceImpl(RoleRepository roleRepository) {
		this.roleRepository = roleRepository;
	}

	@Override
	public List<Role> findAllRole() {
		return roleRepository.findAll();
	}

	public Role findByRole(String role) {
		return roleRepository.findByRole(role);
	}

}
