package com.berkay.StrategyPattern;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	
	List<Product> productList=new ArrayList<Product>();
	
	public void addProduct(Product p) {
		productList.add(p);
	}
	public void deleteProduct(Product p) {
		productList.remove(p);
	}
	public double calculateTotal() {
		double sum=0;
		for (Product product : productList) {
			sum=sum+product.getPrice();
		}
		return sum;
		
	}
	public void pay(Payment paymentStrategy) {
		double amount = calculateTotal();
		paymentStrategy.pay(amount);
	}
	

}
