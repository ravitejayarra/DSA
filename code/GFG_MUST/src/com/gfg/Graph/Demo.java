package com.gfg.Graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class Demo {

	public static void main(String[] args) {

		//String S = "i.like.this.program.very.much";
		String ans = smallestWindow("timetopractice","toc");
	    
		
	    System.out.println(ans);
	}
	  
	
	
	public static String smallestWindow(String s, String p)
    {
        // Your code here
        
        if(p.length()==0 || s.length()==0 || p.length() > s.length()){
            return "-1";
        }
        
        int start=-1,minlength=Integer.MAX_VALUE;
        
        int charCount=0;
        
         int freq=0;
        Map<Character,Integer> map = new HashMap<>();
        
        for(int i=0;i<p.length();i++){
            
            char ch = p.charAt(i);
            
             freq = map.getOrDefault(ch,0);
            
            if(freq==0){ charCount++; }
            
            map.put(ch,freq+1); 
        }
        
        int j=-1,i=0;
        
        while(j<s.length()){
            
        	  while(charCount != 0){
                  j++;
               if(j>=s.length()) {break; }   
                  
               char ch =s.charAt(j);
                if(map.containsKey(ch)){
                   
                   freq = map.get(ch);
                   freq--;
                   
                   if(freq==0){ charCount--; }
                    map.put(ch,freq);
                }
                
               
            }
            
            
            while(charCount==0){
                
                if((j-i+1) < minlength){
                       start = i; 
                   minlength = j-i+1;
                }
                
                char removeCh = s.charAt(i);
                
                if(map.containsKey(removeCh)){
                    
                    freq = map.get(removeCh);
                    
                    freq++;
                    
                    if(freq==1){ charCount++; }
                    
                    map.put(removeCh,freq);
                }
                i++;
                
            }
            
            j++;
        }
        
        
        
        
        
        if(start==-1) { return "-1"; }
        
        
        return s.substring(start,start+minlength);
    }

}






class Point{
    
    int i,j;
    
    Point(){}
    
    Point(int i,int j){
        this.i = i;
        this.j = j;
    }
    
}

