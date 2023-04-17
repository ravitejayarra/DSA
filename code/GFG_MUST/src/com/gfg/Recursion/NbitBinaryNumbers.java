package com.gfg.Recursion;

import java.util.ArrayList;
import java.util.List;

public class NbitBinaryNumbers {

	public static void main(String[] args) {

		int n=3;
		int N_ones =0,N_zeros=0;
		
		List<String> ans = new ArrayList<>();
		String current ="";
		generate(n,N_ones,N_zeros,current,ans);
		
		for (String s : ans) {
			System.out.print(s+" ");
		}
	}

	private static void generate(int n, int n_ones, int n_zeros, String current, List<String> ans) {

		if((n_ones+n_zeros) == n) {
			ans.add(current);
			return;
		}
		
		if(n_ones <= n) {
			generate(n,n_ones+1,n_zeros,current+"1",ans);
		}
		if(n_zeros < n_ones) {
			generate(n,n_ones,n_zeros+1,current+"0",ans);
		}
	}

}
