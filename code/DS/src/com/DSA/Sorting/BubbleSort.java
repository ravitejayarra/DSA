package com.DSA.Sorting;

public class BubbleSort {

	

	public static void main(String[] args) {
        
		int a[] = {13,9,22,67,54,1,51,13,24,2};
		int b[] = {1,2,5,7,9,11,14};
		int k = a.length;
		for(int i=0;i<k;i++) {
	//	System.out.println(a[i]);
		}
		
		// int[] bubble= bubbleSort(a);
		// int[] insertion = insertionSort(a);
		   int[] selction = SelectionSort(a);
		
		 for(int i=0;i<selction.length;i++) {
				System.out.println(selction[i]);
				}
	}

	
	//-----SelectionSort-----------
	private static int[] SelectionSort(int[] a) {
		int n = a.length;
		int j,k,temp;
		for(int i=0;i<n;i++) {
			
			for(j=k=i;j<n;j++) {
				if(a[j]<a[k]) {
					k=j;
				}
				
			}
			temp = a[i];
			a[i] = a[k];
			a[k] = temp;
			
		}
		
		
		
		return a;
	}

	//------- INSERTION SORT------
	private static int[] insertionSort(int[] a) {
        int i,j,x,n=a.length; 
		for(i=1;i<n;i++) {
			x = a[i];
			j = i-1;
			
			while(j>-1 &&  a[j] > x) {
				a[j+1] = a[j];
				j--;
			}
			a[j+1] = x;
			
			
			
		}
		
		return a;
	}


	//  ------ BUBBLE SORT ---------------
	
	private static int[] bubbleSort(int[] a) {
		int i,j,flag=0;
		int n= a.length;
		for(i=0;i<n-1;i++) {
			
			for(j=0;j<n-i-1;j++) {
				if(a[j]>a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1]= temp;
					flag++;
				}
			}
			if(flag == 0) {
			System.out.println("already sorted");
			break;
			}
		 	
		}
		
		
		
		
		return a;
	}
	
	 // -----  END of BUBBLE SORT -----
	
	
	
	
	
	
	
	
	
	

}
