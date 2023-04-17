package com.DSA.Stack;
public class Parantheses {

	public static void main(String[] args) {
        Stack_LL stack = new Stack_LL();
        
        
        
		String exp="((a+b)*(c-d))";
		char[] expression = exp.toCharArray();
		int x=1;
		for (char c : expression) {
			
			if(c=='(') {
				stack.push('(');
			}
			else if(c== ')') {
				
				if(stack.isEmpty()) {
					x=-1;
					System.out.println("improper parenthesis");
					break;
				}
				stack.pop();
			}
			
			
		}
		
		if(!stack.isEmpty()) {
			x =-1;
			System.out.println("not closed");
		}
		System.out.println(x);

		
	}

}
