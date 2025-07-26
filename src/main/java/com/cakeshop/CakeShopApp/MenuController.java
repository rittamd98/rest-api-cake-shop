package com.cakeshop.CakeShopApp;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import com.cakeshop.CakeShopApp.CakeMenu.*;


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

}
