package com.Accio.basic;
//
//import java.util.Scanner;
//
//public class digitSum {
//
//	static long answer=0;
//	public static void main(String[] args) {
//		long sum=0;
//		Scanner sc = new Scanner(System.in);
//	      String n = sc.next();
//	      int k2 = sc.nextInt();
//	      String k="";
//	       long p=0;
//	      for(int i =0;i<k2;i++){
//	        k = k+n ;
//	      }
//	     
//	      char[] digits = k.toCharArray();
//	      
//	      for(int i=0;i<digits.length;i++) {
//	    	  sum +=digits[i]-'0';
//	      }
//	      long superDigit = superDigit(sum);
//	      System.out.println(superDigit);
//	      
//	     
//	}
//	private static  long superDigit(long p) {
//
//		if(p/10 ==0) { return p ;}
//		
//		answer = p%10 + superDigit(p/10);
//    
//         
//		
//		return superDigit(answer);
//		
//	}
//
//}






import java.io.*;
import java.util.*;
public class digitSum {

    public static int sum(int a[],int n){
      if(n==-1){
        return 0;
      }

      return a[n]+sum(a,n-1);
    }
  
    public static void main(String args[]) {
        // your code here
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();

      for(int i=1;i<=t;i++){
        int n = sc.nextInt();
        int a[] = new int[n];

        for(int j=0;j<n;j++){
          a[i] = sc.nextInt();
        }
        System.out.println("Case "+i+": "+sum(a,n-1));
      }

      
      
      
    }
}