package com.gfg.array;

import java.util.Scanner;

public class LargestSumContiguousSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		 int n = scanner.nextInt();
	
		 int[] a = new int[n];
		 
		for(int i=0;i<n;i++) {
			a[i] = scanner.nextInt();
		}
		
		int sum=0,max=a[0];
		for(int i=0;i<n-1;i++) {
			sum = a[i];
			for(int j = i+1;j<n;j++) {
				sum = sum +a[j];
				max= Math.max(max, sum);
			}
			sum=0; 
		}
		System.out.println(max);
	}

}
