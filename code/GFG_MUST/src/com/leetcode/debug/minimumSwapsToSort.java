package com.leetcode.debug;
import java.util.*;
import java.lang.*;
import java.io.*;

public class minimumSwapsToSort
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here

         Scanner scanner = new Scanner(System.in);
		 int n = scanner.nextInt();
		 int[] a = new int[n];
      
         ArrayList<pair> list = new ArrayList<>();
      
		for(int i=0;i<n;i++) {
		  a[i] = scanner.nextInt();
          list.add(new pair(a[i],i));
		}

       Comparator<pair> com = new Comparator<pair>()
       {
         public int compare(pair p1,pair p2){
              if(p1.value > p2.value){ return 1;}
              else if(p1.value < p2.value) { return -1;}
              else { return 0;}
         }
       };

      Collections.sort(list,com);

       int count =0;
       
      
       

      for(int i=0;i<list.size();i++){
          if(i == list.get(i).index){ continue; }
        else{
           count++;
           pair p1 = list.get(i);
           pair p2 = list.get(list.get(i).index);
           
           list.set(i,p2);
           list.set(p1.index,p1);
           i--;
           System.out.println();
           for (pair pair : list) {
       		System.out.print(pair.value + "->"+pair.index + " ");
       	    }
        }
          
      }
      System.out.println();
      System.out.println(count);
	}// end of main method
}




 class pair{

   int value,index;

   pair(){}

   pair(int val,int index){
     this.value = val;
     this.index = index;
   }
 }