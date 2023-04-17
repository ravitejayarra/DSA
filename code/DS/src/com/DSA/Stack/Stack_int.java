package com.DSA.Stack;

public class Stack_int {

LinkedList_int linkedlist;
	
	Stack_int(){
		linkedlist = new LinkedList_int();
		
	}
	
	
	boolean isEmpty() {
		
		
		if(linkedlist.size==0) {
			return true;
		}
		else {
			return false;
		}
		
		
	}
	
	void push(int x) {
		linkedlist.insertNode(x);
		
	}
	
	int pop() {
		if(this.isEmpty()) {
			return '0';
		}
		int x = linkedlist.deleteNode();
		return x;
	}
	
	int peek() {
		int x = linkedlist.Headelement();
		return x;
	}
	
	
	
	
}
