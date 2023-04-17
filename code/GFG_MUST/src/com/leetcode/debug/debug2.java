package com.leetcode.debug;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class debug2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "aabbc";
		Solution1 s1 = new Solution1();
		System.out.println(s1.FirstNonRepeating(a));
	}

}


class Solution1
{
    public String FirstNonRepeating(String A)
    {
        // code here
        
        Queue<Character> q = new LinkedList<>();
        Map<Character,Integer> countMap = new HashMap<>();
        String ans="";
        
        for(int i=0;i<A.length(); i++){
            
            char ch = A.charAt(i);
            
            q.offer(ch);
            
            countMap.put(ch,countMap.getOrDefault(ch,0)+1);
            
            while(!q.isEmpty()){
                
                if(countMap.get(q.peek()) >1){ q.poll(); }
                else {
                	break;
                }
            }
            
            if(q.isEmpty()){ ans = ans + "#"; }
            else{
                ans = ans + q.peek();
            }
            
            
        }
        return ans;
    }
}