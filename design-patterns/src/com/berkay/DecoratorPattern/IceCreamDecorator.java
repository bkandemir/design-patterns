package com.berkay.DecoratorPattern;

public class IceCreamDecorator implements IceCream {
	private IceCream iceCream;
	

	public IceCreamDecorator(IceCream iceCream) {
		super();
		this.iceCream = iceCream;
	}



	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return this.iceCream.cost();
	}

}
