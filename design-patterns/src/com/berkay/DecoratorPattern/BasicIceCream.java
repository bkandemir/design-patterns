package com.berkay.DecoratorPattern;

public class BasicIceCream implements IceCream {
	
	public BasicIceCream() {
		System.out.println("Basic Ice Cream is created!");
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 1.25;
	}

}
