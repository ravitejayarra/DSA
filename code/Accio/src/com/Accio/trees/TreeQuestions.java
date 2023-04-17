package com.Accio.trees;

import java.util.ArrayList;

public class TreeQuestions {

	public static void main(String[] args) {

		Btree t = new Btree();
		Node root = t.create();
		ArrayList<Integer> list = t.levelorder(root);
		System.out.println();
		for (Integer i : list) {
			System.out.print(i+" ");
		}
		
		
		System.out.println();
		
//		int depth = t.maxDepth(root);
		
//		System.out.println(depth);
		
//        depth = t.minDepth(root);
		
//		System.out.println(depth);
		
		Node node = t.deepestNode(root);
		System.out.println(node.data);
		
		
	}

}
