package com.Accio.basic;
import java.io.*;
import java.util.*;
public class TwoSum_sliding {
    public static void main(String args[]) {
        // your code here

      Scanner sc = new Scanner(System.in);
	      int n =  sc.nextInt();
	      int  limit = sc.nextInt();

	      int a[] =  new int[n];
	      for(int i=0;i<n;i++){
	        a[i] = sc.nextInt();
	      }
      int start =0,end=0;
      int total = 0;

      while(end <n){

        while(total > limit ){
          total = total- a[start];
          start++;
        }
        while(end - start >2) {
        	start++;
        }

         total += a[end++];
        
         
        if(total == limit && end-start ==2){
          System.out.println(start + " "+ (end-1));
          break;
        }
      }
      
      if(total == limit && end-start ==2){
          System.out.println(start + " "+ (end-1));
          
        }
      
    }
}