package com.berkay.strategy;

public class CreditCardStrategy implements Payment {
	private String name;
	private String cardNumber;
	
		
	public CreditCardStrategy(String name, String cardNumber) {
		super();
		this.name = name;
		this.cardNumber = cardNumber;
	}
	
	@Override
	public void pay(double amount) {
		System.out.println(amount+" "+"paid with Credit Card");
		
	}

}
