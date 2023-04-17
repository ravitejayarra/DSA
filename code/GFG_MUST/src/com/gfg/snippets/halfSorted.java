package com.gfg.snippets;
import java.util.*;
import java.lang.*;
import java.io.*;

public class halfSorted
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here

      Scanner scanner = new Scanner(System.in);
		 int n = scanner.nextInt();
		 int[] a = new int[n];
		
		for(int i=0;i<n;i++) {
			a[i] = scanner.nextInt();
		}
      HalfSort(a);

      for(int i=0;i<n;i++) {
			System.out.print(a[i] + " ");
		}
	}

   public static void HalfSort(int a[]){
     int b[] = new int[a.length];

     int l= a.length/2 + a.length % 2;
     
     int i=0,j=l,k=0;

     while(i<l && j<a.length){

       if(a[i] <= a[j]){
         b[k++] = a[i++];
       }
       else{
         b[k++] = a[j++];
       }
     }

     while(i<l){
        b[k++] = a[i++];
     }

     while(j<a.length){
        b[k++] = a[j++];
     }
     
     for( i=0;i<a.length;i++) {
			a[i] = b[i];
		}
     
   }

  
}