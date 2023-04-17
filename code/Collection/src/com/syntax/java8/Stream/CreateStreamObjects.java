package com.syntax.java8.Stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class CreateStreamObjects {

	public static void main(String[] args) {

		
		Stream<Character> obj1 = Stream.of('a','b','c');
		
	    obj1.forEach(System.out::print);
	    
	    System.out.println();
	    
	    Collection<Character> collection = Arrays.asList('a','b','c');
	    
	    Stream<Character> obj2 = collection.stream();
	    
	    obj2.forEach(System.out::print);
	    
	    System.out.println();
	    
        List<Character> list = Arrays.asList('a','b','c');
	    
	    Stream<Character> obj3 = list.stream();
	    
	    obj3.forEach(System.out::print);
	    
	    System.out.println();
	    
	    
	    Set<Character> set = new HashSet<>(list);
	    
	    Stream<Character> obj4 = set.stream();
	    
        obj4.forEach(System.out::print);
	    
	    System.out.println();
	    
	    
	    String ch[] = {"A","B","C"};
	    
        Stream<String> obj5 = Arrays.stream(ch);
	    
        obj5.forEach(System.out::print);
	    
	    System.out.println(); 
	    
	    
	    
	}

}
