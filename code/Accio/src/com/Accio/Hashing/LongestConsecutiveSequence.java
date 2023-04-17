package com.Accio.Hashing;
import java.util.*;
import java.lang.*;
import java.io.*;

public class LongestConsecutiveSequence
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
      Scanner sc= new Scanner(System.in);
      int n =  sc.nextInt();
      int a[] = new int[n];
      
     
      

      Set<Integer> set = new HashSet<>();
      
      
      for(int i=0;i<n;i++){
        a[i] = sc.nextInt();
        set.add(a[i]);
      }

      int j,gmax=0,lmax=0;
      for(int i=0;i<n;i++){
       // System.out.println(a[i]);
        if(!set.contains(a[i]-1)){
          j = a[i];

          while(set.contains(j+1)){  j++; }

          lmax = j-a[i]+1 ;
          if(lmax>gmax){ gmax = lmax;}
        }
        
      }
      System.out.println(gmax);
	}
}