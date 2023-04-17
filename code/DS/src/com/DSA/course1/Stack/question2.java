package com.DSA.course1.Stack;

public class question2 {

	public static void main(String[] args) {

		
		queueUsingStacks queue = new queueUsingStacks();
		
		queue.enqueue('a');
		queue.enqueue('b');
		queue.enqueue('c');
		queue.enqueue('d');
		queue.enqueue('e');
		queue.enqueue('f');
		
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
	}

}
