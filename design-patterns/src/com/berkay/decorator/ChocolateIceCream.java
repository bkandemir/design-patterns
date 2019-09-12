package com.berkay.decorator;

public class ChocolateIceCream extends IceCreamDecorator {
	
	public ChocolateIceCream(IceCream iceCream) {
		super(iceCream);		
	}
	
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		System.out.println("Adding Chocolate IceCream");
		return 1.0+super.cost();
	}

}
