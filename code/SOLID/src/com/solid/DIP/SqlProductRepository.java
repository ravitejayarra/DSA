package com.solid.DIP;

import java.util.Arrays;
import java.util.List;

public class SqlProductRepository implements productRepository {

	@Override
	public List<String> getAllproducts() {
		
		return Arrays.asList("book","Pen");
	}

}
