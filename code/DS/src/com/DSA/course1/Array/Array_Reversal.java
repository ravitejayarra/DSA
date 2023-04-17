package com.DSA.course1.Array;


import java.util.Scanner;

public class Array_Reversal {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		 int n = scanner.nextInt();
		 int[] arr = new int[n];
		 
		 String s= "asd";
		 
		for(int i=0;i<n;i++) {
			arr[i] = scanner.nextInt();
		}
		
		int i,j,temp;
		i=0; j=n-1;
		
		while(j>i) {
			temp = arr[i];
			arr[i++] = arr[j];
			arr[j--] = temp;
			
		}
		
		for (int k : arr) {
			System.out.print(k + " ");
		}
		
	}

}
