package com.DSA.Sorting;

public class quickSort {

	public static void main(String[] args) {

		int a[] = {  8,31,17,41,19,2,633,5,1,99};
		quickSortUtil(a,0,a.length-1);
		for (int i : a) {
			System.out.print(i + " ");
		}
		
	}
	
	/*
	Scanner sc = new Scanner(System.in);
    int n =  sc.nextInt();

    int a[] =  new int[n];
    for(int i=0;i<n;i++){
      a[i] = sc.nextInt();
    }
	
	
	*/

	private static void quickSortUtil(int[] a, int l, int h) {
		
		
		if(h>l) {
			int p = partiation(a,l,h);
			quickSortUtil(a,l,p-1);
			quickSortUtil(a, p+1, h);
			
		}
	}

	private static int partiation(int[] a, int l, int h) {
		int i = l-1;
		int pivot = a[h];
		
		for(int j = l;j<h;j++) {
			
			if(a[j] < pivot) {
				i++;
				swap(a,j,i);
			}
			
		}
		
		swap(a,i+1,h);
		
		
		
		return i+1;
	}

	private static void swap(int[] a, int j, int i) {
        
		int temp = a[j];
		a[j] = a[i];
		a[i] = temp;
		
		
	}

}
