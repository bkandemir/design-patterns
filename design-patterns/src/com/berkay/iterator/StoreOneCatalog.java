package com.berkay.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class StoreOneCatalog implements Catalog {
    private ArrayList<Product> products;

    public StoreOneCatalog() {
        products = new ArrayList<>();

        //Add a few products to catalog
        addItem("Superman Comic", "The best in town", 12.99);
        addItem("Batman Comic", "Okay, but still good", 11.99);
        addItem("Star Wars", "Can't live without it", 39.99);
        addItem("Jedi T-Shirt", "Gotta Have it", 29.99);
    }



    public void addItem(String name, String description, double price) {
        Product product = new Product(name, description, price);
        products.add(product);
    }

    public ArrayList<Product> getProducts() {
        return products;
    }



	public Iterator createIterator() {
		// TODO Auto-generated method stub
		return new StoreOneIterator(products);
	}

}
