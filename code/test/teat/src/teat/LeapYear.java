package teat;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Scanner sc = new Scanner(System.in);
		
		int year = 100;
		
		
		if((year %4 ==0 && year %100  != 0) || (year % 400 ==0)) {
			
				System.out.println("leap year");
				
		  }
			
		else {
			// not a leap year
			System.out.println(" not leap year");
		}
		
		
		
	}

}
