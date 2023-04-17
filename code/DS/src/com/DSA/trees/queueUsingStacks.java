package com.DSA.trees;
import java.util.Stack;

public class queueUsingStacks {

	
	Stack<Node> enqueueStack;
	Stack<Node> dequeueStack;
	
	queueUsingStacks(){
		enqueueStack = new Stack<>();
		dequeueStack = new Stack<>();
	}
	
	void enqueue(Node c) {
      enqueueStack.push(c);		
	}
	
	Node dequeue() {
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
