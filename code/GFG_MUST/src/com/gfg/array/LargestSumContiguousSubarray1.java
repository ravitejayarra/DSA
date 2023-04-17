package com.gfg.array;

import java.util.Scanner;

public class LargestSumContiguousSubarray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		 int n = scanner.nextInt();
	
		 int[] arr = new int[n];
		 
		for(int i=0;i<n;i++) {
			arr[i] = scanner.nextInt();
		}
		
		  long lmax = arr[0], gmax = arr[0];
	        
	        
	        for(int i=1;i<n;i++){
	            
	            if(arr[i]> lmax+arr[i]){
	                lmax = arr[i];
	            }
	            else{
	                lmax = lmax + arr[i];
	            }
	            
	            gmax = Math.max(gmax,lmax);
	            
	            
	        }
	        
		
	
		System.out.println(gmax);
	}

}
