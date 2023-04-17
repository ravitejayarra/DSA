package com.DSA.Stack;

public class Stack_LL {

	LinkedList linkedlist;
	
	Stack_LL(){
		linkedlist = new LinkedList();
		
	}
	
	
	boolean isEmpty() {
		
		
		if(linkedlist.size==0) {
			return true;
		}
		else {
			return false;
		}
		
		
	}
	
	void push(char x) {
		linkedlist.insertNode(x);
		
	}
	
	char pop() {
		if(this.isEmpty()) {
			return '0';
		}
		char x = linkedlist.deleteNode();
		return x;
	}
	
	char peek() {
		char x = linkedlist.Headelement();
		return x;
	}
	
}
