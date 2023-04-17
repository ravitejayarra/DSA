package com.Accio.Recursion;

public class Basic1 {

	public static void main(String[] args) {

		int a[] = {1,32,422,1111};
		int n = a.length;
		boolean is = isArraySorted(a,n-1);
		
		System.out.println(is);
	}

	private static boolean isArraySorted(int[] a, int i) {
		
		if(i==0) { return true;}
		
		 boolean k=  (a[i]<a[i-1])? false : isArraySorted(a,i-1) ;
		 
		 return k;
	}

}
