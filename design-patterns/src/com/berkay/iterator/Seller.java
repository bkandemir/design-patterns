package com.berkay.iterator;

import java.util.Iterator;

public class Seller {
    Catalog storeOneCatalog;
    Catalog storeTwoCatalog;


    public Seller(Catalog storeOne, Catalog storeTwo) {
		// TODO Auto-generated constructor stub
        this.storeOneCatalog = storeOne;
        this.storeTwoCatalog = storeTwo;
	}


	public void printCatalog() {
        Iterator storeOneIterator = storeOneCatalog.createIterator();
        System.out.println("Printing Geeky Catalog: ");
        printCatalog(storeOneIterator);

        System.out.println("Printing Dev Catalog: ");

        Iterator storeTwoIterator = storeTwoCatalog.createIterator();
        printCatalog(storeTwoIterator);

    }

    private void printCatalog(Iterator iterator) {
        while (iterator.hasNext()) {
            Product product = (Product)iterator.next();
            System.out.print(product.getName() + ", ");
            System.out.print(product.getDescription() + " ");
            System.out.println(product.getPrice());
        }
    }

}
