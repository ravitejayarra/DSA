package com.Accio.binarySearch;

import java.util.Scanner;

public class ShippingParcels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
	      int n =  sc.nextInt();
	      int days = sc.nextInt();
      int low=0,high=0,mid,res = 0,count = 0,sum=0;
	      int a[] =  new int[n];
	      
	      for(int i=0;i<n;i++){
	        a[i] = sc.nextInt();
	        if(a[i]>low ) { low = a[i] ; } 
	        high = high + a[i];
	      }
	      
	      
	      while(high >= low) {
	    	  mid = low +(high-low)/2 ;
	    	  
	    	  for(int i=0;i<n;) {
	    		  
	    		  
	    		  if(sum + a[i] <= mid) { 
	    			  sum =sum+a[i];
	    			  i++;
	    		  if(i==n-1) {count++ ; }
	    		  }
	    		  else {
	    			  count++;
	    			  sum = 0;
	    			  
	    		  }
	    	  }
	    	  
	    	  
	    	  if(count <= days) {
	    		  res  = mid;
	    		  high = mid-1;
	    	  }
	    	  else if(count>days){
	    		  low = mid+1;
	    	  }
	    	  count=0;
	    	  sum = 0;
	      }
	      
	      
    System.out.println(res);
	}

}
