package com.Accio.LinkedList;

import java.util.*;
import java.io.*;

public class sum {
    public static void main(String args[]) {
        //your code here
      Scanner sc = new Scanner(System.in);
      int n= sc.nextInt();
      int m= sc.nextInt();
      LinkedList l1 = new LinkedList();
      LinkedList l2 = new LinkedList();
      

      for(int i=0;i<n;i++){
        l1.insert(sc.nextInt());
      }
      for(int i=0;i<m;i++){
        l2.insert(sc.nextInt());
      }
     l1.printRev();
     System.out.println();
     l2.printRev();
     System.out.println();
    digitSum(l1,l2);
    }


  public static void digitSum(LinkedList l1,LinkedList l2){
    LinkedList sum = new LinkedList();
    Node temp1 = l1.head ,temp2 = l2.head;
    int carry=0, data = 0;
    int add = temp1.data + temp2.data;
    carry = add/10 ;
    data = add%10;
    sum.insert(data);
    temp1 = temp1.next;
    temp2 = temp2.next;
    while(temp1 != null || temp2 != null){
      int s1 =0,s2 =0;
      if(temp1 != null){ s1= temp1.data ; temp1 = temp1.next;}
      if(temp2 != null){ s2= temp2.data ; temp2 = temp2.next;}
      add = carry+ s1+s2;
      carry= 0;
      carry = add/10 ;
      data = add%10;
      sum.insert(data);
    }
    if(carry == 1){
      sum.insert(1);
    }
    sum.printRev();
    System.out.println();
  }
}// end of main class

