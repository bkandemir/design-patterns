package com.berkay.DecoratorPattern;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Polymorphism
		IceCream basic = new BasicIceCream();
		System.out.println("Basic Ice Cream cost "+basic.cost()+"TL");
		
		IceCream chocolate =new ChocolateIceCream(basic);
		System.out.println("cost "+chocolate.cost()+"TL");
		
		IceCream mint =new MintIceCream(chocolate);
		System.out.println("cost "+mint.cost()+"TL");

	}

}
