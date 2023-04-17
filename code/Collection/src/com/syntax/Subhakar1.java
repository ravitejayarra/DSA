package com.syntax;

public class Subhakar1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		int arr[] = {1,2,7,13};
		
		System.out.println(Subhakar1.NumberOfBalls(arr));

	}
	
	
	
	
	static int NumberOfBalls(int[] arr) throws java.lang.Exception {
		
		
		int n = arr.length;
		
		int remainingBalls =0;
		
		for(int i=0;i<n;i++) {
			remainingBalls = remainingBalls + ((i+1)*(i+1)) - arr[i]; 
			
		}
		
		return remainingBalls;
		
		
	}

}
