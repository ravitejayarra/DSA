package com.Accio.binarySearch;

import java.util.*;
import java.io.*;

public class Ksum {
    public static void main(String args[]) {
        //your code here
      
      Scanner sc = new Scanner(System.in);
		      int n =  sc.nextInt();
		      int  k = sc.nextInt();

		      int a[] =  new int[n];
		      for(int i=0;i<n;i++){
		        a[i] = sc.nextInt();
		      }

      int high = 0,low =1,res = -1,mid,sum=0;
      
      for(int i=0;i<n;i++){
        if(a[i] > high) { high = a[i] ; }
      }

     while(high >= low){

      mid  = low+(high-low)/2;
       
       for(int i=0;i<n;i++){
         sum += a[i]/mid + (a[i]%mid == 0 ? 0:1);
       }

       if(sum <= k){
         res = mid;
         high = mid-1;
       }
       else{
         low = mid+1;
       }
       sum=0;
     }

      System.out.println(res);
      
     
      
    }
}