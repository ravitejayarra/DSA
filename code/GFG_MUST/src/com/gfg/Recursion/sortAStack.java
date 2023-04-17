package com.gfg.Recursion;

import java.util.Stack;

public class sortAStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

         int a[] = {9,6,4,8,4,1,7,3,2,9,1};
		
		Stack<Integer> stack = new Stack<>();
		
		for(int i=0;i<a.length;i++) {
			stack.push(a[i]);
		}
		
		sort(stack);
		
		while(!stack.isEmpty()) {
			System.out.print(stack.pop() +" ");
		}
	}

	private static void sort(Stack<Integer> stack) {

		if(stack.size()==1) {
			return;
		}
		else {
			int temp = stack.pop();
			sort(stack);
			insert(stack,temp);
		}
	}

	private static void insert(Stack<Integer> stack, int temp) {

		if(stack.isEmpty() || stack.peek() < temp) {
			stack.push(temp);
		}
		else {
			int remove = stack.pop();
			insert(stack,temp);
			stack.push(remove);
		}
		
	}

}
