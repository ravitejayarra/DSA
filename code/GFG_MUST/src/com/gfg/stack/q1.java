package com.gfg.stack;


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> input = new ArrayList<Integer>();
		
		input.add(10);
		
		input.add(4);
		
		input.add(8);
		input.add(13);
		input.add(10);
		
		//Collections.sort(input);
		//System.out.println(Result1.minimumGroups(input, 3));
		
		
		
		System.out.println(Result.minimizeMemory(input, 2));
	}

}





class Result1 {

    /*
     * Complete the 'minimumGroups' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY awards
     *  2. INTEGER k
     */

    public static int minimumGroups(List<Integer> awards, int k) {
		
    	int min = awards.get(0),max = awards.get(0),count =0;
    	int flag = 0;
    	for(int i=0;i<awards.size();) {
    		
    		int current = awards.get(i);
    		min = Math.min(min, current);
    		max = Math.max(max, current);
    		
    		if(max - min <= k) {
    			i++;
    			if(i == awards.size()) {
    				count++;
    			}
    		}
    		else {
    			count++;
    			
    			min = awards.get(i);
    			max = awards.get(i);
    		}
    		
    	}
		
		
		
		
		
		
    // Write your code here
    return count;

    }

}








class Result {

    /*
     * Complete the 'minimizeMemory' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY process
     *  2. INTEGER m
     */

    public static int minimizeMemory(List<Integer> process, int m) {
    // Write your code here
    	 int sum=0,n = process.size(),gsub =0,lsub=0;
    	for(int i=0;i<n;i++) {
    		sum = sum + process.get(i);
    	}
    	
    	
    	for(int i=0;i<n-m+1;i++) {
    		
    		for(int j=i;j<i+m;j++) {
    			lsub = lsub+process.get(j);
    		}
    		
    		gsub = Math.max(gsub, lsub);
    		lsub=0;
    	}
    	
return sum-gsub;
    }

}