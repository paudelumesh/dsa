/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa.Graph;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

/**
 *
 * @author sanjeev
 */
public class Graph {

    private int V;

    private LinkedList<Integer> adjList[];

    public Graph(int V) {
        this.V = V;
        adjList = new LinkedList[V];
        for (int i = 0; i < V; i++) {
            adjList[i] = new LinkedList();
        }

    }

    public void addEdge(int v, int u) {
        adjList[v].add(u);

    }
    
    public void DFSUtil(int s, boolean Visited[])
    {
        Visited[s]=true;
        System.out.print(s+" ");
        Iterator<Integer> itr=adjList[s].listIterator();
        while(itr.hasNext())
        {
            int n=itr.next();
            if(!Visited[n])
            {
                DFSUtil(n,Visited);
            }
        }
        
    }

    public void DFS(int s) {
        
        boolean Visited[]=new boolean[V];
        
        DFSUtil(s,Visited);

    }
    
    public void BFS(int s)
    {
        boolean Visited[]=new boolean[V];
        LinkedList<Integer> queue=new LinkedList<>();
        
        Visited[s]=true;
        queue.add(s);
        
        while(queue.size()>0)
        {
            s=queue.poll();
            System.out.print(s+" ");
            
            Iterator<Integer> itr=adjList[s].listIterator();
            while(itr.hasNext())
            {
                int n=itr.next();
                if(!Visited[n])
                {
                    Visited[n]=true;
                    queue.add(n);
                }
            }
        }
        
    }
    
    public boolean isCyclicUtil(int s, boolean [] visited, boolean []recVisited)
    {
        
        visited[s]=true;
        recVisited[s]=true;
        
        Iterator<Integer> itr=adjList[s].listIterator();
        
        while(itr.hasNext())
        {
           int n=itr.next();
           
           if(!visited[n]&&isCyclicUtil(n,visited,recVisited))
           {
               return true;
           }
           else if(recVisited[n])
           {
               return true;
           }
        }
        
        return false;
    }
    
    public boolean isCyclic()
    {
        boolean []visited=new boolean[this.V];
        boolean []recVisited=new boolean[this.V];
        
       for(int i=0;i<this.V;i++)
       {
           visited[i]=false;
           recVisited[i]=false;
       }
       
       for(int i=0;i<this.V;i++)
       {
           if (isCyclicUtil(i,visited,recVisited))
           {
               return true;
           }
           
       }
       
       return false;
    }

}
