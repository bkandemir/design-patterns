package com.berkay.StrategyPattern;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShoppingCart sc = new ShoppingCart();
		Product item1 = new	Product("Macbook Pro", 9000.0);
		Product item2 = new	Product("Macbook Air", 7500.0);
		
		sc.addProduct(item1);
		sc.addProduct(item2);
		sc.pay(new CreditCardStrategy("Berkay Kandemir","1234567"));
		sc.pay(new PaypalStrategy("Berkay Kandemir","test@email.com"));

	}

}
