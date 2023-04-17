package com.solid.OCP;

import java.util.Random;

public class HomeCustomerProfile implements customerProfile {

	@Override
	public boolean isLoyal() {
		return new Random().nextBoolean();
	}

}
