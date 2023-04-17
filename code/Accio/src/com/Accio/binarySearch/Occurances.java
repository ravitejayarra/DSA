package com.Accio.binarySearch;

public class Occurances {

	public static void main(String[] args) {

		
		int a[] = { 0,0,0,0,1,1,1,2,3,4,5,6};
		
		int first = search_First(a,4);
		int last = search_Last(a, 4);
		System.out.println(first + " " + last);
	}

	
	
private static int search_First(int[] a, int key) {
		
		int l = 0 ,  h = a.length-1;
		int mid = l + (h-l)/2 ;
		int res = -1;
		while(h>=l) {
			
			mid = l + (h-l)/2 ;
			
			if(a[mid] == key) {
				res=  mid;
				h = mid-1;
			}
			else if(key > a[mid]) {
				l = mid+1;
			}
			else {
				h = mid-1;
			}
		}
		
		
		
		return res;
		
		
		
	}

private static int search_Last(int[] a, int key) {
	
	int l = 0 ,  h = a.length-1;
	int mid = l + (h-l)/2 ;
	int res = -1;
	while(h>=l) {
		
		mid = l + (h-l)/2 ;
		
		if(a[mid] == key) {
			res =  mid;
			l = mid+1;
		}
		else if(key > a[mid]) {
			l = mid+1;
		}
		else {
			h = mid-1;
		}
	}
	
	
	
	return res;
	
	
	
}


}
