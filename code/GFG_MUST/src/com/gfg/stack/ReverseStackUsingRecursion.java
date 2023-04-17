package com.gfg.stack;

import java.util.Stack;

public class ReverseStackUsingRecursion {

	public static void main(String[] args) {

		Stack<Integer> stack = new Stack<>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		
		
//		while(!stack.isEmpty()) { System.out.print(stack.pop()+" "); }
//		System.out.println();
		
	
		
		reverse(stack);
		
		while(!stack.isEmpty()) { System.out.print(stack.pop()+" "); }
		
	}

	private static void reverse(Stack<Integer> stack) {
		
		if(!stack.isEmpty()) {
			
			int temp = stack.pop();
			
			reverse(stack);
			
			InsertAtBottom(temp,stack);
		}
		
	}

	private static void InsertAtBottom(int temp, Stack<Integer> stack) {

		if(stack.isEmpty()) { stack.push(temp); }
		else {
			int x = stack.pop();
			InsertAtBottom(temp,stack);
			stack.push(x);
			
		}
	} // end of InsertAtBottom

}
