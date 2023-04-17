package com.Accio.binarySearch;

public class binarySearch {

	public static void main(String[] args) {

		int a[] = {1,3,4,6,7,9,10};
		
		int key = 2;
		int search = search(a,8);
		System.out.println(search);
		
		int rsearch = Rsearch(a,0,a.length-1,7);
		System.out.println(rsearch);
		
		
		
		int b[] = {9,10,1,1,1,3,4,4,6,7};
		int search_min_Rotated = search_min_Rotated(b);
		System.out.println(search_min_Rotated);
		
	}

	private static int search_min_Rotated(int[] a) {
		int l = 0, h = a.length-1, mid = l+(h-l)/2 ;
		
		while(h>l) {
			mid = l+(h-l)/2 ;
			
			if(a[mid]<= a[h]) {
				h = mid;
			}
			else if(a[mid] > a[h]) {
				l = mid+1;
			}
			
		}
		return l;
		
	}

	private static int Rsearch(int[] a, int l, int h, int key) {

		int mid = l + (h-l)/2 ;
		if(l>h) {
			return -1;
		}
		
		else if(key > a[mid]) {
			return Rsearch(a,mid+1,h,key);
		}
		else if(key < a[mid]){
			return Rsearch(a,l,mid-1,key);
		}
		else {
			return mid;
		}
		
		
		
	}

	private static int search(int[] a, int key) {
		
		int l = 0 ,  h = a.length-1;
		int mid = l + (h-l)/2 ;
		while(h>=l) {
			
			mid = l + (h-l)/2 ;
			if(a[mid] == key) {
				return mid;
			}
			else if(key > a[mid]) {
				l = mid+1;
			}
			else {
				h = mid-1;
			}
		}
		
		
		
		return l;
		
		
		
	}
	
	
	
	
	

}
