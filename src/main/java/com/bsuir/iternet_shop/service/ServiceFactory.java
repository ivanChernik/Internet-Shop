package com.bsuir.iternet_shop.service;

public class ServiceFactory {
	private static final ServiceFactory instance = new ServiceFactory();

	private ServiceFactory() {

	}

	public ServiceFactory getInstance() {
		return instance;
	}

	public String getMessage() {
		return "Hello user!";
	}

}
