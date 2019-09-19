package com.berkay.iterator;

import java.util.ArrayList;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Catalog storeOne =  new StoreOneCatalog();
		Catalog storeTwo =  new StoreTwoCatalog();




        Seller seller = new Seller(storeOne, storeTwo);
        seller.printCatalog();


	}

}
