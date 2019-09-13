package com.berkay.singleton;

public class MainClass {

	public static void main(String[] args) {
		
		Car c = Car.getInstance();		
		c.name = "Hello";
		
		Person p = Person.getInstance();		
		p.name = "Berkay";
	}

}
