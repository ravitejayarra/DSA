package com.gfg.snippets;

import java.util.HashMap;

public class niceSubarrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}




 
    public static int numberOfSubarrays(int[] nums, int k) {
        
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2 ==1) { nums[i] = 1;}
            else if(nums[i] % 2==0){nums[i] = 0;}
        }
        
        HashMap<Integer,Integer> map = new HashMap<>();
       int i =0,j =0 ,sum=0,count=0; 
        
        while(j<nums.length){
            sum = sum + nums[j];
         
          if(sum == k){
              count++;
          }
         
         if(map.containsKey(sum-k)){
            count = count+map.get(sum-k);
        }
            
        if(map.containsKey(sum)){
            map.put(sum,map.get(sum)+1);
        }
        else{
            map.put(sum,1);
        }
       
        j++;    
        
    }
        return count;
}
    
    
    
    
}