package com.Accio.check;

public class q2 {

	public static void main(String[] args) {
         Solution1 s1 =new Solution1();
       System.out.println(s1.mySqrt(2147395599));
	}
}
	
	class Solution1 {
	    public long mySqrt(int x) {
	        
	        long low =1,high =x/2,mid;
	        long res=0,res2 =0;
	        
	        if(x==0 || x==1 ){ return x;}
	        else if(x==2|| x==3) {return 1; }
	        
	        while(high >= low){
	            mid = low+(high-low)/2;
	            res = mid*mid; 
	            res2 = (mid+1) * (mid+1);
	            if(res == x || (res < x && res2> x)){
	                return mid;
	                
	            }
	            else if(res > x){
	                 high = mid-1;
	            }
	            else{
	               low = mid+1;
	            }
	            res = 0;
	            res2=0;
	        }
	        return -1;
	    }
	}


