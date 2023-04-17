package com.DSA.Stack;

public class Stack {
	
	int arr[];
	int topOfStack;
	
	Stack(int len){
		this.arr = new int[len];
		this.topOfStack =-1;
		System.out.println("stack has created with size "+ len);
	}
	
	public boolean isEmpty() {
		
		if(this.topOfStack==-1) {
			return true;
		}
		
		else {
			return false;
		}	
	}
	
	
	public boolean isFull() {
		if(this.topOfStack == this.arr.length-1) {
			return true;
		}
		else {
			return false;
		}	
	}
	
	
	public void push(int x) {
		if(this.isFull()) {
			System.out.println("stack is full");
		}
		else {
			this.arr[this.topOfStack+1]=x;
			this.topOfStack++ ;
		}
		
	}
	
	public int pop() {
		if(this.isEmpty()) {
			return -1;
		}
		else {
			int x = this.arr[this.topOfStack];
			this.topOfStack--;
			return x;
		}
		
	}
	
	public void delete() {
		this.arr= null;
		System.out.println("stack is deleted");
	}
	
	
	

}
