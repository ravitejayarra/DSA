package com.gfg.stack;

import java.util.Stack;

public class SortingaStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Stack<Integer> stack = new Stack<>();
		stack.push(11);
		stack.push(2);
		stack.push(32);
		stack.push(3);
		stack.push(41);
		
		sort(stack);
		while(!stack.isEmpty()) { System.out.print(stack.pop()+" "); }
	}

	private static void sort(Stack<Integer> stack) {
	
		if(!stack.isEmpty()) {
		int temp = stack.pop();
		 
		sort(stack);
		
		rearrange(temp,stack);
		
		}
	}

	private static void rearrange(int temp, Stack<Integer> stack) {

		if(stack.isEmpty() || temp > stack.peek()) { stack.push(temp); }
		
		else {
			int x = stack.pop();
			rearrange(temp, stack);
			stack.push(x);
		}
	}

}
