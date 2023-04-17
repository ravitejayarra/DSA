package com.DSA.course1.Stack;

public class Question1 {

	public static void main(String[] args) {

		
		
		MaxItemStack stack = new MaxItemStack();
		
		stack.push(0);
		stack.push(110);
		stack.push(011);
		stack.push(201);
		stack.push(30);
		stack.push(50);
		
		System.out.println(stack.maxElement());
		
		System.out.println(stack.pop());
		System.out.println(stack.maxElement());
		
	}

}
