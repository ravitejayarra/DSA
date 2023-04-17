package com.syntax;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class StringToNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String s1 = "123";
//		
//		int d = Integer.parseInt(s1)+12;
		
		char s1 = "abc".charAt(1);
		
		if(Character.isAlphabetic(s1)) { s1 = Character.toUpperCase(s1) ; }
		
		
		
		List<String> related = new ArrayList<>();
		
		related.add("117");
		related.add("112");
		related.add("98");
		related.add("99");
		
		
		List<Long> list = new ArrayList<>();
		
		for (String str : related) {
			
			long number = Long.parseLong(str);
			list.add(number);
		}
		
		Collections.sort(list);
		related.clear();
		
		for (Long l : list) {
			
			String str = ""+l;
			related.add(str);
			
		}
		
		
		
	//	Collections.sort(related);
		
		System.out.println(related);
		
		
	//	System.out.println(Result.countGroups(related));

	}
	
	
	
	
	
	

}












class Result {

    /*
     * Complete the 'countGroups' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING_ARRAY related as parameter.
     */

    public static int countGroups(List<String> related) {
         // Write your code here

       Set<Integer> visited = new HashSet<>();
       
       int count=0;
       int n = related.size();
       
       for(int i=0;i<n;i++){
           
           if(!visited.contains(i)){
           Group(i,visited,related);
           count++;
           }
       }

      return count;

    }
    
    public static void Group(int i,Set<Integer> visited,List<String> adj){
        
        Queue<Integer> que = new LinkedList<>();
        
        que.offer(i);
        
        while(!que.isEmpty()){
            
           int node = que.poll(); 
            
           String relatedString = adj.get(node);
           
           
           for(int j=0;j<relatedString.length();j++){
               
               if(j==node || visited.contains(j)){ continue ;}
               
               int relative = (relatedString.charAt(j)-'0');
               
               if(relative ==1){
                   que.offer(j);
                   visited.add(j);
               }
           } 
            
        }
        
    }
        
        
        
        
    }
    
    
    

