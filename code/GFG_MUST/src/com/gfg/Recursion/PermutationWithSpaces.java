package com.gfg.Recursion;

import java.util.ArrayList;
import java.util.List;

public class PermutationWithSpaces {

	public static void main(String[] args) {

		List<String> ans = new ArrayList<>();
		String str = "abc";
		int idx =0;
		String current = "a";
		Pspaces(str,idx+1,current,ans);
		
		for (String string : ans) {
			System.out.print(string + " ");
		}
	}
	
	public static void Pspaces(String str, int idx, String current, List<String> ans) {
		
		if(idx==str.length()) {
			ans.add(current);
			return;
		}
		
		Pspaces(str,idx+1,current+"_"+str.charAt(idx),ans);
		Pspaces(str,idx+1,current+str.charAt(idx),ans);
		
	}

}
