package com.gfg.slidingWindow;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class SlidingWindowMaximum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] list = { 1,3,-1,-3,5,3,6,7};
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		
		for (int i : list) {
			l1.add(i);
		}
		
		ArrayList<Integer> slidingMaximum = slidingMaximum(l1, 2);
		
		for (Integer integer : slidingMaximum) {
			System.out.print(integer + " ");
		}

	}

	
	public static ArrayList<Integer> slidingMaximum(final List<Integer> A, int B) {
		  
	       int n = A.size();
	       
	       ArrayList<Integer> res = new ArrayList<>();

	       Deque<Integer> dq = new LinkedList<>();
	       
	       for(int j = 0;j < B-1 ;j++){

	           while(!dq.isEmpty() && A.get(dq.peekLast()) <= A.get(j)){ dq.pollLast(); }
	           dq.offer(j);
	       }

	        
	       for(int j=B-1,i=0; j<n ;j++){
	           while(!dq.isEmpty() && A.get(dq.peekLast()) <= A.get(j)){ dq.pollLast(); }
	           dq.offer(j);

	           res.add(A.get(dq.peek())); 

	           while(!dq.isEmpty() && j-dq.peek()>=B-1){ dq.poll(); }

	       }
	      return res;
	    }
}
