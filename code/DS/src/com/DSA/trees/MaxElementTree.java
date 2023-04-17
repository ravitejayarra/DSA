package com.DSA.trees;

public class MaxElementTree {

	public static void main(String[] args) {

		Tree t = new Tree();
		
		Node root = t.create();
		
		int maxElement = t.maxElement1(root);
		
		t.levelorder(root);
		 Node parent = t.insertElement(root,1000);
		
		
		boolean found = t.searchElement(root,100);
		
		System.out.println();
		
		System.out.println("---"+maxElement + "---- ");
		
		System.out.println("---"+found + "---- ");
		
		t.levelorder(parent);
		
		
	}

}
