package com.Accio.BST;

import java.util.ArrayList;
import java.util.Stack;

public class BST {

	
	public ArrayList<Integer> l1 = new ArrayList<Integer>();
	
	public static void main(String[] args) {

		
		
	      BST tree = new BST();
	      Node root = tree.insert(null, 40);
	      tree.insert(root, 20);
	      tree.insert(root, 50);
	      tree.insert(root, 9);
	      tree.insert(root, 45);
	      tree.insert(root, 47);
	      
	      tree.insert(root, 60);
	      tree.insert(root, 5);
	      tree.delete(root, 40);
	      tree.delete(root, 45);
	      tree.R_inorder(root);
	     
	      
	      ArrayList<Integer> list1 = tree.l1;
	      
	      for (Integer i : list1) {
			System.out.print(i+ " ");
		}
	      
	      System.out.println();
	      
	      
	     
	      
	      
	     
		
	}
	
	
	Node insert(Node root,int data) {
		if(root == null) {
			root = new Node(data, null, null);
		}
		else {
			Node t = root;
			Node prev = null;
			
			while(t != null) {
				prev = t;
				
				if(data == t.data) { return root; }
				else if(data > t.data) { t = t.right ; }
				else if(data < t.data) { t = t.left ; } 
				
			}
			
			t = new Node(data, null, null);
			if(data > prev.data) { prev.right = t; }
			else { prev.left = t; }
			
		}
		
		
		return root;
	}
	
	
	  void R_inorder(Node node) {
		
		if(node != null) {
			R_inorder(node.left);
			l1.add(node.data);
			R_inorder(node.right);
		}
		
	}
	  
	  
	Node findNode(Node root,int key) {
	
		if(root==null) { return null; }
		if(key == root.data) { return root ; }
		
		Node t = root;
		
		
		//Node prev =null;
		while(t != null) {
			
			if(key == t.data) {
				return t;
			}
			else if(key>t.data) {
				//prev = t;
				t = t.right;
				
			}
			else {
				//prev = t;
				t= t.left;
			}
		}
		return null;
	}
	
	
	
	int height(Node node) {
		int x,y;
		
		if(node == null) { return 0; }
		x = height(node.left);
		y = height(node.right);
		
		return (x>y)?x+1:y+1;
	}
	
	
	
	
	
	Node inPre(Node node) {
		
		if(node == null) { return null;}
		while(node.right !=null) {
			node = node.right;
		}
		return node;
	}
	
	Node inSucc(Node node) {
		if(node==null) { return null;}
		while(node.left !=null) {
			node = node.left;
		}
		return node;
	}
	
	
	
	
	
	
	void delete(Node root,int key) {
		
		Node node = findNode(root, key);
		
		Stack<Node> stack = new Stack<Node>();
		stack.push(node);
		
		while(!stack.isEmpty()) {
			
			Node current = stack.pop();
			
			if(current.left == null  && current.right ==null) {
				current.data = Integer.MIN_VALUE;
				current = null;
			}
			else if(height(current.left) > height(current.right)) {
				   Node inPre = inPre(current.left);
				
				   current.data = inPre.data;
				   stack.push(inPre);
			}
			else {
				Node inSucc = inSucc(current.right);
				current.data = inSucc.data;
				stack.push(inSucc);
			}
			
		}
		
		delete_util(root);
		
	}


	private void delete_util(Node root) {
		
		if(root !=null) {
			delete_util(root.left);
			if(root.left != null) {
				if(root.left.data == Integer.MIN_VALUE) { root.left = null; }
			}
			else if(root.right != null) {
				if(root.right.data == Integer.MIN_VALUE) { root.right = null; }
			}
			delete_util(root.right);
		}
	}
	
	
	
	
	
	

}