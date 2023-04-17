package com.syntax.java8.Stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortUsingStream {

	public static void main(String[] args) {

		
		
		List<String> names = new ArrayList<String>();
		
		names.add("mounika");
		names.add("pranathi");
		names.add("suheera");
		names.add("bhavya");
		names.add("namratha");
		names.add("charu");
		
//      ********** Ascending order ********	
		
//		List<String> list = names.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
//		
//		list.forEach(System.out::println);
		
//		List<String> list = names.stream().sorted((o1,o2)-> o1.compareTo(o2)).collect(Collectors.toList());
//		
//		list.forEach(System.out::println);
		
//        List<String> list = names.stream().sorted().collect(Collectors.toList());
//		
//		list.forEach(System.out::println);
		
		
//      ********** descending order ********
		
//          List<String> list = names.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
//          list.forEach(System.out::println);		
		
		
//         List<String> list = names.stream().sorted((o1,o2)-> o2.compareTo(o1)).collect(Collectors.toList());
//		 list.forEach(System.out::println);
		
		
		
		
		
		
		
		
		
	}

}
