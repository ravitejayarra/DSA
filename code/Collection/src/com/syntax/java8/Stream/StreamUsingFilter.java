package com.syntax.java8.Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamUsingFilter {

	public static void main(String[] args) {

		List<Product> productList = createProductList();
		
		List<Product> list1 = new ArrayList<Product>();
		List<Product> list2 = new ArrayList<Product>();
		
		for(Product p : productList) {
			if(p.getPrice() >5000) {
				list1.add(p);
			}
		}
		
		list1.forEach(System.out::println);
		
		System.out.println();
		
		list2 = productList.stream().filter((product) -> product.getPrice() > 5000)
				.collect(Collectors.toList());
		
		list2.stream().forEach(System.out::println);
	}
	
	
	public static List<Product> createProductList(){
		
		List<Product> list = new ArrayList<Product>();
		
		list.add(new Product(1, "apple", 25));
		list.add(new Product(2, "ball", 58));
		list.add(new Product(3, "cat", 2000));
		list.add(new Product(4, "dog", 4000));
		list.add(new Product(5, "elephant", 12000));
		list.add(new Product(6, "fan", 10000));
		list.add(new Product(7, "gum", 10));
		
		
		return list;
	}

}


class Product{
	
	
	private int id;
	private String name;
	private float price;
	
	public Product(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
	
}