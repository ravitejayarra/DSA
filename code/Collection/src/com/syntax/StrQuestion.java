package com.syntax;

public class StrQuestion {

	public static void main(String[] args) {

		String s= "*|**|*|";
		
		int start = s.indexOf("|");
		int end = s.lastIndexOf("|");
		
		String str[] = s.split("\\|");
		
		for(int i=0;i<str.length;i++) {
			System.out.println(str[i]);
		}
		
		String news = s.substring(start,end+1);
		
		System.out.println(str.length);
		System.out.println(s.indexOf("|"));
		System.out.println(news);
		
	}

}
