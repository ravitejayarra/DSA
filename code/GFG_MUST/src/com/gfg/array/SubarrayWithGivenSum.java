package com.gfg.array;

import java.util.ArrayList;
import java.util.Scanner;

public class SubarrayWithGivenSum {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		 int n = scanner.nextInt();
		 int k= scanner.nextInt();
		 int[] arr = new int[n];
		 
		for(int i=0;i<n;i++) {
			arr[i] = scanner.nextInt();
		}
		
		
		ArrayList<Integer> list = subarraySum(arr,arr.length,k);
		
		System.out.println(list);
	}
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        // Your code here
        ArrayList<Integer> ans = new ArrayList<Integer>();
        int l=0,r=0,sum=0;
        
        // refer gfg
        
        while(r<n){
         
        	sum = sum + arr[r];
        	while(sum > s) {
        		sum = sum-arr[l];
        		l++;
        	}
        	
        	
        	if(sum==s) {
        		l++; r++;
        		ans.add(l);
        		ans.add(r);
        		return ans;
        	}
        	
           
        
          r++;  
        }
        ans.add(-1);
        return ans;
        
    }
}


