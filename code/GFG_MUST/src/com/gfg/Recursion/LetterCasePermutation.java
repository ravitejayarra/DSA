package com.gfg.Recursion;

import java.util.ArrayList;
import java.util.List;

public class LetterCasePermutation {

	public static void main(String[] args) {

		String str = "a1*B2";
		int idx = 0;
		List<String> ans = new ArrayList<>();
		String current = "";
	  letterCasePermutation(str,current,idx,ans);	
	  
	  for (String string : ans) {
		System.out.print(string+ " ");
	}
	}

	private static void letterCasePermutation(String str, String current, int idx, List<String> ans) {
		
		if(idx == str.length()) {
			ans.add(current);
			return;
		}
		
		char ch = str.charAt(idx);
		boolean isAlpha = Character.isAlphabetic(ch);
		
		if(isAlpha) {
			
			char chSmall = str.toLowerCase().charAt(idx);
			char chCaps = str.toUpperCase().charAt(idx);
			
			letterCasePermutation(str,current+chSmall,idx+1,ans);
			letterCasePermutation(str,current+chCaps,idx+1,ans);
		}
		else {
			letterCasePermutation(str,current+ch,idx+1,ans);
		}
		
		
	}
	
	

}
