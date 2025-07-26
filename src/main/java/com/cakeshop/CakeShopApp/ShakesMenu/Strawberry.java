package com.cakeshop.CakeShopApp.ShakesMenu;

public class Strawberry {
	
	private String flavour;
	private String type;
	
	public Strawberry(String flavour,String type) {
		this.flavour = flavour;
		this.type = type;
	}
	
	public String showFlavour() {
		return flavour;
	}
	
	public String showType() {
		return type;
	}

}
