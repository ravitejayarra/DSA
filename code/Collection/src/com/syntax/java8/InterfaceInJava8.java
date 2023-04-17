package com.syntax.java8;

import java.util.Arrays;
import java.util.List;

interface I{
	
	
	// methods are public abstract
	
	// In List interface we have Stream() default method 
	
	// Default methods enable you to add new functionality to 
	// the interfaces of your libraries and ensure binary compatibility with
	// code written for older versions of those interfaces
	
	static boolean isTrue() {
		return true;
	}
	
	int add();
	
	default String Getfullname() {
		return "Yarra ravi";
	}
	
}



// internal loop in java = foreach
// avoid the inner class and interface implementation == lambda expression ( if only one method) 



public class InterfaceInJava8 implements I{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println(I.isTrue());
       System.out.println(new InterfaceInJava8().add());
       System.out.println(new InterfaceInJava8().Getfullname());
       
       
       List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);
       
       list.forEach(l->{ System.out.println(l); }); 
       
	}

	@Override
	public int add() {
		return 111;
	}
	
//	@Override
//	public String Getfullname() {
//		return "Amar th";
//		}

}
