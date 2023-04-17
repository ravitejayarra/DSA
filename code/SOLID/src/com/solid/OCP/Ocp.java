package com.solid.OCP;

import java.util.ArrayList;
import java.util.List;

public class Ocp {

	public static void main(String[] args) {

		
		
		// open for extension ,and closed for  modification
		
		
		customerProfile cp1  = new HomeCustomerProfile();
		customerProfile cp2 = new VehicleCustomerProfil();
		customerProfile cp3 = new HealthCustomerProfile();
		
		List<customerProfile> list = new ArrayList<customerProfile>();
		
		list.add(cp1); list.add(cp2); list.add(cp3);
		
		
		for(customerProfile cp : list) {
			
			System.out.println(cp.isLoyal());
		}
		
		
		
		
		
	}

}
