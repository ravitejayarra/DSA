package com.Accio.binarySearch;
import java.io.*;
import java.util.*;
public class IceCream {
    public static void main(String args[]) {
        // your code here
         Scanner sc = new Scanner(System.in);
       int t =  sc.nextInt();

      for(int i=0;i<t;i++){
      int  money = sc.nextInt();
      int n =  sc.nextInt();
      

      int a[] =  new int[n];
      for(int j=0;j<n;j++){
        a[j] = sc.nextInt();
      }
        int b[] =  new int[n];
      for(int j=0;j<n;j++){
        b[j] = a[j];
      }


        
        Arrays.sort(a);
        f(a,n,money,b);
        }
      
      

      
      
    }



  public static void f(int a[],int n,int money,int b[]){
      int low =0, high =n-1;

    while(high>low){
      if(a[high]+a[low] == money){
        // low++;
        // high++;
        // System.out.println(low+ " "+ high);
        break;
      }

      else if(a[high]+a[low] < money){
        low++;
      }
      else{
        high--;
      }
    }
    int l =-1,h=-1;
    for(int i=0;i<n;i++){
      if(b[i] == a[low]) {  l = i ;  break;}
    }
    for(int i=0;i<n;i++){
      if(i == l) { continue;}
      else if(b[i] == a[high]) {  h = i ; break;}
    }

    l++;
    h++;
    if(l != -1 && h != -1){
      System.out.println(l + " "+ h);
    }



    
  }





  
}