package com.DSA.course1.Array;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {

		char[] s1 = "aeiou".toCharArray();
		
		char[] s2 = "eiaou".toCharArray();
		
		boolean b  = solve(s1,s2);
		
		System.out.println(b);
		
		
	}

	private static boolean solve(char[] s1, char[] s2) {
		
		if(s1.length != s2.length) {
			return false;
		}
		else {
			Arrays.sort(s1);
			Arrays.sort(s2);
			
			for(int i=0;i<s1.length;i++) {
				if(s1[i] != s2[i]) {
					return false;
				}
				
			}
			return true;
		}
		
	}

}
