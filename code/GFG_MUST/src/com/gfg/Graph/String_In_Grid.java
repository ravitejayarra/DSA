package com.gfg.Graph;

import java.util.ArrayList;

public class String_In_Grid {

	public static void main(String[] args) {

	//	int ans[][] = se
	}

	public static int[][] searchWord(char[][] grid, String word)
    {
        // Code 
        
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
              int rows  = grid.length;
	          int cols  = grid[0].length;
        
         char firstCh = word.charAt(0);
	        
	       int visited[][] = new int[rows][cols];
	        
	        for(int i=0;i<rows;i++){
	            
	            for(int j=0;j<cols;j++){
	                
	                if(grid[i][j]==firstCh){
	                    
	                   visited[i][j] = 1;
	                   
	                   boolean isWord = dfs(i,j,1,word,visited,grid,rows,cols);
	                   
	                   if(isWord){ 
	                       
	                     ArrayList<Integer> ans = new ArrayList<Integer>();
	                     ans.add(i);  ans.add(j);
	                     list.add(ans);
	                   }
	                    
	                   visited[i][j] = 0;    
	                }
	                
	            }
	        }
	        
	        
	        int pos[][] = new int[list.size()][2];
	        
	        for(int i=0;i<list.size();i++){
	            
	            pos[i][0] = list.get(i).get(0);
	            pos[i][1] = list.get(i).get(1);
	            
	            
	        }
	        
	        
       return pos; 
    }
    
    
    public static boolean dfs(int i,int j,int idx,String word,
	                        int visited[][],char[][] grid,int rows,int cols){
	      
	      if(idx== word.length()){ return true; }  
	        
	        int ax[] = {-1,1,0,0,-1,-1,1,1};
	        int ay[] = {0,0,-1,1,-1,1,-1,1};
	        
	        
	        for(int k=0;k<8;k++){
	            
	            int x = ax[k]+i;
	            int y = ay[k]+j;
	            
	            char ch = word.charAt(idx);
	            if(x>=0 && y>=0 && x<rows && y<cols && visited[x][y]==0 && ch== grid[x][y]){
	                
	                visited[x][y] = 1;
	                
	                boolean isFound = dfs(x,y,idx+1,word,visited,grid,rows,cols);
	                
	                
	                visited[x][y] = 0;
	                if(isFound){ return true; }
	                
	                
	               
	            }
	            
	            
	        }
	        
	        
	        return false;
	                        }
}
