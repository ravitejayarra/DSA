package com.Accio.trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Btree {

	public static void main(String[] args) {

		Btree t = new Btree();
		Node root = t.create();
		ArrayList<Integer> list = t.levelorder(root);
		System.out.println();
		for (Integer i : list) {
			System.out.print(i + " ");
		}
		
		ArrayList<Integer> list2 = t.preorder(root);
		System.out.println();
		for (Integer i : list2) {
			System.out.print(i + " ");
		}
		ArrayList<Integer> list3 = t.Inorder(root);
		System.out.println();
		for (Integer i : list3) {
			System.out.print(i + " ");
		}
		
		ArrayList<Integer> list4 = t.postOrder(root);
		System.out.println();
		for (Integer i : list4) {
			System.out.print(i + " ");
		}
		
		
	}

	
	Node create() {
		Scanner sc= new Scanner(System.in);
		
		
		Node root = new Node(-1, null, null);
		Queue<Node> queue = new LinkedList<>();
		
		System.out.println("enter the root node: ");
		int x = sc.nextInt();
		
		if(x == -1) { return null;   }
		root.data = x  ; 
		queue.offer(root);
		
		while(!queue.isEmpty()) {
			Node parent = queue.poll();
			
			System.out.println("left node for "+ parent.data + " : ");
			x = sc.nextInt();
			Node lchild = new Node(0, null, null);
			
			if(x != -1) {
				parent.left = lchild;
				lchild.data = x;
				queue.offer(lchild);
			}
			
			System.out.println("right node for "+ parent.data + " : ");
			x = sc.nextInt();
			Node rchild = new Node(0, null, null);
			
			if( x!=-1) {
				parent.right = rchild;
				rchild.data = x;
				queue.offer(parent.right);
			}
			
			
			
			
		}
		
		
		
		
		return root;
	}
	
	
	ArrayList<Integer> levelorder(Node root){
		Queue<Node> queue = new LinkedList<>();
		ArrayList<Integer> l1  = new ArrayList<Integer>();
		if(root == null) { return null; }
		queue.offer(root);
		
		while(!queue.isEmpty()) {
			Node parent = queue.poll();
			
			l1.add(parent.data);
			
			if(parent.left != null) {    queue.offer(parent.left); }
			if(parent.right != null) {     queue.offer(parent.right); }
			
		}

		
		
		
		return l1;
		
	}
	
	
	ArrayList<Integer> preorder(Node root){
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		Stack<Node> stack = new Stack<Node>();
		if(root==null) {  return l1; }
		stack.push(root);
		while(!stack.isEmpty()) {
			Node parent = stack.pop();
			l1.add(parent.data);
			
			if(parent.right != null ) { stack.push(parent.right); }
			if(parent.left !=null) { stack.push(parent.left); }
			
		}
		return l1;
		
	}
	
	
	ArrayList<Integer> Inorder(Node root){
		
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		Stack<Node> stack = new Stack<Node>();
		
		if(root == null) { return l1; }
		//stack.push(root);
		
		Node currentNode = root;
		boolean done = false;
		
		while(!done) {
			
			if(currentNode != null){
				stack.push(currentNode);
				currentNode = currentNode.left;
			}
			else {
				
				if(stack.isEmpty()) { done = true; }
				else {
					Node node = stack.pop();
					l1.add(node.data);
					currentNode = node.right;
				}
				
			}
		}
		return l1;
		
	}
	
	
	ArrayList<Integer> postOrder(Node root){
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		Stack<Node> stack = new Stack<Node>();
		if(root ==null) { return l1; }
		
		stack.push(root);
		
		Node prev = null;
		
		
		while(!stack.isEmpty()) {
			Node current = stack.peek();
			if(prev==null || prev.left == current || prev.right ==current) {
				
				if(current.left != null ) { stack.push(current.left); }
				else if(current.right !=null) { stack.push(current.right); }
				}
			else if(current.left == prev) {
				if(current.right != null) {  stack.push(current.right); }
			               }
			else {
				
				l1.add(current.data);
				stack.pop();
				
			}
			
			prev = current;
			
		}
		
		
		return l1;
	}
	
	
	int maxDepth(Node root) {
		
		if(root == null) { return 0; }
		int depth =0;
		
		Stack<Node> stack = new Stack<Node>();
		stack.push(root);
		Node prev = null;
		
		while(!stack.isEmpty()) {
			
			Node current = stack.peek();
			if(prev ==null || prev.right==current || prev.left == current) {
				
				if(current.left != null) { stack.push(current.left); }
				else if(current.right != null) {     stack.push(current.right);   }
			}
			else if(current.left==prev) {
				if(current.right !=null) { stack.push(current.right); }
			}
			else {
				stack.pop();
			}
			
			prev = current;
			if(stack.size() > depth) {
				depth = stack.size();
			}
			
		} // end of while
	
		
		return depth;
	}
	
	
	int minDepth(Node root) {
		
		if(root==null) { return 0; }
		int depth =0;
		Queue<Node> queue = new LinkedList<>();
		queue.offer(root);
		queue.offer(null);
		depth++;
		while(!queue.isEmpty()) {
			Node currentNode = queue.poll();
			
			if(currentNode != null) {
				
				if(currentNode.left ==null && currentNode.right ==null) {
					return depth;
				}
				if(currentNode.left != null) {
					queue.offer(currentNode.left);
				}
				if(currentNode.right !=null) {
					queue.offer(currentNode.right);
				}
				
			}
			else {
				
				if(!queue.isEmpty()) {
					depth++;
					queue.offer(null);
				}
				
				
				
			}
			
		}
		
		
		
		
		
		
		
		return depth;
	}
	
	
	
	Node deepestNode(Node root) {
		Node tmp=null;
		Queue<Node> queue = new LinkedList<Node>();
		queue.offer(root);
		
		while(!queue.isEmpty()) {
			tmp = queue.poll();
			
			if(tmp != null ) {
				
				if(tmp.left != null) { queue.offer(tmp.left);  }
				if(tmp.right != null) { queue.offer(tmp.right); }
			}
		}
		
		return tmp;
		
	}
	
	
}
