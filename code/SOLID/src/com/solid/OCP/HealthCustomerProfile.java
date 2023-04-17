package com.solid.OCP;

import java.util.Random;

public class HealthCustomerProfile implements customerProfile {

	@Override
	public boolean isLoyal() {
		return new Random().nextBoolean();
	}

}
