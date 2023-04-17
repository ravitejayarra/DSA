package com.solid.LSP;

public class InHouseProduct extends Product {

	@Override
	public double getDiscount() {
		return extraDiscount();
	}

	private double extraDiscount() {
		return discount*1.5;
	}

}
