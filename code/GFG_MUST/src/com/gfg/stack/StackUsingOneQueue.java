package com.gfg.stack;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingOneQueue {

	public static void main(String[] args) {

		mystack s = new mystack();
		s.push(0);s.push(1);s.push(2);s.push(3);s.push(4);s.push(5);s.push(6);
		
		System.out.println(s.peek());
		System.out.println(s.pop());
		System.out.println(s.peek());
		System.out.println(s.pop());
		System.out.println(s.peek());
		System.out.println(s.pop());
	}

}

  //  4,3,2,1,

class mystack{
	Queue<Integer> q = new LinkedList<>();
	
	
	
	void push(int x) {
		int size = q.size();
		
		q.offer(x);
		
		for(int i=0;i<size;i++) {
			int temp = q.poll();
			q.offer(temp);
		}
		
		}
		
	
	
	int pop() {
		if(q.isEmpty()) { return -1; }
		return q.poll();
	}
	
	int peek() {
		if(q.isEmpty()) { return -1; }
		return q.peek();
	}
}
