package com.berkay.factory;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        HamburgerStore bHamburgerStore = new BHamburgerStore();
        HamburgerStore aHamburgerStore = new AHamburgerStore();

        Hamburger hamburger = bHamburgerStore.orderHamburger("veggie");
        System.out.println("Berkay ordered " + hamburger.getName() + "\n" );


        hamburger = aHamburgerStore.orderHamburger("cheese");
        System.out.println("James Bond ordered: " + hamburger.getName() + "\n");

	}

}
