package com.DSA.Recursion;

import java.util.*;
import java.io.*;

public class Main2 {
    public static void main(String args[]) {
        //your code here

Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int ans = f(n,n);
      System.out.println(ans);
    }

  public static int f(int n, int i){

    if(n==0){
      return 1;
    }
    if(n<0|| i==0) { return 0;}
  

   return f(n,i-1)+ f(n-i,i-1);
    }
  
}