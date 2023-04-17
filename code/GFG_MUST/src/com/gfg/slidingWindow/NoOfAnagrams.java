package com.gfg.slidingWindow;

import java.util.HashMap;
import java.util.Map;

public class NoOfAnagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	System.out.println(search("for" , "forxxorfxdofr"));	
    
	}

	

	

	  public static  int search(String pat, String txt) {
	        // code here
	        
	        Map<Character,Integer> map = new HashMap<>();
	         int k = pat.length();
	         int charCount =0;
	        
	        for(int i=0;i<k;i++){
	            char ch = pat.charAt(i);
	            if(map.containsKey(ch)){
	                map.put(ch,map.get(ch)+1);
	            }
	            else{
	                map.put(ch,1);
	                charCount = charCount+1;
	            }
	            
	        }
	        
	         int count= 0,freq =0;
	        
	        for(int j = 0;j<k-1;j++){
	            
	            char ch = txt.charAt(j);
	             if(map.containsKey(ch)){
	                     freq = map.get(ch);
	                    freq--;
	                    if(freq == 0){ charCount-- ; }
	                    map.put(ch,freq);
	                }
	        }
	       
	        
	       
	        
	        for(int j=k-1,i=0;j<txt.length();j++){
	            
	            char addCh =   txt.charAt(j);
	            char removeCh = txt.charAt(i);
	           
	             if(map.containsKey(addCh)){
	                     freq = map.get(addCh);
	                    freq--;
	                    if(freq == 0){ charCount-- ; }
	                    map.put(addCh,freq);
	                }
	           
	          
	             if(charCount == 0){
	                    count++;
	                }
	                
	              if(map.containsKey(removeCh)){
	                    freq = map.get(removeCh);
	                    freq++;
	                    if(freq==1){ charCount++ ;}
	                    map.put(removeCh,freq);
	                    }
	               
	                
	                
	                i++;
	            }
	            
	            
	        
	        
	        
	        
	        
	        
	        
	        
	       return count;
	        
	    }
}
