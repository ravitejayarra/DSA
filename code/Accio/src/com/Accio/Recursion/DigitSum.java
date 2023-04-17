package com.Accio.Recursion;

import java.util.Scanner;

public class DigitSum {
	
	public static void main(String[] args) {
		
		
		 Scanner sc = new Scanner(System.in);
	      String n = sc.next();
	      int k2 = sc.nextInt();
	      String k="";
	      long p=0;
	      for(int i =0;i<k2;i++){
	        k = k+n ;
	      }
	      p = Long.parseLong(k);
	      System.out.println(p);
	      long ans = superDigit(p);
	      System.out.println(ans);
	      
	}

	private static long superDigit(long p) {

		if(p/10 ==0) { return p ;}
		
		
		
		return p%10 + superDigit(p/10);
		
	}
	
	
	

}
