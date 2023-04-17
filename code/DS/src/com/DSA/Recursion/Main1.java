package com.DSA.Recursion;
import java.io.*;
import java.util.*;
public class Main1 {
    public static void main(String args[]) {
        // your code here

      Scanner scanner = new Scanner(System.in);
		 String word = scanner.next();
         String  x = scanner.next();

      boolean ans = detector(x.length()-1,x,word);
      System.out.println(ans);
    }

  public static boolean detector(int len , String x,String word){
       if(len== -1){ return true ;}
     boolean present = false;
    for(int i=0;i<word.length();i++){
      if(x.charAt(len) == word.charAt(i)) { present = true;}
    }
    if(present){
     return  detector(len-1,x,word);
    }
    else {
     return false;
    
    
  }

  
}}