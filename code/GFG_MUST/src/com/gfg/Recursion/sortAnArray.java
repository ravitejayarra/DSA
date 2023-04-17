package com.gfg.Recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class sortAnArray {

	public static void main(String[] args) {

		int a[] = {9,6,4,8,4,1,7,3,2,9,1};
		
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i=0;i<a.length;i++) {
			list.add(a[i]);
		}
		
		sort(list);
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i)+" ");
		}
		
	}

	private static void sort(ArrayList<Integer> list) {
		
		if(list.size() == 1) {
			return;
		}
		else {
			int temp = list.remove(list.size()-1);
			sort(list);
			insert(list,temp);
		}
		
		
	}

	private static void insert(ArrayList<Integer> list, int temp) {

		if(list.size()==0 || list.get(list.size()-1) <= temp ) {
			list.add(temp);
		}
		else {
			int removed = list.remove(list.size()-1);
			insert(list,temp);
			list.add(removed);
		}
		
	}

}
