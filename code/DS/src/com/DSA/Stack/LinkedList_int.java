package com.DSA.Stack;

public class LinkedList_int {

	
	
	 public Node_int head;
	  public Node_int tail;
	  public int size=0;
	  
	  
	  
	  
	  public void create(int value) {
		  Node_int node = new Node_int();
		  node.next=null;
		  node.value = value;
		  this.head = node;
		  this.tail = node;
		  this.size++;
	  }
	  
	  public void insertNode(int value) {
		  Node_int node = new Node_int();
		  node.value = value;
		  
		  if(head == null) {
			  this.create(value);
		  }
		  else {
			  node.next = head;
			  head=node;
			  this.size++;
		  }
	  }
	  
	  public int deleteNode() {
		  int x  =head.value;
		  head = head.next;
		  this.size--;
		  return x;
	  }
	  
	  public int Headelement() {
		  int x  =head.value;
		  return x;
	  }
	  
}
