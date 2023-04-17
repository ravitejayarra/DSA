package com.gfg.snippets;


import java.util.*;
import java.lang.*;
import java.io.*;

public class permutationOfString
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
      Scanner scanner = new Scanner(System.in);
		 String  str = scanner.next();
         int idx =0;
       
      List<String> ans = new ArrayList<>();
       f(str,idx,ans);
      //Collections.sort(ans);
      for(int i=0;i<ans.size();i++){
        System.out.print(ans.get(i) + " ");
      }
	}

    public static void f(String  str,int idx,List<String> ans){

      if(idx >= str.length()){
       
        ans.add(str);
        return;
      }

      for(int j=idx;j<str.length();j++){
            str = swap(str,idx,j);
            f(str,idx+1,ans);
           str = swap(str,idx,j);
        
      }
      
    }

    public static String swap(String  str,int idx,int j){
      char ch[] = str.toCharArray();
      char temp = ch[idx];
      ch[idx] = ch[j];
      ch[j] = temp;
      String s = new String(ch);
      return s;
    }

  
}