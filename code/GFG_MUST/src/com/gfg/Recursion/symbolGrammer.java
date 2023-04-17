package com.gfg.Recursion;

public class symbolGrammer {

	public static void main(String[] args) {

		System.out.println(kthGrammar(5,12)); 
	}
	
	
	
	    public static int kthGrammar(int n, int k) {
	        
	        
	        if(k==1){return 0;}
	        
	        int mid = (int)Math.pow(2,n-1)/2;
	        
	        if(k <=mid ){ return kthGrammar(n-1,k);}
	        else{ return 1^(kthGrammar(n-1,k-mid));}
	        
	    }
	

}

