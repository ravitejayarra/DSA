package com.Accio.LinkedList;

import java.util.*;
import java.io.*;


 
public class sorting {
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int n= sc.nextInt();
      LinkedList1 l1 = new LinkedList1();
      for(int i=0;i<n;i++){
        l1.insert(sc.nextInt());
      }

     
     Node head = mergeSort(l1.head);

      l1.print(head);
      
    }

  public static Node mergeSort(Node head){

    if(head == null || head.next == null){
      return head;
    }

    Node mid = findMid(head);
    Node midToNext = mid.next;
    mid.next = null;
    Node left = mergeSort(head);
    Node right = mergeSort(midToNext);
    
    Node merged = merge(left,right);
    return merged;
    
    
  }// end of merge sort

  public static Node merge(Node left,Node right){
	  
	  Node dummy = new Node();
     Node merged = new Node();
     dummy.next = merged;

     while(left != null && right != null){

       if(left.data <= right.data){
         merged.next = new Node(left.data);
         merged = merged.next;
         left = left.next;
       }
       else{
         merged.next = new Node(right.data);
         merged = merged.next;
         right = right.next;
       }
     }

    while(left != null){
      merged.next = new Node(left.data);
      merged = merged.next;
      left = left.next;
    }
    
    while(right !=null ){
      merged.next = new Node(right.data);
         merged = merged.next;
         right = right.next;
    }

    return dummy.next.next;
  }
  
  public static Node findMid(Node head){

    Node slow = head,fast = head;
    while(fast.next != null && fast.next.next != null){
      slow = slow.next;
      fast = fast.next.next;
    }
    return slow;
  } // end of middle node
  
  
}// end of Main class




   class LinkedList1{

    Node head;

    void insert(int data){
      if(head == null){
        Node node = new Node(data);
        node.next = null;
        head = node;
      }
      else{
      Node temp = head;
      while(temp.next != null){
        temp = temp.next;
      }
        Node node = new Node(data);
        node.next = null;
        temp.next = node;
      
    }
      }

    void print(Node temp1){
      Node temp = temp1;

      while(temp != null ){
        System.out.print(temp.data + " ");
        temp = temp.next;
      }
    }

  } // end of LL class