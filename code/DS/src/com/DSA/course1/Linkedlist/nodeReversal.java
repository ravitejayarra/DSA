package com.DSA.course1.Linkedlist;

public class nodeReversal {

	public static void main(String[] args) {

		LinkedList l1 = new LinkedList();
		
		l1.addLast('d');
		l1.addFirst('b');
		l1.addLast('c');
		l1.addFirst('e');
		l1.addLast('f');
		l1.addLast('z');
		l1.addLast('o');
		
		l1.traversal();
		
		l1.reverse();
		
		System.out.println("-----------");
		
		l1.traversal();
		
		
	}

}
