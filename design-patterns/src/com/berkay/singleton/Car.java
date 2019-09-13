package com.berkay.singleton;

//Lazy Initialization
public class Car {
	
	String name;
	private static Car uniqueInstance;

	private Car() {

	}
	
	public static synchronized Car getInstance() {
		//Added synchronized to make singleton safer. (*Multi-thread)
		if(uniqueInstance==null) {
			uniqueInstance=new Car();			
		}
		return uniqueInstance;
	}

}
