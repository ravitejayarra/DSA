package com.solid.LSP;

import java.util.ArrayList;
import java.util.List;

public class Vehicleutils {

	public static void main(String[] args) {

		
		Vehicle v1 = new Car();
		Vehicle v2 = new Car();
		Vehicle v3 = new RacingCar();
		
		List<Vehicle> list = new ArrayList<Vehicle>();
		list.add(v1); list.add(v2); list.add(v3);
		
		list.stream().forEach( vehicle ->{
			System.out.println(vehicle.getInteriorWidth());
		});
		
	}

}
