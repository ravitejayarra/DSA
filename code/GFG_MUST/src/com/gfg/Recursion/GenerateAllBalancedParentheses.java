package com.gfg.Recursion;

import java.util.ArrayList;
import java.util.List;

public class GenerateAllBalancedParentheses {

	public static void main(String[] args) {

		int n = 3;
		int open = n,closed=n;
		
		List<String> ans = new ArrayList<>();
		String current = "";
		generateBalancedParenthesis(current,closed,open,ans);
		
		for (String string : ans) {
			System.out.println(string +" ");
		}
		
	}

	private static void generateBalancedParenthesis(String current, int closed, int open, List<String> ans) {
		
		if(closed==0 && open ==0) {
			ans.add(current);
			return;
		}
		
		
		if(open>0) {
			generateBalancedParenthesis(current+'(',closed,open-1,ans);
		}
		
		if(closed>open) {
			generateBalancedParenthesis(current+')',closed-1,open,ans);
		}
		
		
	}

}
