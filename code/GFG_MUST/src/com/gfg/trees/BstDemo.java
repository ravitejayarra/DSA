package com.gfg.trees;

import java.util.List;

public class BstDemo {

	public static void main(String[] args) {

		BST bst = new BST();
		
		bst.insert(5);
		bst.insert(10);
		bst.insert(1);
		bst.insert(11);
		bst.insert(9);
		bst.insert(5);
		
		bst.deleteNode(bst.root, 5);
		bst.deleteNode(bst.root, 5);
		bst.inOrder(bst.root);
		
		List<Integer> list = bst.list;
		
		for (Integer i : list) {
			System.out.print(i + " ");
		}
		
	}

}
