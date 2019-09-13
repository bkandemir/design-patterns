package com.berkay.factory;

public class CheeseBurger extends Hamburger{
	
    public CheeseBurger() {
        name = "Cheese Burger";
        sauce = "Barbecue";
        buns = "Buns!";
    }

    @Override
    public void cook() {
        System.out.println("Cooking CheeseBurger....");
    }

}
