package com.Accio.debug;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) {
        //your code here

    Scanner sc = new Scanner(System.in);
      int number= sc.nextInt();
      LinkedList l1 = new LinkedList();
      
      number++;
      int temp = number;
      while(temp !=0){
        l1.insert(temp%10);
        temp = temp/10;
      }
      
    l1.print();
      
    }
} // end of main






    class LinkedList{

    Node head;

    void insert(int data){
      if(head == null){
        Node node = new Node(data);
        node.next = null;
        head = node;
      }
      else{
     
        Node node = new Node(data);
        node.next = head;
        
         head = node;
       
      
    }
      }

    void print(){
      Node temp = head;

      while(temp != null ){
        System.out.print(temp.data + " ");
        temp = temp.next;
      }
    }

     void printRev(){
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
  
  Node(int data){
    this.data = data;
  }

  
}