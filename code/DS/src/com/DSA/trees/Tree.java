package com.DSA.trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;



public class Tree {

  // Node root;
	
	
	public static void main(String[] args) {
		Tree t = new Tree();
		Node root = t.create();
		
//		System.out.println(root.data);
//		System.out.println(root.left.data);
//		System.out.println(root.right.data);
		
		System.out.println("-------------");
		t.levelorder(root);
		ArrayList<Integer> list = t.preorder(root);
		
		System.out.println("-------------");
		for (Integer i : list) {
			System.out.print(i + " ");
			
		}
		 ArrayList<Integer> list2 = t.inorder(root);
		System.out.println("-------------");
		for (Integer i : list2) {
			System.out.print(i + " ");
			
		}
		
		
		 ArrayList<Integer> list3 = t.postOrder(root);
			System.out.println("-------------");
			for (Integer i : list3) {
				System.out.print(i + " ");
				
			}
			
			
			
			
		
		
	}
	
   
   Node create() {
	   Node root = new Node(0, null, null);
	   queueUsingStacks queue = new queueUsingStacks();
	   
	   Scanner sc = new Scanner(System.in) ;
	   
	   System.out.println("Enter root value : ");
	   
	   int value = sc.nextInt();
	   
	   root.data = value;
	   
	   queue.enqueue(root);
	   
	   
	   while(!queue.empty()) {
		   
		   Node node = queue.dequeue();
		   Node lchild = new Node(-1, null, null);
		   System.out.println("Enter left child for " + node.data +": " );
		   
		    value  =  sc.nextInt();
		    
		   if(value !=-1) {   lchild.data = value; 
		    
		    node.left  = lchild;
		    
		    queue.enqueue(lchild);
		   }
		    
		    Node rchild = new Node(0, null, null);
		     
		    System.out.println("enter the right child for  " + node.data  +": ");
		    
		    value = sc.nextInt();
		    
		    if(value != -1) {
		    	
		    rchild.data = value;
		     node.right = rchild;
		    
		    queue.enqueue(rchild);
		    }
		   
	   }
	   
	   
	   
	   
	   
	return root;
	   
   }
   
   
   void levelorder(Node root) {
	   
	   queueUsingStacks queue = new queueUsingStacks();
	   System.out.print("root node is " + root.data + " ");
	   
	   queue.enqueue(root);
	   
	   
	   while(!queue.empty()) {
		   Node parent = queue.dequeue();
		   
		   if(parent.left != null) {
			  // System.out.println("left child for "+parent.data + " is " + parent.left.data);
			   System.out.print(parent.left.data + " ");
			   queue.enqueue(parent.left);
		   }
		   if(parent.right != null) {
			 //  System.out.println("right child for "+parent.data + " is " + parent.right.data);
			   System.out.print(parent.right.data + " ");
			   queue.enqueue(parent.right);
		   }
	   } // end of while
	 
   } // end of level order function
   
   
	
	ArrayList<Integer> preorder(Node root) {
		
		ArrayList<Integer> l1 = new ArrayList<>();
		Stack<Node> stack = new Stack<Node>();
		
		if(root==null) {
			return l1;
		}
		
		
		stack.push(root);
		
		while(!stack.isEmpty()) {
			
			Node node = stack.pop();
			
			l1.add(node.data);
			
			if(node.right != null) {
				stack.push(node.right);
			}
			
			if(node.left != null) {
				stack.push(node.left);
			}
		
		}
		
		
		return l1;
	}
   
	
	ArrayList<Integer> inorder(Node root) {
		
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		Stack<Node> stack  = new Stack<Node>();
		
		if(root == null) {
			return l1;
		}
		
		//stack.push(root);
		 Node currentNode  = root;
		boolean done  = false;
		
		while(!done) {

			
			if(currentNode !=null) {
				stack.push(currentNode);
				currentNode = currentNode.left;
			}
     
			else {
				
				if(stack.isEmpty()) {  done = true ;}
				
				else {
					currentNode = stack.pop();
					l1.add(currentNode.data);
					currentNode = currentNode.right;
				}
				
				
			}
			
		}
		
		
		
		return l1;
	}
	
	
	
	ArrayList<Integer> postOrder(Node root) {
		
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		Stack<Node> stack = new Stack<Node>();
		
		if(root==null) {
			return l1;
		}
		Node prev = null;
		Node currentNode = null;
		stack.push(root);
		
		while(!stack.isEmpty()) {
			currentNode = stack.peek();
			if(prev==null || prev.right == currentNode || prev.left == currentNode) {
				
				if(currentNode.left != null) {
					stack.push(currentNode.left);
				}
				else if(currentNode.right !=null) {
					stack.push(currentNode.right);
				}
				
			}
			else if(currentNode.left==prev) {
				
				if(currentNode.right != null) {
					stack.push(currentNode.right);
				}
				
			}
			
			else {
				l1.add(currentNode.data);
				stack.pop();
			}
			
			prev = currentNode;
			
		}
		
		return l1;
	
	}


	public int maxElement1(Node root) {

		if(root == null) {
			return Integer.MIN_VALUE;
		}
		
		int max = Integer.MIN_VALUE;
		Queue<Node> queue = new LinkedList<>();
		queue.offer(root);
		
		if(root.data>max) {
			max = root.data;
		}
		
		while(!queue.isEmpty()){
			Node node = queue.poll();
			
			if(node.left != null) {
				if(node.left.data > max) {  max = node.left.data;  }
				queue.offer(node.left);
			}
			
			if(node.right != null) {
				if(node.right.data >max) {  max= node.right.data;   }
				queue.offer(node.right);
			}
			
		}
		
		
		return max;
		
		
		
	}


	public boolean searchElement(Node root,int k) {
		
		Queue<Node> queue = new LinkedList<>();
		
		queue.offer(root);
		
		while(!queue.isEmpty()) {
			Node parent = queue.poll();
			if(parent.data == k) {
				return true;
			}
			
			
			if(parent != null) {
				if(parent.left != null) {  queue.offer(parent.left); }
				if(parent.right != null) { queue.offer(parent.right);}
			}
			
			
			
			
			
		}
		
		
		return false;
	}


	public Node insertElement(Node root, int i) {
		
		Queue<Node> queue = new LinkedList<>();
		
		if(root==null) {  return null; }
		
		queue.offer(root);
		
		while(!queue.isEmpty()) {
			Node parent = queue.poll();
			
			if(parent != null) {
				
				if(parent.left != null) { queue.offer(parent.left);   }
				else {  parent.left = new Node(i, null, null);   return root;}
				
				
				if(parent.right != null) { queue.offer(parent.right);   }
				else { parent.right = new Node(i, null, null); return root;}
				
			}
			
			
		}
          		
		
		return root;
	}
   
   
	
}
