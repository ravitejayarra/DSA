package com.exam.accio;

import java.util.Scanner;

public class Autori {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc  = new Scanner(System.in);
		String str = sc.nextLine();
		String s[] = str.split("-");
		String output = "";
		
		for (String s1 : s) {
			output += s1.charAt(0);
		}
		
		System.out.println(output);
		
		
		
	}

}
