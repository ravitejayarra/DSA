package com.leetcode.debug;
import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	static TreeNode root = null;
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
         Scanner scanner = new Scanner(System.in);
		 int n = scanner.nextInt();
         int k = scanner.nextInt();
         
      for(int i=0;i<n;i++){
        int input = scanner.nextInt();
        insert(root,input);
      }
      root =  delete(root,k);
      preorder(root);
	}

    public static void insert(TreeNode root,int input){
      TreeNode node = new TreeNode(input);
      if(root==null){
        root = node;
        return;
      }
      TreeNode temp = root;
      TreeNode prev = null;

      while(temp != null){
        prev = temp;
        if(input < temp.data){temp = temp.left;}
        else{
         temp = temp.right;
        }
      }

      if(input < prev.data){ prev.left = node;}
      else{
        prev.right = node;
      }
      return;
    }

  public static TreeNode delete(TreeNode node,int k){

    if(node==null){ return node;}
    
    if(k<node.data){
      node.left = delete(node.left,k);
    }
    else if(k>node.data){
      node.right = delete(node.right,k);
    }
    else{

      if(node.left ==null){
        return node.right;
      }
      else if(node.right==null){
        return node.left;
      }

      node.data = insucc(node);
      node.right = delete(node.right,node.data);
      
    }
    return node;
  }

  public static int insucc(TreeNode temp){
    temp = temp.right;
    while(temp.left != null){
      temp = temp.left;
    }
    return temp.data;
  }

  public static void preorder(TreeNode node){
    if(node != null){
      System.out.print(node.data+" ");
      preorder(node.left);
      preorder(node.right);
    }
  }
}

 class TreeNode {

	 int data;
	 TreeNode left;
	 TreeNode right;
	 
	 TreeNode(){}
	 TreeNode(int data){ this.data = data; }
}

