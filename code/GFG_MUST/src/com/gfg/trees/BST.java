package com.gfg.trees;

import java.util.ArrayList;
import java.util.List;

public class BST {

	TreeNode root=null;
	List<Integer> list = new ArrayList<>();
	
	void insert(int data) {
		if(root == null) {
			TreeNode newNode = new TreeNode(data);
			root = newNode;
		}
		else {
			
			TreeNode temp = root;
			TreeNode prev = null;
			
			while(temp != null) {
				prev = temp;
				
				if(data > temp.data) { temp = temp.right; }
				else { temp = temp.left; }
			}
			
			if(data > prev.data) { 
				TreeNode newNode = new TreeNode(data);
				prev.right = newNode;
			}
			else {
				TreeNode newNode = new TreeNode(data);
				prev.left = newNode;
			}
		}
	}
	
	void inOrder(TreeNode root){
		
		if(root != null) {
		inOrder(root.left);
		list.add(root.data);
		inOrder(root.right);
	       }
	}
	
	
	public  TreeNode deleteNode(TreeNode root, int X) {
        // code here.
        
       if(root == null){return root; }
       
       if(X > root.data){
           root.right = deleteNode(root.right,X);
       }
       else if(X < root.data){
           root.left = deleteNode(root.left,X);
       }
       else{
           
           if(root.left==null){
               return root.right;
           }
           else if(root.right == null){
               return root.left;
           }
           
         root.data =  inSucc(root);
         root.right = deleteNode(root.right,root.data);
       }
        
      return root;  
    }
    
    public  int inSucc(TreeNode root){
        
    	TreeNode temp = root.right;
        
        while(temp.left != null){ temp = temp.left; }
        
        
        return temp.data;
    }
    
    
	
	
	
	
	
	
	
}
