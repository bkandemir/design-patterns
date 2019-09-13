package com.berkay.singleton;

//Eager Initialization
public class Person {
	
	String name;
	private static Person uniqueInstance = new Person();

	private Person() {

	}
	
	public static Person getInstance() {
		return uniqueInstance;
	}

}
