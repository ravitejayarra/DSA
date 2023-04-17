package com.Accio.basic;

import java.util.*;
import java.io.*;

public class sum {
    public static void main(String args[]) {
        //your code here

          Scanner sc = new Scanner(System.in);
	      int n =  sc.nextInt();
	      

	      int a[] =  new int[n];
	      for(int i=0;i<n;i++){
	        a[i] = sc.nextInt();
	      }

      int sum[] = new int[n];
      for(int i =0;i < n;i++){

        for(int j=0;j<n;j++){
           if(j==i){
             //j++;
             continue;
           } 
          else{
            sum[i] += a[j]; 
          }
          
        }
      }

      for(int i=0;i<n;i++){
        System.out.print(sum[i] + " ");
      }
      
    }
}