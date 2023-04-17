package com.gfg.stack;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) {
        //your code here

       Scanner sc = new Scanner(System.in);
      int n= sc.nextInt();
      LinkedList l1 = new LinkedList();
      for(int i=0;i<n;i++){
        l1.insert(sc.nextInt());
      }

      l1.exchange(l1.head);
      l1.print();
    }
}



class Node{

   int data;
   Node next;
  Node(){}
  Node(int data){
    this.data = data;
  }

  
} // end of Node class



class LinkedList{

    Node head;

    void insert(int data){
      if(head == null){
        Node node = new Node(data);
        
        head = node;
        node.next = head;
      }
      else{
      Node temp = head.next;
      while(temp.next != head){
        temp = temp.next;
      }
        Node node = new Node(data);
        node.next = head;
        temp.next = node;
      
    }
      }

    void print(){
      Node temp = head;
      System.out.print(temp.data + " ");
     temp = temp.next;
      while(temp != head ){
        System.out.print(temp.data + " ");
        temp = temp.next;
      }
    }

    
     void exchange(Node head){


       Node dummy = new Node();
       dummy.next = head;
       
          Node temp = head.next;
        while( temp.next != null && temp.next.next != head){
             temp = temp.next;
           }

        Node firstNext = head.next;
         Node lastNode = temp.next;
         temp.next = head;
         head.next = lastNode;
         lastNode.next = firstNext;

        this.head =  lastNode;
       }
       
     } // end of exchange
     
    
     
    
  

