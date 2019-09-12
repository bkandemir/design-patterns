package com.berkay.strategy;

public class Product {
	
	private String upsCode;
	private double price;
	
	public Product() {

	}
	
	public Product(String upsCode, double price) {
		super();
		this.upsCode = upsCode;
		this.price = price;
	}
		
	public String getUpsCode() {
		return upsCode;
	}
	public void setUpsCode(String upsCode) {
		this.upsCode = upsCode;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

}
