package com.Accio.binarySearch;

import java.util.Scanner;

public class TwoSum_Bs {
	
	public static void main(String[] args) {
		
		
		   Scanner sc = new Scanner(System.in);
		      int n =  sc.nextInt();
		      int  limit = sc.nextInt();

		      int a[] =  new int[n];
		      for(int i=0;i<n;i++){
		        a[i] = sc.nextInt();
		      }

	       int b[] =  new int[n];
	       b[0] = a[0];
	      for(int i=1;i<n;i++){
	        b[i] = a[i-1] +   a[i];
	      }
	}

}
