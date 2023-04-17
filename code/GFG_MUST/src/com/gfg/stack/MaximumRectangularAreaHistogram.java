package com.gfg.stack;

import java.util.Stack;

public class MaximumRectangularAreaHistogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long[] arr = {6,2,5,4,5,1,6};
		
		Solution1 s1 = new Solution1();
		long ans = s1.getMaxArea(arr, arr.length);
		System.out.println(ans);
		
	}

}



class Solution1
{
    //Function to find largest rectangular area possible in a given histogram.
    public static long getMaxArea(long hist[], long n) 
    {
        // your code here
        int size = (int) n;
        
        Stack<Pair> s = new Stack();
        
        
        
       int[] leftSmaller = new int[size];
       
       int[] rightSmaller = new int[size];
       
       
       
       
       for(int i=size-1;i>=0;i--){
           
           Pair p = new Pair();
           
           if(s.isEmpty()){  rightSmaller[i] = size;  p.value =hist[i]; p.index = i; }
           
           
           else if(s.peek().value< hist[i]) { 
               rightSmaller[i] = s.peek().index; 
               p.value = hist[i];
               p.index = i;
               }
           
           else if(s.peek().value >= hist[i]){
           while(!s.isEmpty() && s.peek().value >= hist[i]){  s.pop(); }
           
           if(s.isEmpty()){ rightSmaller[i] = size; p.value =hist[i]; p.index = i;}
           
           else if(s.peek().value < hist[i]) {
               rightSmaller[i] = s.peek().index;
               p.value = hist[i];
               p.index = i;
               }
           
           }
           
           s.push(p);
       }
       
       while(!s.isEmpty()) { s.pop(); }
       
        
       
       for(int i =0;i<size ;i++){
           
    	   Pair p = new Pair();
           if(s.isEmpty()){ leftSmaller[i] = -1;  p.value =hist[i]; p.index = i;}
           
           else if(s.peek().value < hist[i]){ 
               leftSmaller[i] = s.peek().index; 
                p.value = hist[i];
                p.index = i;
           }
           
           else if(s.peek().value >= hist[i]){
           
           while(!s.isEmpty() && s.peek().value >= hist[i]){  s.pop(); }
           
           if(s.isEmpty()){ leftSmaller[i] = -1;  p.value =hist[i]; p.index = i; }
           
           else if(s.peek().value < hist[i]){ 
               leftSmaller[i] = s.peek().index; 
               p.value = hist[i];
               p.index = i;
           }
           }
           
           
           s.push(p);
       }
       
       long max = Long.MIN_VALUE;
       for(int i= 0 ;i <size;i++){
          long area;
          
          area = hist[i] * (rightSmaller[i]-leftSmaller[i]-1) ;
           
           max = Math.max(max,area);
       }
       
        
        return max;
        
    }
        
}


class Pair{
   long value;
   int index;
   Pair(){ }
   Pair(long value,int index){
       this.value = value;
       this.index = index;
   }
}
