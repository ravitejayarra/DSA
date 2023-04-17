package com.DSA.trees;

public class Node {

	
	int data;
	Node right,left;
	
	
	public Node(int data, Node right, Node left) {
		
		this.data = data;
		this.right = right;
		this.left = left;
	}
	
	
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public Node getRight() {
		return right;
	}
	public void setRight(Node right) {
		this.right = right;
	}
	public Node getLeft() {
		return left;
	}
	public void setLeft(Node left) {
		this.left = left;
	}
}
