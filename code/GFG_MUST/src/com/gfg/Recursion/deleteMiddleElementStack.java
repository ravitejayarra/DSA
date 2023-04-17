package com.gfg.Recursion;

import java.util.Stack;

public class deleteMiddleElementStack {

	public static void main(String[] args) {

		 int a[] = {1,2,3,4,5,6};
			
			Stack<Integer> stack = new Stack<>();
			
			for(int i=0;i<a.length;i++) {
				stack.push(a[i]);
			}
			
			int k = (stack.size()/2) +1 ;
			deleteMiddle(stack,k);
			
			while(!stack.isEmpty()) {
				System.out.print(stack.pop() +" ");
			}
	}

	private static void deleteMiddle(Stack<Integer> stack,int k) {
		if(k==1) {
			stack.pop();
			return;
		}
		else {
			int temp = stack.pop();
			deleteMiddle(stack,k-1);
			stack.push(temp);
		}
	}

}
