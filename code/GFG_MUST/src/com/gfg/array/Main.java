package com.gfg.array;
import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here

      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int k = sc.nextInt();
      int count = 0;
      int a[] = new int[n];
      for(int i=0;i<n;i++){
        a[i] = sc.nextInt();
        if(a[i]/2 == 1) { count++;}
      }
      if(count-k >=0){
      System.out.println(count-k+1);
	   }
      else{
        System.out.println(0);
    }
      
      }
}