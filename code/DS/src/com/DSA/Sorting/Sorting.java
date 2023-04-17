package com.DSA.Sorting;

public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int a[] = {  4,821,31,17,41,19,33,2,6,5,1,99};
		int n= a.length;
		
		    int[] arr = ImergeSort(a);
		    for (int i : arr) {
				System.out.print(i+" ");
			}
		
		
		
	}

	private static int[] merge(int a[] ,int l,int mid,int h) {
		
		int i=l,j=mid+1, k = l;
		int b[]  = new int[h+1];
		
		
		while(j<=h && i<=mid ) {
			if(a[i] < a[j]) {
				b[k++] = a[i++];
			}
			else {
				b[k++] = a[j++];
			}
			
			
		}
		
		
		while(j<=h) { b[k++] = a[j++]; }
		while(i<=mid) { b[k++] = a[i++];}
		
		for(i=l;i<=h;i++) {
			a[i] = b[i];
		}
		return a;
	}
	
	private static int[] ImergeSort(int a[]) {
		int n= a.length;
		int l,h,mid,p;
		
		for(p=2;p<=n;p=p*2) {
			
			for(int i = 0; i+p-1<n ; i =i+p) {
				l = i;
				h = i+p-1;
				mid = (l+h)/2 ; 
				merge(a,l,mid,h);
			}
			
		}
		
		if(p/2 < n) {
			merge(a,0,p/2 -1 ,n-1);
		}
		
		return a;
	}
	

}
