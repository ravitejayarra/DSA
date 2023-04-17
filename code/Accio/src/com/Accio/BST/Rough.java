package com.Accio.BST;

import java.util.Stack;

public class Rough {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	/*
	
void Delete_util(Node root,int key) {
		
		Node parent = findNode(root, key);
		Node child = null;
		if(parent == null) {return ; }
		else if(parent.data ==key) {child = parent ;}
		else if(parent.left.data == key) { child = parent.left; } 
		else if(parent.right.data == key) { child = parent.right; }
		
		Stack<Node> stack = new Stack<Node>();
		stack.push(parent);
		stack.push(child);
		
		while(!stack.isEmpty()) {
			Node current = stack.pop();
			parent = stack.pop();
			if(current.left == null && current.right == null) {
				
				if(parent.left == current) { parent.left =null;}
				else if(parent.right ==current) {parent.right =null;}
				return;
			}
			
			else if(height(current.left) > height(current.right)) {
				Node miniParent = InPre(current.left,current);
				
				if(miniParent == current) { 
					current.data = miniParent.left.data ; 
				      stack.push(miniParent);
				      stack.push(miniParent.left); 
				      
				      }
				
				Node miniChild = miniParent.right;
				current.data = miniChild.data;
				stack.push(miniParent);
				stack.push(miniChild);
				
			
			}
			
			else  {
				Node inSucc = InSucc(current.right,current);
				
				current.data = inSucc.data;
				stack.push(inSucc);
			}
			
		}
		


		
		
		
		return;
	}


	 


	Node InPre(Node node,Node parent) {

		
		
		while(node.right != null) {
			parent = node;
			node = node.right;
		}
		return parent;
	}
	 
	 Node InSucc(Node node,Node parent) {
		 
		
		 while(node.left != null) {
			 parent  = node;
			 node = node.left;
		 }
		 return parent;
	 }
	
	*/
	
}
