package com.berkay.DecoratorPattern;

public class MintIceCream extends IceCreamDecorator {
	public MintIceCream(IceCream iceCream) {
		super(iceCream);		
	}
	
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		System.out.println("Adding Mint IceCream");
		return 1.25+super.cost();
	}

}
