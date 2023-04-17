package com.DSA.Stack;

public class Assoc_PostFix {

	
	public static void main(String[] args) {
		String   s = "((a+b)*c)-d^e^f";
		int count=0;
		
		char[] arr = s.toCharArray();
		
		for (char c : arr) {
			if(c=='(' || c==')') {
				
				count++;
		}
		
		}
		
		char[] postfix = convert(arr,count);
		System.out.println(postfix);
	}

	private static char[] convert(char[] arr, int count) {
		
		int n = arr.length;
		
		char[] postfix = new char[n-count];
		int j=0;
		Stack_LL stack = new Stack_LL();
		
		for(int i=0;i<n;) {
			
			if(isOperand(arr[i])) {
				postfix[j++] = arr[i++] ;
			}
			else {
				
				if(stack.isEmpty()) {
					stack.push(arr[i++]);
				}
				else if(pre(arr[i],'O') > pre(stack.peek(),'I')) {
					stack.push(arr[i++]);
				}
				else if(pre(arr[i],'O') == pre(stack.peek(),'I')) {
					stack.pop();
					i++;
				}
				else {
					postfix[j++] = stack.pop();
				}
			}
		}
		
		while(!stack.isEmpty()) {
			postfix[j++] = stack.pop();
		}
		
		
		
		return postfix;
	}

	private static int pre(char c, char d) {
		int p=0;
		
		if(d =='O') {
			
			     if(c=='+'||c=='-') {   return 1;        }
			else if(c=='*'||c=='/') {   return 3;        }
			else if(c=='^') {   return 6;                }
			else if(c=='(') {   return 7;                }
			else if(c==')') {   return 0;                }
			
		}
		else if(d == 'I') {
			
			         if(c=='+'||c=='-') {   return 2;        }
				else if(c=='*'||c=='/') {   return 4;        }
				else if(c=='^') {           return 5;        }
				else if(c=='(') {   return 0;                }
				
			
		}
		return p;
	}

	private static boolean isOperand(char c) {
		
		if(c=='+' || c=='-' ||c=='*' ||c=='/' ||c=='^' ||c=='(' ||c==')') {
			return false;
		}
		
		
		return true;
	}
	
	
	
	
	

	
}
