package com.gfg.Graph;

import java.util.LinkedList;
import java.util.Queue;

public class Bfs {

	public static void main(String[] args) {

		int[][] g = {{0,0,0,0,0,0,0},
		            {0,0,1,1,0,0,0},
		            {0,1,0,0,1,0,0},
		           {0,1,0,0,0,1,1},
		           {0,0,1,0,0,0,1},
		           {0,0,0,1,0,0,1},
		           {0,0,0,1,1,1,0}};
		
		
		//bfs(g,2);
		int  k = Integer.MAX_VALUE;
		System.out.println();
		int visited[] = new int[g.length];
		dfs(g,6,visited);
	}

	public static void dfs(int[][] g, int vertix, int[] visited) {

		if(visited[vertix] == 0) {
			System.out.print(vertix + " ");
			visited[vertix] = 1;
			
			for(int i=0;i<g.length;i++) {
				if(g[vertix][i] == 1 && visited[i] ==0) {
					dfs(g,i,visited);
				}
			}
		}
		
	}

	private static void bfs(int[][] g, int i) {

		int size = g.length;
		
		Queue<Integer> q = new LinkedList<>();
		
		int Visited[] = new int[size];
		System.out.print(i + " ");
		Visited[i] = 1;
		q.offer(i);
		
		while(!q.isEmpty()) {
			
			int current = q.poll();
			for(int j=0;j<size;j++) {
				
				if(g[current][j] ==1 && Visited[j]==0) {
					System.out.print(j+ " ");
					q.offer(j);
					Visited[j] = 1;
				}
			}
		} // end of while loop
	}
	
	
	
	
	
	
	
	
	
	

}




