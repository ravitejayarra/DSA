package com.gfg.Recursion;

import java.util.LinkedList;
import java.util.List;

public class Josephus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
              System.out.println(josephus(5,2));
	   }
	
	
		   public static int josephus(int n,int k)
	       {
	        	        
	        List<Integer> list = new LinkedList<>();
	        
	        for(int i=1;i<=n;i++){list.add(i); }
	      
	        solve(list,k,0);
	        
	        return list.get(0);
	        
	       }
	    
	    public static void solve(List<Integer> list,int k,int idx){
	        
	        if(list.size()==1){ return; }
	        
	       
	        idx = (idx + (k-1))%list.size();
	        
	        list.remove(idx);
	        
	        solve(list,k,idx);
	        
	     
	       }

	}




