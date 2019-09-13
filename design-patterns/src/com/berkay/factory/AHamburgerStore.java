	package com.berkay.factory;

public class AHamburgerStore extends HamburgerStore {

	public Hamburger createHamburger(String type) {
		
		Hamburger burger = null;

        if (type.equals("cheese")) {
            burger = new JamaicanCheeseBurger();
        }
        return burger;		
	}

}
