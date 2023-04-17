package com.DSA.course1.Stack;

import java.util.Stack;

public class queueUsingStacks {

	
	Stack<Character> enqueueStack;
	Stack<Character> dequeueStack;
	
	queueUsingStacks(){
		enqueueStack = new Stack<>();
		dequeueStack = new Stack<>();
	}
	
	void enqueue(char c) {
      enqueueStack.push(c);		
	}
	
	char dequeue() {
		if(dequeueStack.isEmpty()) {
			while(!enqueueStack.isEmpty()) {
				dequeueStack.push(enqueueStack.pop());
			}
			
		}
		return dequeueStack.pop();
		
		
		
	}
	
	
	boolean empty() {
		
		if(enqueueStack.isEmpty() && dequeueStack.isEmpty()) {
			return true;
		}
		
		return false;
	}
	
}
