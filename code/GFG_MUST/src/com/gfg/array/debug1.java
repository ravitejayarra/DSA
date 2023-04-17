package com.gfg.array;

import java.util.Arrays;

public class debug1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Solutions s1 = new Solutions();
		
		   int arr1[] = {-10,6,-6,7,3,-9};
		   int arr2[] = {1,7,6,5,1};
				
		int c = s1.findTheDistanceValue(arr1, arr2, 53);
		System.out.println(c);
	}

}


class Solutions {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        
        
        
        Arrays.sort(arr2);
        
        
        int count =0;
        for(int i=0;i<arr1.length;i++){
            
          boolean output = findDistance(arr2,arr1[i],d);
            
            if(output){count++; }
            
        }
        
         return count;
        
    }
    
    
    
    public boolean findDistance(int[] a,int key,int d){
        
     int left = 0,right = a.length-1,mid,pos=-1;
        
        int op1,op2;
        
        if(key < a[0] || key > a[a.length-1]){
            
         if(key < a[0]){
             
          op1 = a[0] - key;
           if(op1>d){return true;}  
             return false;
         }  
            
         else if(key > a[a.length-1]){ 
         op2 = key - a[a.length-1];
             if(op2>d){return true;}
             return false;
         }   
            
            
        }
        
        
        
        
        
        
        
        else{
                    
        while(right>=left){
            mid=  left +(right-left)/2;
            op1 = Integer.MAX_VALUE;op2 = Integer.MAX_VALUE;
            if(a[mid] == key){
                
             if(mid-1 > -1) {   op1= Math.abs(a[mid]-a[mid-1]); }
             if(mid+1 <a.length) {   op2 = Math.abs(a[mid+1]-a[mid]); }
                op1 = Math.min(op1,op2);
               if(op1>d){return true;}
                return false;
            }
            else if(a[mid] < key ){  left= mid+1;}
            else{ right = mid-1;}
        } // end of while loop
         
         return Math.min(Math.abs(a[left] - key) , Math.abs(a[left-1]-key))> d;   
            
        }
        return true;
    }
    
    
    
}