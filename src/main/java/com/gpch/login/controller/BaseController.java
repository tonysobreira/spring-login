package com.gpch.login.controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.gpch.login.facade.Facade;

public abstract class BaseController {

	@Autowired
	private Facade facade;

	public Facade getFacade() {
		return facade;
	}

	public void setFacade(Facade facade) {
		this.facade = facade;
	}

}
