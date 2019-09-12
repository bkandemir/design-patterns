package com.berkay.strategy;

public class PaypalStrategy implements Payment {

	private String name;
	private String email;
	
	public PaypalStrategy(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}
	//if paid with paypal 1.0 TL interest fee is applied; 
	@Override
	public void pay(double amount) {
		double interestRate=1.0;
		amount=amount+interestRate;
		System.out.println(amount+" "+"paid with Paypal "+"with interest fee of "+interestRate+" TL");
		
	}

}
