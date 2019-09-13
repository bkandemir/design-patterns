package com.berkay.singleton;

//Lazy Initialization with double lock Method
public class House {
	
	String name;
	private volatile static House uniqueInstance;
	private House() {

	}
	//Double check locking
	public static House getInstance() {
		if(uniqueInstance==null) {
			synchronized (House.class) {
				if(uniqueInstance==null) {
					uniqueInstance=new House();
				}			
			}
		}
		return uniqueInstance;
	}

}
