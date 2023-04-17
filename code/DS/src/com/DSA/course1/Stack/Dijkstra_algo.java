package com.DSA.course1.Stack;

import java.util.Stack;

public class Dijkstra_algo {
	
	public static void main(String[] args) {
		
		String s = "( ( 2 * 63 ) / ( 2 * 3 ) ) ";
		String[] exp = s.split(" ");
		
		
		
		
		Integer solve = solve(exp); 
		System.out.println(solve.intValue());
		
		
		
		
	}
	
	
	public static Integer solve(String[] exp) {
		Stack<String> operationStack = new Stack<>();
		Stack<Integer> valueStack = new Stack<>();
		
		int n= exp.length;
		
		for (String str : exp) {
			
			
			if(str.equals("("))  {       }
			
	   else if(str.equals(")")){   
		int b = valueStack.pop();
		int a= valueStack.pop();
		int c = 0;
		String op = operationStack.pop();
		
		switch (op) {
		case "+":
			c = a+b;
			break;
		case "-":
			c = a-b;
			break;
		case "*":
			c = a*b;
			break;
		case "/":
			c = a/b;
			break;		

		default:
			break;
		}
		
		valueStack.push(c);
	  
	   }
			
	   else if(!isoperand(str)) {    operationStack.push(str);   }	
	   
	   else {
		   
		   Integer number = Integer.parseInt(str);
		   valueStack.push(number);
		  
	   }
			
		}
		
		return valueStack.pop();
		
		
	}


	


	private static boolean isoperand(String exp) {
		
		if(exp.equals("+") || exp.equals("-")|| exp.equals("*")|| exp.equals("/")) {
			return false;
		}
		
		
		return true;
	}

}
