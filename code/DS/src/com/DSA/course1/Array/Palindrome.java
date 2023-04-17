package com.DSA.course1.Array;

public class Palindrome {

	public static void main(String[] args) {

		String  s = "Radar";
		
		String rev = new String();
		
		   int A1 = 1234321; 
		
		    boolean b = Str_palindrome(s,rev);
		    System.out.println("String palindrome - " + b );
		
		    boolean b2 = Int_plaindrome(A1);
		    System.out.println("Integer palindrome - " + b2 );
		
		
	}

	private static boolean Int_plaindrome(int a1) {
		int a2 = a1;
		int sum = 0,k;
		
		
		while(a2 !=0) {
			k = a2%10;
			sum = sum*10+k;
			a2 = a2/10;
			
		}
		
		if(sum==a1) {
			return true;
		}
		
		
		
		return false;
	}

	private static boolean Str_palindrome(String s, String rev) {

		
		
		for(int i=s.length()-1;i>=0;i--) {
			rev = rev +s.charAt(i);
		}
		
		System.out.println(rev);
		
		System.out.println(s);
		
		
		return s.toLowerCase().equals(rev.toLowerCase());
	}
	
	
	
	

}
