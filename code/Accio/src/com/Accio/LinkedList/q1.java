package com.Accio.LinkedList;

import java.util.*;
import java.io.*;

public class q1 {
    public static void main(String args[]) {
        //your code here
      Scanner sc = new Scanner(System.in);
      int n= sc.nextInt();
      LinkedList l1 = new LinkedList();
      for(int i=0;i<n;i++){
        l1.insert(sc.nextInt());
      }
     // l1.print();
     // l1.printRev();
      l1.Deletemiddle();
      l1.print();
      
    }
}

   class LinkedList{

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

    void print(){
      Node temp = head;

      while(temp != null ){
        System.out.print(temp.data + " ");
        temp = temp.next;
      }
    }

     public void printRev(){
       Node prev = null,current= head,next;
       
        while( current != null){
          next = current.next;
          current.next = prev;
          prev= current;
          current = next;
        }
       head = prev;

       this.print();
     }
     
     
     void Deletemiddle(){
         Node slow= head,fast = head,prev=null;
        if(head.next == null){
          head.data = -1;
          return;
        }
         
         while(fast.next != null && fast.next.next != null){
           prev = slow;
           slow = slow.next;
           fast = fast.next.next;
         }
        if(fast.next == null){
          //odd number
          prev.next = slow.next;
        }
         else{
           slow.next = slow.next.next;
         }
         
       }

     
    
  }



 class Node{

   int data;
   Node next;
  
   Node(){}
   
  Node(int data){
    this.data = data;
  }

  
}