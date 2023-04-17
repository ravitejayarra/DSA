package com.gfg.Graph;

public class demo_wordsearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	char[][] board = {{'a','g','b','c'},{'q','e','e','l'},{'g','b','k','s'}};
		
		char[][] board = { {'b'},
				{'a'},
				{'c'},
				{'b'},
				{'b'},
				{'d'} };
		
		String word = "bd";
		System.out.println(isWordExist(board,word));
		
	}
	
	
	
	  public static boolean isWordExist(char[][] board, String word)
	    {
	        // Code here
	        
	        int rows  = board.length;
	        int cols  = board[0].length;
	        
	        
	        char firstCh = word.charAt(0);
	        
	       int visited[][] = new int[rows][cols];
	        
	        for(int i=0;i<rows;i++){
	            
	            for(int j=0;j<cols;j++){
	                
	                if(board[i][j]==firstCh){
	                    visited[i][j] = 1;
	                   boolean isWord = dfs(i,j,1,word,visited,board,rows,cols);
	                   
	                   if(isWord){ return true; }
	                    
	                   visited[i][j] = 0;    
	                }
	                
	            }
	        }
	        
	        return false;
	    }
	    
	    
	    public static boolean dfs(int i,int j,int idx,String word,
	                        int visited[][],char[][] board,int rows,int cols){
	        
	       
	       //  boolean isWord = false;
	        if(idx == word.length()){ return true; }
	        
	         
	        int ax[] = {-1,1,0,0};
	        int ay[] = {0,0,-1,1};
	        
	        
	        
	        for(int k=0;k<4;k++){
	         
	         int x = ax[k]+i;
	         int y = ay[k]+j;
	         
	         char ch = word.charAt(idx);
	         if(x>=0 && y>=0 && x<rows && y<cols && visited[x][y]==0 && ch == board[x][y]){
	         
	         visited[x][y] = 1;
	        boolean isWord = dfs(x,y,idx+1,word,visited,board,rows,cols);
	         
	         if(isWord){ return true; }
	                    
	         visited[x][y] = 0;  
	         }
	         
	         
	        }
	        
	        
	        
	        
	        
	        
	       
	        
	        return false ;
	    }
	    

}
