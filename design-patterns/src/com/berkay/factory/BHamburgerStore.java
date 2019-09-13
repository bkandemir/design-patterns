package com.berkay.factory;

public class BHamburgerStore extends HamburgerStore {
	public Hamburger createHamburger(String type) {
		
		Hamburger burger = null;

        if (type.equals("cheese")) {
            burger = new CheeseBurger();
        } else if (type.equals("veggie")) {
            burger = new VeggieBurger();
        }
        return burger;		
	}

}
