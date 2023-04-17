package java8;

import java.util.Arrays;
import java.util.List;

interface I{
	
	void show(String s);
	
	static void messgage() {
		System.out.println("message");
	}
	
}


//class child implements I{
//
//	@Override
//	public void show() {
//		System.out.println("hi  ---");
//	}
//	
//	public void messgage() {
//		System.out.println("message child");
//	}
//	
//}



public class Basic1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//child c1 = new child();
		
		//I.messgage();
	  // c1.messgage();
	   
//	   String str = " hielo";
//	   
//	   for(char ch : str) {
//		   System.out.println(ch);
//	   }
	   
		
	   int a[]  = { 1,2,3,4,5,6,7,8};
	   
	   
	   List<Integer> list = Arrays.asList(1,2,3,4,5,6);
	   
	   list.forEach(i->{
		   System.out.println(100+i);
	   });
	   
	   
    
	   I obj = (s)->{
		  System.out.println(s); 
	   };
	   
	   
	   obj.show("hello");
	   
	   
	   
	}

}
