package com.gfg.stack;

import java.util.Stack;

public class parenthesisChecker {

	public static void main(String[] args) {

		
		System.out.println(Solution.ispar("{([])}"));
	}

}


class Solution
{
    //Function to check if brackets are balanced or not.
    static boolean ispar(String x)
    {
        // add your code here
        
        int n = x.length();
        
        Stack<Character> stack = new Stack<>();
        
        for(int i = 0;i<n;i++){
            char a  = x.charAt(i);
            
            if(a=='{' || a== '[' || a== '('){
                stack.push(a);
            }
            
            else if(a == '}' || a==']' || a== ')'){
                
                if(stack.isEmpty()){ return false; }
                else if( a == stack.peek()){
                    stack.pop();
                }
                
                else if(a != stack.peek()) { return false ; } 
            }
        }
        
        
        if(stack.isEmpty()){ return true; }
        else{
            return false;
        }
    }
}
