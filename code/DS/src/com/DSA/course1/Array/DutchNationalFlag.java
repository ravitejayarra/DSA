package com.DSA.course1.Array;

public class DutchNationalFlag {

	public static void main(String[] args) {

		int[] arr= {0,2,1,0,2,1,0,1,2,1};
		int i,j,temp,k = arr.length-1;
		temp=i=j=0;
		
		while(k>=j) {
			
			if(arr[j] < 1) {
				temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
				i++; j++;
			}
			
			else if(arr[j] > 1) {
				temp = arr[j];
				arr[j] = arr[k];
				arr[k] = temp;
				k--;
				 
			}
			else {
				j++;
			}
			
			
		}
		
		
		System.out.println(arr.length);
		
		for (int k1 : arr) {
			
			System.out.print(k1 +" ");
		}
		
		
		
		
		
		
		
		
	}

}
