package com.DSA.Stack;



public class infixToPostfix {
  
	public static void main(String[] args) {
		
		String exp="a+b*c-d/e";
		
		char[] infix = exp.toCharArray();
		
		 
		char[] postfix = convert(infix);
		
		System.out.println(postfix);
	}
	
	
	
	static char[] convert(char[] infix) {
		
		
		//char[] infix = exp.toCharArray();
		
		
		char[] postfix = new char[infix.length];
		
		Stack_LL stack = new Stack_LL();
		
		int j=0;
		
		
		
		for (int i=0;i<infix.length;) {
			
		  
			
			if(operand(infix[i])) {
				
				postfix[j++] = infix[i++];
			}
			
			else {
				
			if(stack.isEmpty()) {
				stack.push(infix[i]);
				i++;
			}
				
			else if(pre(infix[i])>pre(stack.peek())) {
					 stack.push(infix[i++]);	
				 }
				 
				else {
					postfix[j++]=stack.pop();
					}
			}
				
			
		}
		
		while(!stack.isEmpty()) {
			
			postfix[j++] = stack.pop();
				
		}
		
		
		return postfix;
		
	}
	
	
	
	static boolean operand(char c) {
		
		if( c =='+'|| c=='-'||c=='*'||c=='/') {
			return false;
		}
		
		else {
			return true;
		}
	}
	
	static int pre(char c) {
		
		if(c=='+'||c=='-') {
			return 1;
		}
		else if (c=='*'||c=='/'){
			return 2;
		}
		else {
			return 0;
		}
		
	}
	
	
    
}


