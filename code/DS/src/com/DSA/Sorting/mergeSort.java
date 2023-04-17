package com.DSA.Sorting;

public class mergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {2, 1, 3, 1, 2};
		int n= a.length;
		
//		int x[] = {2,3,1,5};
//		int[] merge = merge(x,0,1,3);
//		
//		for (int i : merge) {
//			System.out.println(i);
//		}
		
		int count = ImergeSort(a);
		
		for (int i : a) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println(count);
		

	}
	
	
	public static int ImergeSort(int a[]) {
		
		int n = a.length;
		int l,mid,h;
		int p = 2;
		int count_t = 0 ;
		for( p = 2 ; p<=n; p = p*2) {
			
			for(int i=0; i+p-1<n;i = i+p) {
				l = i;
				h = i+p-1;
				mid = (l+h)/2 ; 
				
			count_t +=	merge(a,l,mid,h);
			}
			
		}
		
		if(n>p/2) {
		count_t +=	merge(a,0,p/2 - 1 ,n-1);
		}
		
		return count_t;
	}
	
	
	
	public static int merge(int a[],int l,int mid,int h) {
		
		int i=l,j=mid+1,k=l;
		int b[] = new int[h+1];
		int count = 0;
		
		while(j<=h && i<=mid) {
			
			if(a[i] <= a[j]) {
				b[k++] = a[i++];
			}
			else {
				
				
		    
				b[k++] = a[j++];
				count = count + (mid+1) -i ;
			}
		}
		
		for(;i<=mid;i++) { b[k++] = a[i]; }
		for(;j<=h;j++) { b[k++] = a[j]; }
		
		for( i=l;i<=h;i++) {
			a[i] = b[i];
		}
		return count;
	}

}
