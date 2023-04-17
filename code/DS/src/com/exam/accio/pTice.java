package com.exam.accio;

import java.util.Scanner;

public class pTice {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		
		String str = sc.next();
		
		String Adrian = "ABC";
		
		String Bruno  = "BABC";
		String Goran  = "CCAABB";
		
		int a=0,b=0,c=0;
		
		for(int i=0;i<n;i++) {
			
			if(str.charAt(i)==Adrian.charAt(i%3)) { a++ ; } 
			if(str.charAt(i)==Bruno.charAt(i%4)) { b++ ; } 
			if(str.charAt(i)==Goran.charAt(i%6)) { c++ ; } 
			
		}
		
		
		int max = a;
		
		if(b>max) { max = b; }
		if(c>max) { max =c ;}
		
		System.out.println(max);
		if(a==max) {   System.out.println("Adrian");                }
		if(b==max) {   System.out.println("Bruno");                }
		if(c==max) {   System.out.println("Goran");                }
		
		
	}

}
