package com.syntax.java8.Stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortProductsUsingStream {

	public static void main(String[] args) {

		
       List<Product> list = new ArrayList<Product>();
		
		list.add(new Product(1, "apple", 25));
		list.add(new Product(2, "ball", 58));
		list.add(new Product(3, "cat", 2000));
		list.add(new Product(4, "dog", 4000));
		list.add(new Product(5, "elephant", 12000));
		list.add(new Product(6, "fan", 10000));
		list.add(new Product(7, "gum", 10));
		
		
		list.forEach(System.out::println);
		System.out.println("------------------------");
		
		
//		List<Product> list2 = list.stream().sorted(new Comparator<Product>() {
//
//			@Override
//			public int compare(Product o1, Product o2) {
//				return (int) (o1.getPrice()-o2.getPrice());
//			}
//		}).collect(Collectors.toList());
		
		Comparator<Product> com = (Product o1, Product o2)-> {
				return (int) (o1.getPrice()-o2.getPrice());
			};
		
			
		List<Product> list2 = list.stream().sorted(com.reversed()).collect(Collectors.toList());
		
		List<Product> list3 = list.stream().sorted(Comparator.comparing(Product::getPrice).reversed()).collect(Collectors.toList());
		
		List<Product> list4 = list.stream().sorted(Comparator.comparing(Product::getName).reversed()).collect(Collectors.toList());
		
		list4.forEach(System.out::println);
		
	}

}
