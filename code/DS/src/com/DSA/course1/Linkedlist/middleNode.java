package com.DSA.course1.Linkedlist;



public class middleNode {

	public static void main(String[] args) {

		 
		LinkedList l1 = new LinkedList();
		l1.addFirst('a');
		l1.addLast('d');
		l1.addFirst('b');
		l1.addLast('c');
		l1.addFirst('e');
		l1.addLast('f');
		l1.addLast('z');
		l1.addLast('o');
		
		System.out.println(l1.middlenode());
		 
	}

}
