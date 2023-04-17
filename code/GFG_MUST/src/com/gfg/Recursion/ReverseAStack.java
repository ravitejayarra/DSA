package com.gfg.Recursion;

import java.util.Stack;

public class ReverseAStack {

	public static void main(String[] args) {

		 int a[] = {1,2,3,4,5,6,7};
			
			Stack<Integer> stack = new Stack<>();
			
			for(int i=0;i<a.length;i++) {
				stack.push(a[i]);
			}
			while(!stack.isEmpty()) {
				System.out.print(stack.pop() +" ");
			}
			for(int i=0;i<a.length;i++) {
				stack.push(a[i]);
			}
			
			
			reverse(stack);
			System.out.println();
			while(!stack.isEmpty()) {
				System.out.print(stack.pop() +" ");
			}
	}

	private static void reverse(Stack<Integer> stack) {

		if(stack.isEmpty()) {
			return;
		}
		else {
			int temp = stack.pop();
			reverse(stack);
			insertAtBottom(stack,temp);
		}
	}

	private static void insertAtBottom(Stack<Integer> stack, int temp) {

		if(stack.isEmpty()) {
			stack.push(temp);
			return;
		}
		else {
			int removeTop = stack.pop();
			insertAtBottom(stack,temp);
			stack.push(removeTop);
		}
	}
	
	

}
