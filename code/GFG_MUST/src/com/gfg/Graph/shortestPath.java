package com.gfg.Graph;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class shortestPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] edges = { {1, 2},{2,3},{3,4},{1,3}};
				
		int n=4,m=4,s=1,t=4;		
				
		LinkedList<Integer> path = Solution.shortestPath(edges, n, m, s, t);
		
        for (Integer integer : path) {
			System.out.print(integer);
		}
		
	}

}



 class Solution {

	public static LinkedList<Integer> shortestPath(int[][] edges, int n, 
												   int m, int s, int t) {
		
	ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>(n + 1);
		
		for(int i=0;i<=n;i++){
			graph.add(new ArrayList<Integer>());
		}
		
		for(int i=0;i<m;i++){
			
			int j = edges[i][0];
			int k = edges[i][1];
		    graph.get(j).add(k);
			graph.get(k).add(j);
		}
		
		Queue<Integer> que = new LinkedList<>();
		
		int visited[] = new int[n+1];
		int parent[] = new int[n+1];
		 for (int i = 1; i <= n; i++) {
            visited[i] = 0;
            parent[i] = -1;
        }
		
		que.offer(s);
		visited[s] = 1;
		parent[s] = -1;
		
		while(!que.isEmpty()){
			
			int node = que.poll();
			
			for(int x:graph.get(node)){
				
				if(visited[x] == 0){
					visited[x]= 1;
					parent[x] = node;
					que.offer(x);
				}
			}
		}
		
	LinkedList<Integer> path = new LinkedList<Integer>();
        int currentNode = t;
        
        
        path.add(currentNode);
        
        while (parent[currentNode] != -1) 
        {    
            
            currentNode = parent[currentNode];
            path.add(currentNode);
        }

  
        Collections.reverse(path);
        return path;
	}

}