package com.Accio.check;


// search in a sorted array

public class q1 {

	public static void main(String[] args) {
		
               Solution s1 = new Solution();
               int a[] = {1} ;
            System.out.println(s1.search(a, 1));
	}

}
class Solution {
    public int search(int[] nums, int target) {
        int min = minimum(nums);
        int low =0,high = nums.length-1,mid;
        if(target >= nums[min] && target <= nums[high]){
            low= min;
        }
        else{
            high = min-1;
        }
        
      while(high>=low){
          mid = low+(high-low)/2;
          if(target == nums[mid]){
              return mid;
          }
          else if(target > nums[mid]){
              low = mid+1;
          }
          else{
              high = mid-1;
          }
      }  
       return -1; 
        
        
    }
    public int minimum(int nums[]){
        int low =0,high = nums.length-1 , mid;
        
        while(high>low){
            mid = low+(high-low)/2 ;
            
            if(nums[mid] <= nums[high]){
                high = mid;
            }
            else if(nums[mid]>nums[high]){
                low = mid+1;
            }
        }
        return high;
    }
}