package com.Accio.binarySearch;

import java.util.Scanner;

public class Books_Sliding {

	public static void main(String[] args) {

		
		
		  Scanner sc = new Scanner(System.in);
	      int n =  sc.nextInt();
	      int  limit = sc.nextInt();

	      int a[] =  new int[n];
	      for(int i=0;i<n;i++){
	        a[i] = sc.nextInt();
	      }
	      
	      
	      int start = 0, end = 0;
	      int timespent = 0;
	      int maxlength =0;
	      
	      while(end <= n) {
	    	  
	    	  while(timespent > limit) {
	    		  timespent = timespent - a[start];
	    		  start++;
	    	  }
	    	  
	    	  timespent += a[end];
	    	  end++;
	    	  
	    	  if(timespent <= limit ) {
	    		  maxlength = Math.max(maxlength,end - start);
	    	  }
	    	  
	      }
	      
	      if(timespent <= limit) {
	    	  maxlength = Math.max(maxlength,end - start);
	      }
	      System.out.println(maxlength);

	}

}
