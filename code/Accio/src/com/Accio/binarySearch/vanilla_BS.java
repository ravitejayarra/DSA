package com.Accio.binarySearch;

public class vanilla_BS {

	public static void main(String[] args) {

		int b[] = {9,10,1,1,1,3,4,4,6,7};
		int search_min_Rotated = search_min_Rotated(b);
		System.out.println(search_min_Rotated);
		
		int vanilaBs = vanilaBs(b,4,search_min_Rotated);
		System.out.println(vanilaBs);
		
		
	}

	private static int vanilaBs(int[] b, int key, int start) {
		int l = 0, h = b.length - 1,mid;
		 
		if(key >= b[start] && key <= b[h] ) { l = start; }
		else { h = start-1 ; }
		
		
		while(h>=l) {
			mid = l+(h-l)/2 ;
			if(key == b[mid]) {
				return mid;
			}
			
			else if(key < b[mid]) {
				h = mid-1;
			}
			else if(key > b[mid]) {
				l = mid+1;
			}
			
		}
		return -1;
		
	}

	private static int search_min_Rotated(int[] b) {
       
		int l =0, h= b.length-1, mid = l + (h-l)/2 ;
		
		while(h>l) {
			
			mid = l + (h-l)/2 ;
			
			if(b[mid] > b[h]) {
				l = mid+1;
			}
			else if(b[mid] <= b[h]) {
				h = mid;
			}
			
		}
		
		return l;
	}

}
