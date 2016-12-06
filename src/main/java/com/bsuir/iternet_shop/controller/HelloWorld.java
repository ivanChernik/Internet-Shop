package com.bsuir.iternet_shop.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bsuir.iternet_shop.service.ServiceFactory;

@Controller
@RequestMapping("/home")
public class HelloWorld {
	
	private String helloString;
	
	public String getHelloString() {
		return helloString;
	}

	@Autowired
	public void setHelloString(ServiceFactory serviceFactory) {
		this.helloString = serviceFactory.getMessage();
	}

	@RequestMapping(method=RequestMethod.GET)
	public String sayHello(Model model){
		model.addAttribute("helloString", helloString);
		return "index";
	}

}
