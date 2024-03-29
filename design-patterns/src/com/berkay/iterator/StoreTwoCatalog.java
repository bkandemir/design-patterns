package com.berkay.iterator;

public class StoreTwoCatalog implements Catalog {
	   private static final int MAX_ITEMS = 4;
	    private int numberOfProducts = 0;
	    Product[] products;

	    public StoreTwoCatalog() {
	        products = new Product[MAX_ITEMS];

	        addItem("C++ is NOT dead. Yet!", "T-Shirt", 39.99);
	        addItem("Java Rocks. Yes", "Silky mouse-pad", 19.99);
	        addItem("Java Design Patterns", "Book - A must!", 139.99);
	        addItem("Web Development Cookbook", "The best Web Development cookbook - 2018", 49.99);
	    }


	    public void addItem(String name, String description, double price) {
	         Product product = new Product(name, description, price);

	         if (numberOfProducts >= MAX_ITEMS) {
	             System.out.println("Catalog is Full - can't add products.");

	         }else {
	             products[numberOfProducts] = product;
	             numberOfProducts = numberOfProducts + 1;
	         }
	    }
	    public Product[] getCatalog() {
	        return products;
	    }
	    
	    public StoreTwoIterator createIterator() {
	        return  new StoreTwoIterator(products);
	    }


}
