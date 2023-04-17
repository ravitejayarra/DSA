package com.gfg.Recursion;

public class basic {

	public static void main(String[] args) {

//		String list = "BC";
//		String l[] = list.split(";");
//		System.out.println(l.length);
//		for (String string : l) {
//			System.out.println(string);
//		}
		
		//int k =1;
		
		value v = new value();
		v.k = 1;
		f(v);
		System.out.println(v.k);
	}

	private static void  f(value v) {
		v.k = v.k +10;		
	}
	
	
	

}

class value{
	int k;
}