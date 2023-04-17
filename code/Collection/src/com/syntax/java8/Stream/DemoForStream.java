package com.syntax.java8.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;


/*
 *  Source -> filter -> Sort -> map -> collect
 * 
 * 
 */




public class DemoForStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = Arrays.asList(1,2,3);
		
		Stream<Integer> stream = list.stream();
		
		
		stream.filter(i->{
			System.out.println("hii");
			return true;
			
		});
		
		//  java.lang.IllegalStateException:
		
		// we can use list multiple times , but stream only once ( not our intention to persist)
		
		
		list.stream().filter(i->{
			System.out.println("hii");
			return true;
			
		});

		System.out.println("hi");
		
	}

}
