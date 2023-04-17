package com.Accio.sorting;

import java.util.*;
import java.io.*;

public class Main5 {

   public static void swap(int[] a, int x ,int y){
       int temp = a[y];
       a[y] = a[x];
       a[x] = temp;
     
   }

  
   public static int part(int[] a, int l ,int h){
     int pivot = a[l];
     int i = h+1;

     for(int j = h ;j > l;j--){
       if(a[j] > pivot){
         i--;
         swap(a,i,j);
       }
     }
   swap(a,i-1,l);
     return i-1;
     
   }


  
    public static void main(String args[]) {

     Scanner sc = new Scanner(System.in);
      int n =  sc.nextInt();

      int a[] =  new int[n];
      for(int i=0;i<n;i++){
        a[i] = sc.nextInt();
      }

      quicksort(a,0,n-1);
      System.out.println();
      for (int i : a) {
		System.out.print(i + " ");
	}
      
    }



   public static void quicksort(int[] a,int l,int h){

     if(h>l){

       int p  = part(a,l,h);
       
      quicksort(a, l, p-1);
      quicksort(a, p+1, h);
     }

     
   }


  
}