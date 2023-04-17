package com.gfg.array;

import java.util.Scanner;

public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		 int n = scanner.nextInt();
	
		 long[] arr = new long[n];
		 
		for(int i=0;i<n;i++) {
			arr[i] = scanner.nextLong();
		}
		
		System.out.println(Solution.inversionCount(arr, n));

	}

}



class Solution
{
    // arr[]: Input Array
    // N : Size of the Array arr[]
    //Function to count inversions in the array.
    static long inversionCount(long arr[], long N)
    {
        // Your Code Here
        long h = N-1;
       return mergeSort(arr,0,h);
        
    }
    
    
    
     static long mergeSort(long arr[],long l,long h){
        
        long count=0;
        if(h>l){
          long mid = l+(h-l)/2 ;
          count +=mergeSort(arr,l,mid);
          count +=mergeSort(arr,mid+1,h);
         count += merge(arr,l,h,mid);
          
        }
        
        return count;
    }
    
    
    static long merge(long arr[],long l,long h, long mid){
          
          long b[] = new long[(int)h+1];
          
          long count =0;
          int i = (int)l,j=(int)mid+1,k=(int)l;
          
          while(i<=mid && j<=h){
              if(arr[i] <= arr[j]){
                  b[k++] = arr[i++];
              }
              else{
                  b[k++] = arr[j++];
                  count = count + mid-i+1;
              }
          }
          
          while(i<=mid){
               b[k++] = arr[i++];
          }
          
          while(j<=h){
              b[k++] = arr[j++];
          }
          
          for(int p = (int)l;p<=(int)h;p++){
              arr[p] = b[p];
          }
          return count;
          
    }
    
    
}