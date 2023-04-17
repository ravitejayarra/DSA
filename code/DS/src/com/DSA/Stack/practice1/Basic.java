package com.DSA.Stack.practice1;

import java.util.Stack;

public class Basic {

	public static int main(String[] args) {
         String A  = "(()))";
		char[] arr = A.toCharArray();
	       Stack<Character> stack  = new Stack<>();
	        int n = arr.length;

	        for(int i=0;i<n;i++) {
	        	
	        	if(arr[i]=='(') {
	        		stack.push(arr[i]);
	        	}
	        	else if(arr[i]==')') {
	        		
	        		if(stack.isEmpty()) {
	        			return 0;
	        		}
	        		else {
	        			stack.pop();
	        		}
	        	}
	        }
	        
	        if(stack.isEmpty()) {
	        	return 1;
	        }
		return 0;
	}

}
