package com.solid.DIP;

import java.util.List;

public class ProductCatelog {
	
	productRepository productRepo;
	
	
	
	public ProductCatelog(productRepository productRepo) {
		this.productRepo = productRepo;            // dependency injection
	}


	public  void getproductList(){
		
		 List<String> list = productRepo.getAllproducts();
		 
		 list.stream().forEach( product -> {
			 System.out.println(product);
		 });
	}
	
	

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		getproductList();
//		
//
//	}

}
