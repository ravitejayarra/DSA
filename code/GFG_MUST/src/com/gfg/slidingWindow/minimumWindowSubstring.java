package com.gfg.slidingWindow;

import java.util.HashMap;
import java.util.Map;

public class minimumWindowSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(minWindow("AbAbAA" ,"AAA"));
	}





    public static String minWindow(String s, String t) {
        
        
        if(t.length() == 0 || s.length() == 0 || t.length() > s.length()){
            return "";
        }
        
        
        
        int minLength = s.length() + 1;
        
        Map<Character,Integer> map = new HashMap<>();
        
        int charCount=0,freq;
        
        
        for(int k=0;k<t.length();k++){
           char ch = t.charAt(k);
            
            if(map.containsKey(ch)){
                freq = map.get(ch) + 1;
                map.put(ch,freq);
            }
            else{
                charCount++;
                map.put(ch,1);
            }
        }
        
        
        int i =0,j=0,ans=-1;
        
        while(j<s.length()){
            
            char ch = s.charAt(j);
            
            if(charCount != 0){
                
                if(map.containsKey(ch)){
                    freq = map.get(ch)-1;
                    if(freq == 0){ charCount--; }
                    map.put(ch,freq);
                }
                
                
            }
            
            if(charCount == 0){
                
                while(charCount==0){
                    
                    if(j-i+1 <  minLength){
                        minLength = j-i+1;
                        ans = i;
                    }
                    
                    char removech = s.charAt(i);
                    
                    if(map.containsKey(removech)){
                        freq = map.get(removech)+1;
                        if(freq == 1){ charCount++; }
                        map.put(removech,freq);
                    }
                   i++; 
                }
            }
            
            
            
            j++;
        }
        
        
        if(ans == -1){ return "";}
        
        return s.substring(ans,ans+minLength);
    }
}