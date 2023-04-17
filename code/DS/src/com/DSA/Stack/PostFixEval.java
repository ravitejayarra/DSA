package com.DSA.Stack;

public class PostFixEval {

	public static void main(String[] args) {

		
		String s = "92*62/-3+";
		char[] arr = s.toCharArray();
		
		int result = evaluation(arr);
	     System.out.println(result); 
	
	}
	
	
	
	private static int evaluation(char[] arr) {
		int b,a,c;
		c=b=a=0;
		int n = arr.length;
		Stack_int stack = new Stack_int();
		
		for(int i=0;i<n;i++) {
			
			if(isOperand(arr[i])) {
				stack.push(arr[i]-'0');
				
			}
			else {
				b = stack.pop();
				a= stack.pop();
				
			  switch(arr[i]) {
			  
			  case '+':
				  c = a+b;
				  break;
			  case '-':
				  c = a-b;
				  break;
			  case '*':
				  c = a*b;
				  break;
			  case '/':
				  c = a/b;
				  break;
			  default:
				  break;
				  
			  }
			  
			  stack.push(c);
			  
				
			}
			
			
		}
		
		
		
		return stack.pop();
	}



	static boolean isOperand(char c) {
		
		char[] arr = "+-*/".toCharArray();
		
		for (char d : arr) {
			if(d==c) {
				return false;
			}
		}
		return true;
		
		
		
	}
	
	
	
	

}

