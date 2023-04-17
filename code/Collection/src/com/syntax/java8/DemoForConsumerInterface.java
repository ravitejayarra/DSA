package com.syntax.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

class consumerImpl implements Consumer<Integer>
{

	@Override
	public void accept(Integer t) {
		System.out.println(t+10);
	}
	
}


public class DemoForConsumerInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = Arrays.asList(1,2,3);
		
	//	Consumer<Integer> c= new consumerImpl();
		
		Consumer<Integer> c = (Integer k)->{
			System.out.println(k+100);
		};
		
		list.forEach(c);

	}

}
