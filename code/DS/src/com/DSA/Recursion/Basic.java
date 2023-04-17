package com.DSA.Recursion;

import java.util.Scanner;

public class Basic {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		 int n = scanner.nextInt();
		//int k = scanner.nextInt();
		//int n = scanner.nextInt();
		
		  scanner.close();
//		  int sum = sumOf_N_Digits(n);
//		  System.out.println(sum);
		  
		//  int power_of_Num = power_of_Num(k,n);
		  
		//  System.out.println(power_of_Num);
		  int decimal_to_binary = decimal_to_binary(n);
		  System.out.println(decimal_to_binary);
		  
	}

	private static int decimal_to_binary(int n) {
		if(n==0) {
			return 0;
		}
		
		return n%2 + 10 * decimal_to_binary(n/2);
		
	}

	private static int power_of_Num(int k, int n) {
		if(n<0 || k<0) {
			return -1;
		}
		
		if(n==0) {
			return 1;
		}
		
		return k*power_of_Num(k,n-1) ;
		
	}

	private static int sumOf_N_Digits(int n) {
		
		if(n<0) {
			return -1;
		}
		if(n<10) {
			return n;
		}
		
		return (n%10) + sumOf_N_Digits(n/10);
		
		
		
	}

}
