package com.solid.DIP;

public class EcommerceApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		productRepository productRepo = ProductFactory.create();
		
		ProductCatelog catelog = new ProductCatelog(productRepo);
		
		catelog.getproductList();
		
	}

}
