package com.solid.DIP;

public class ProductFactory {
	
	
	public static productRepository create() {
		return new SqlProductRepository();
		
	}

}
