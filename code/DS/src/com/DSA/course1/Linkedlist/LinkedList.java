package com.DSA.course1.Linkedlist;

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
	  
	  public void addFirst(char value) {
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
	  
	  public char middlenode() {
		  
		  Node slow = head;
		  Node fast = head;
		  
		  while(fast.next != null && fast.next.next != null) {
			  slow = slow.next;
			  fast = fast.next.next;
		  }
		  
		return slow.value;
		  
	  }
	  
	  public void addLast(char value) {
		  Node node = new Node();
		  node.value = value;  
		  
		  if(head == null) {
			  this.create(value);
		  }
		  else {
			  node.next = null;
			  tail.next=node;
			  tail = node;
			  this.size++;
		  }
	  }
	  
	  
	  
	  public void reverse() {
		  Node previous =null;
		  Node current = head;
		  Node next = null;
		  
		  while(current != null ) {
			  next = current.next;
			  current.next = previous;
			  previous = current;
			  current = next;
		  }
		  head = previous;
		  
		  
	  }
	  
	  
	  
	  public void traversal() {
		 Node t = head; 
		  
		  while(t !=null) {
			  System.out.print(t.value +" ");
			  t = t.next;
		  }
	  }
	  
	  
	  
	  
	  
	  
	  public char deleteFirst() {
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