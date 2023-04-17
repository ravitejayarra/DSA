package com.solid.LSP;

import java.util.Random;

public class Car implements Vehicle {

	@Override
	public double getInteriorWidth() {
		return getCabinWidth();
	}
	
	public double getCabinWidth() {
		return new Random().nextDouble();
	}

}
