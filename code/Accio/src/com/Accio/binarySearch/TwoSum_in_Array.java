package com.Accio.binarySearch;
import java.io.*;
import java.util.*;
public class TwoSum_in_Array {
    public static void main(String args[]) {
        // your code here

      Scanner sc = new Scanner(System.in);
	      int n =  sc.nextInt();
	      int  limit = sc.nextInt();

	      int a[] =  new int[n];
	      for(int i=0;i<n;i++){
	        a[i] = sc.nextInt();
	      }

       int b[] =  new int[n];
      for(int i=0;i<n;i++){
        b[i] = a[i];
      }

        Arrays.sort(a);
      
        int start =0,end=n-1;
        
        
      // 7 5 3 9 5 14 10 2 17


          while(end > start){
           
            if(a[end] + a[start] == limit){
              break;
            }
            else if(a[end]+a[start] > limit){
              end--;
            }
            else{
              start++;
            }
          
          }

      int l=0,r=0;
        for(int i=0;i<n;i++){
          if(b[i] == a[start]){
            l =i;
            break;
          }
      }
       for(int i=0;i<n;i++){
           if(i == l){
             continue;
           }       
         
          else if(b[i] == a[end]){
            r =i;
            break;
          }
      }

      if(l > r){
        int temp = l;
        l=r;
        r= temp;
      }
      
    System.out.println(l + " "+ r);
      
    }
}