package com.Accio.sorting;

import java.util.*;
import java.io.*;

// one testcase failing

public class mergeSort {
    public static void main(String args[]) {
        //your code here

        Scanner sc = new Scanner(System.in);
	      int n =  sc.nextInt();
	     // int  limit = sc.nextInt();

	      int a[] =  new int[n];
	      for(int i=0;i<n;i++){
	        a[i] = sc.nextInt();
	      }

      mergeSort(a,0,n-1);
      
      for (int i : a) {
		System.out.print(i + " ");
	}
    }

  public static void mergeSort(int[] a,int l,int h){

    if(h>l){
     int mid = l+(h-l)/2;
     mergeSort(a,l,mid);
     mergeSort(a,mid+1,h);
     merge(a,l,mid,h);
      }
  }

  public static void merge(int[] a,int l ,int mid, int h){
    int b[] = new int[h+1];
    int i = l,j=mid+1,k=l;
    while(i<=mid && j <= h){
      if(a[i] <= a[j]){
        b[k++] = a[i++];
      }
      else{
        b[k++] = a[j++];
      }
    }

    while(i <= mid){
      b[k++] = a[i++];
    }

    while(j<=h){
       b[k++] = a[j++];
    }
  
   for(i =l;i<=h ;i++){
     a[i] = b[i];
   }  
  }
  
}