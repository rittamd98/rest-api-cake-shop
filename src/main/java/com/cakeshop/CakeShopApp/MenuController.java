package com.cakeshop.CakeShopApp;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cakeshop.CakeShopApp.CakeMenu.*;
import com.cakeshop.CakeShopApp.ShakesMenu.*;


@RestController
@RequestMapping("/menu")
public class MenuController {
	
	private Cakes cakes;
	
	public MenuController(Cakes cakes) {
		this.cakes = cakes;
	}
	
	@RequestMapping("/")
	public String menuHome() {
		return "Welcome To the Cake Shop Menu !";
	}
	
	@RequestMapping("/cakes")
	public String showCakeMenu() {
		
		return cakes.showFlavour()+" "+cakes.showType();
		
	}
	
	@RequestMapping("/shakes")
	public String showShakesMenu() {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Strawberry strawberry = (Strawberry)context.getBean("strawberry");
		String flavour = strawberry.showFlavour();
		String type = strawberry.showType();
		return flavour+" "+type;
	}

}
