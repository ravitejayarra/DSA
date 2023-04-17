package com.solid.OCP;

public class CalculateDiscount {

	
	public int premiumDiscountpercent(customerProfile customer) {
		
		if(customer.isLoyal()) {
			return 20;
		}
		
		
		return 0;
		
	}
	
}
