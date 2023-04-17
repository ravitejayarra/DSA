package com.Accio.check;

public class q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution3 s1 = new Solution3();
		
		int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
		boolean b = s1.searchMatrix(matrix, 30);
		System.out.println(b);
	}
}
	class Solution3 {
	    public boolean searchMatrix(int[][] matrix, int target) {
	        
	        int n = matrix.length;
	        int low = 0,high = n-1,mid;
	        boolean res = false;
	        
	        while(high>=low){
	            
	            mid = low+(high-low)/2;
	            int len = matrix[mid].length-1;
	            if(target >= matrix[mid][0] && target <= matrix[mid][len])
	            {
	           res =  inner(matrix,target,mid);
	           return res;
	            }
	            
	            else if(target < matrix[mid][0]){
	                high = mid-1;
	            }
	            else{
	                low = mid+1;
	            }
	        }
	        return res;
	        
	    }
	    
	    
	    public boolean inner(int[][] matrix,int target,int mid){
	        int a[] = matrix[mid];
	        
	        int low =0,high = a.length-1,m;
	        
	        while(high>=low){
	            m =low+(high-low)/2;
	            
	            if(a[m] == target){
	                return true;
	            }
	            
	            else if(target < a[m]){
	                high = m-1;
	            }
	            else{
	                low = m+1;
	            }
	        }
	        return false;
	    }
	}



	
	
	
	
	// searching element in a rotated sorted array
	
	/*
	
	class Solution {
    public boolean search(int[] nums, int target) {
       
        int low = 0,high = nums.length-1,mid;
        
       
        while(high>=low){
            
            mid = low+(high-low)/2 ;
            
            
            
            if(target == nums[mid]){
                return true;
            }
            
            else if(nums[low] == nums[mid] && nums[high] == nums[mid]){
                high--;
                low++;
            }
            else if(nums[mid] <= nums[high] ){
                
                if(target > nums[mid] && target <= nums[high]){
                    low = mid+1;
                }
                else{
                    high = mid-1;
                }
            }
            else{
                
                if(target >= nums[low] && target < nums[mid]){
                    high = mid-1;
                }
                else{
                    low = mid+1;
                }
            }
        }
        return false;
        
    }
    
}
	
	
	*/
	
	
	
	
	
	
	
	
	
	//154. Find Minimum in Rotated Sorted Array II
	
	/*
	 

class Solution {
    public int findMin(int[] nums) {
        
        
        int low = 0,high = nums.length-1,mid;
        
        while(high>low){
            mid = low+(high-low)/2 ;
            
            if(nums[mid] > nums[high]){
                
                low = mid+1;
            }
            else if(nums[mid] < nums[high]){
                high  = mid;
            }
            else{
                high--;
            }
        }
        return nums[low];
      
        
        
    }
}
	 */
	
	
	
	
	
	
	
	
	
	