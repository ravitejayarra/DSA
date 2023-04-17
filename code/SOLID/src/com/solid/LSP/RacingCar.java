package com.solid.LSP;

import java.util.Random;

public class RacingCar implements Vehicle {

	@Override
	public double getInteriorWidth() {
		return getCockpitWidth();
	}
	
	public double getCockpitWidth() {
		return new Random().nextDouble();
	}

}
