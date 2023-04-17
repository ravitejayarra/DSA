package com.exam.accio;

import java.util.Scanner;

public class Time {

	public static void main(String[] args) {

		Scanner sc  = new Scanner(System.in);
        String time = sc.nextLine();
        
        String[] str = time.split(":");
        
        String AMPM   =   str[str.length-1].substring(2);
        
        str[str.length-1]   =   str[str.length-1].substring(0,2);
        
        
       // System.out.println(AMPM);
        
        
        if(AMPM.equals("PM")) {
        	if(str[0].equals("12")) {}
        	else { 
        	int hh = Integer.parseInt(str[0]) +  12 ; 
        	str[0] = hh+"";
        	}
        }
        else {
        	if(str[0].equals("12")) { str[0] = "00" ; }
        	
        }
        
        String ans= str[0]+":"+str[1]+":"+str[2];
        
        
        
        System.out.println(ans);
        
		
	}

}
