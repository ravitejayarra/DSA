package com.gfg.Recursion;

import java.util.ArrayList; 
import java.util.List;


//Character ch =str.charAt(0);
//current = current + str.toLowerCase().charAt(idx);

public class PermutationWithCaseChange {

	public static void main(String[] args) {

		String str = "abC";
		String current="";
		List<String> ans = new ArrayList<>();
		int idx = 0;
		PermutationCaseChange(str,current,ans,idx);
		
		for (String string : ans) {
			System.out.print(string + " ");
		}
	}

	public static void PermutationCaseChange(String str, String current, List<String> ans, int idx) {

		if(idx == str.length()) {
			ans.add(current);
			return;
		}
		
		char chSmall = str.toLowerCase().charAt(idx);
		char chCaps =  str.toUpperCase().charAt(idx);
		
    	PermutationCaseChange(str,current+chSmall,ans,idx+1);
    	PermutationCaseChange(str,current+chCaps,ans,idx+1);
	}

}
