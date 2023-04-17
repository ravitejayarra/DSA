package com.Accio.Hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  Scanner sc = new Scanner(System.in);
	      int n =  sc.nextInt();
	      int  target = sc.nextInt();

	      Map<Integer, Integer> map = new HashMap<>();
	      int a[] =  new int[n];
	      for(int i=0;i<n;i++){
	        a[i] = sc.nextInt();
	        map.put(a[i], i);
	        
	      }
	      
	      
	      for(int i = 0;i<n ;i++) {
	    	  
	    	  if(map.containsKey(target-a[i]) && i != map.get(target-a[i]) ){
	    		  System.out.println(i + " "+ map.get(target-a[i]));
	    		  return;
	    	  }
	      }
	      
	      
	      
	      
		
	}

}
