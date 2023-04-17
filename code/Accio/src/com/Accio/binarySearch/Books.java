package com.Accio.binarySearch;
import java.io.*;
import java.util.*;
public class Books {
    public static void main(String args[]) {
  
      // your code here
       Scanner sc = new Scanner(System.in);
      int n =  sc.nextInt();
      int  limit = sc.nextInt();

      int a[] =  new int[n];
      for(int i=0;i<n;i++){
        a[i] = sc.nextInt();
      }


      int p[] = new int[n];
       p[0] = a[0];
      for(int i=1;i<n;i++){
        p[i] = p[i-1]+a[i];
      }
      
      
      
      
      
       int maxLength = 0;
       
       
       
       
       
      for(int i=0;i<n;i++){
       int low  = i, high = n-1,mid;
       
       int subtract = (i-1 >= 0 ? p[i-1] : 0) ;
       
       while(high >= low){
       mid = (low+high)/2 ;
       
        int timeSpent = p[mid] - subtract ;

         if(timeSpent <= limit){
           low = mid+1;
           maxLength = Math.max(maxLength , mid-i+1);
         }
         else{
           high = mid- 1;
         }
         
       }

        
      }

    System.out.println(maxLength);

      
      
    }
}