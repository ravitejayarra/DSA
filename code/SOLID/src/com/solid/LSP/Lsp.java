package com.solid.LSP;

import java.util.ArrayList;
import java.util.List;

public class Lsp {
	
	
	
	// all object must be substituted by their subtypes , with out effecting the correctness of the code
	
	
	// 1. breaking the hierarchy
	
	// -> Vehicle [InterieorWidth]  = ( car[cabinWidth], raceCar[CockpitWidth]);
	
	
	
	// 2. Tell , Don't ask   
	
	
	
	public static void main(String[] args) {
		
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new InHouseProduct();
		
		
		List<Product> list = new ArrayList<>();
		
		list.add(p1); list.add(p2); list.add(p3);
		
		for(Product p : list) {
			System.out.println(p.getDiscount());
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
