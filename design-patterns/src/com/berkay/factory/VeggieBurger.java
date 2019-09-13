package com.berkay.factory;

public class VeggieBurger extends Hamburger {
	
    public VeggieBurger() {
        name = "Veggie Burger";
        sauce = "Veggie sauce";
        buns = "Buns!";
    }

    @Override
    public void cook() {
        System.out.println("Cooking Veggie....");
    }

}
