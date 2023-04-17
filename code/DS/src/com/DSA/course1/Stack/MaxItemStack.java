package com.DSA.course1.Stack;

import java.util.Stack;

public class MaxItemStack {
	
	Stack<Integer> mainStack;
	Stack<Integer> maxStack ;
	
	MaxItemStack(){
	 mainStack = new Stack<Integer>();
	 maxStack = new Stack<Integer>();
	}
	
	
	public void push(int x) {
		
		mainStack.push(x);
		
		if(maxStack.isEmpty()) {
			maxStack.push(x);
		}
		
		else if(x < maxStack.peek()) {
			maxStack.push(maxStack.peek());
		}
		else {
			maxStack.push(x);
		}
		
		
	}
	
	public int pop() {
		
		maxStack.pop();
		return mainStack.pop();
	}
	
	
	public int maxElement() {
		return maxStack.peek();
	}
	
	
	
	
	
	

}
