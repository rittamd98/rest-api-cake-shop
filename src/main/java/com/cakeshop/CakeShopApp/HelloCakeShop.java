package com.cakeshop.CakeShopApp;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloCakeShop {
	
	@RequestMapping("/")
	public String sayHello() {
		return "Welcome to The Cake Shop !";
	}

}
