package com.leetcode.debug;
import java.util.*;
import java.lang.*;
import java.io.*;

// { Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
import java.math.*;



public class LargestBST 
{
    
    public static void main(String args[]) throws IOException {
      
    	Btree tree = new Btree();
    	Node root = tree.create();
    	
    	int i = SolutionX.largestBst(root);
        System.out.println(i);
    }
}




class SolutionX{
    
    // Return the size of the largest sub-tree which is also a BST
    static int largestBst(Node root)
    {
        // Write your code here
       
       
       
        Info i = findLargestBST(root);
        return i.size;
    }
    
    static Info findLargestBST(Node node){
        
        if(node==null)
        {
        	 Info info = new Info(Integer.MIN_VALUE,Integer.MAX_VALUE,0,true); 
        	 System.out.println(info.isValid);
        	 return info;
        	}
        

        
        Info left  =  findLargestBST(node.left);
        Info right =  findLargestBST(node.right);
        
        Info current = new Info();
        
        
         current.min = Math.min(node.data,left.min);
         current.max = Math.max(node.data,right.max);
         
         
        boolean isBst = node.data > left.max && node.data < right.min;
        
        if(left.isValid && right.isValid && isBst){
            current.isValid = true;
            current.size = 1+ left.size + right.size;
        }
        else{
            current.isValid = false;
            current.size = Math.max(left.size,right.size);
            
        }
         
        return current; 
    }
    
}





class Info{
    
    int max,min,size;
    boolean isValid;
    
    Info(){}
    
    Info(int max,int min,int size,boolean isvalid){
        this.max = max;
        this.min = min;
        this.size = size;
        this.isValid = isvalid;
        System.out.println(isvalid);
    }
}