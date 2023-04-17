package com.exam.accio;
import java.util.*;


public class APSeries {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		int a1 =  sc.nextInt();
		int a2 =  sc.nextInt();
		int k =  sc.nextInt();
		
		int[] arr = new int[k];
		
		int d = a2-a1;
		int n=0;
		
		//a , a+d   
		
		for(int i=0;i<k;i++) {
			n = i+3;
			arr[i] = a1+(n-1)*d;
			System.out.println(arr[i]);
		}
		
		
		
	}

}
