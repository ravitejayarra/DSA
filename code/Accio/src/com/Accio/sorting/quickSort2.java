package com.Accio.sorting;

import java.util.ArrayList;
import java.util.Scanner;

public class quickSort2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> a  = new ArrayList<Integer>();
		
		int n = sc.nextInt();
		
		for(int i=0;i<n;i++) {
			a.add(sc.nextInt());
		}
		sc.close();
		
		f(a);
 	}

	private static ArrayList<Integer> f(ArrayList<Integer> a) {
		
		if(a.size() <= 1) {
			return a;
		}
		
		ArrayList<Integer> left  = new ArrayList<Integer>();
		ArrayList<Integer> right  = new ArrayList<Integer>();
		int count =1;
		int pivot = a.get(0);
		for(int i=1;i<a.size();i++) {
			if(pivot>a.get(i)) {
				left.add(a.get(i));
			}
			else if(pivot<a.get(i)) {
				right.add(a.get(i));
			}
			else {
				count++;
			}
			
		}
		
		left = f(left);
		right = f(right);
		
		ArrayList<Integer> merge  = new ArrayList<Integer>();
		
		for(int i = 0;i<left.size();i++) {
			merge.add(left.get(i));
		}
		while(count >0) {
			count--;
			merge.add(a.get(0));
		}
		for(int i = 0;i<right.size();i++) {
			merge.add(right.get(i));
		}
		
		for(int i = 0;i<merge.size();i++) {
			System.out.print(merge.get(i)+" ");
		}System.out.println();
		
		return merge;
	}

}
