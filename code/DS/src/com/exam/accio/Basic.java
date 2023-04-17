package com.exam.accio;



public class Basic {

	public static void main(String[] args) {
		
		
		String s = "heehey" ;
		String str[] = s.split("e") ;
		String total="";
		
		for(int i=0;i<str.length-1;i++) {
			//System.out.println(str[i]);
			str[i]  += "ee";
			total += str[i]; 
			
		}
		
		total += str[str.length-1];
		System.out.println(total);
	}
	
	
	
	
}
