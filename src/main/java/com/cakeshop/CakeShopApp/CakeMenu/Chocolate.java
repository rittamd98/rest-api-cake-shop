package com.cakeshop.CakeShopApp.CakeMenu;

import org.springframework.stereotype.Component;


@Component
public class Chocolate implements Cakes{
	
	private String flavour = "Chocolate";
	private String type = "cake";
	
	public String showFlavour() {
		return flavour;
	}
	
	public String showType() {
		return type;
	}

}
