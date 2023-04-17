package com.leetcode.debug;

import java.util.HashSet;
import java.util.Set;

public class debug1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s1  = new Solution();
		int a[] = {9};
		int res = s1.minimumSize(a, 2);
		System.out.println(res);
	}

}

class Solution {
    public int minimumSize(int[] nums, int maxOperations) {
        
        int low = 1,high = Integer.MIN_VALUE,mid,result=-1;
        
        for(int i=0;i<nums.length;i++){
            if(high < nums[i]){ high = nums[i];}
            
        }
        
        
        
        while(high>=low){
            mid = low+ (high-low)/2;
            
            if(compute(nums,mid) <= maxOperations){
                result = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
            
        }
        
        
        return result;
        
        
    }
    
    
    
    public int compute(int[] a,int k){
        int count =0;
        
        for(int i=0;i<a.length;i++){
            
            if(a[i]/k == 0){ count += a[i]/k  - 1 ;}
            else{
                 count += a[i]/k ;
            }
            
        }
        return count;
    }
    
    
}