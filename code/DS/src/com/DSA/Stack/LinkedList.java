package com.DSA.Stack;

public class LinkedList {

	  public Node head;
	  public Node tail;
	  public int size=0;
	  
	  
	  
	  
	  public void create(char value) {
		  Node node = new Node();
		  node.next=null;
		  node.value = value;
		  this.head = node;
		  this.tail = node;
		  this.size++;
	  }
	  
	  public void insertNode(char value) {
		  Node node = new Node();
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
	  
	  public char deleteNode() {
		  char x  =head.value;
		  head = head.next;
		  this.size--;
		  return x;
	  }
	  
	  public char Headelement() {
		  char x  =head.value;
		  return x;
	  }
	  
}
