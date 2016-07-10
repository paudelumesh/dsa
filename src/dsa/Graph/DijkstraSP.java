/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa.Graph;

/**
 *
 * @author sanjeev
 */
public class DijkstraSP {
    
    private int vertices;

    public DijkstraSP(int vertices) {
        this.vertices = vertices;
    }

    public DijkstraSP() {
    }
    
    
    public int minDistance(int [] dist, boolean [] sptSet)
    {
        int min=Integer.MAX_VALUE;
        int min_index=-1;
        
        for(int v=0;v<this.vertices;v++)
        {
            if(dist[v]<=min&&sptSet[v]==false)
            {
                min=dist[v];
                min_index=v;
            }
        }
        
        return min_index;
        
    }
    
    private void printPath(int [] sPath)
    {
        System.out.println("===Shortest Path from each Vertices====");
        for(int v=0;v<this.vertices;v++)
        {
            System.out.println(v+"\t\t"+sPath[v]);
        }
    }
    
    
    public void shortesPath(int [][] graph,int src)
    {
        int [] sPath=new int[this.vertices];
        
        boolean spt[]=new boolean[this.vertices];
        
        for(int i=0;i<this.vertices;i++)
        {
            sPath[i]=Integer.MAX_VALUE;
            spt[i]=false;
        }
        sPath[src]=0;
        
        for(int count=0;count<this.vertices-1;count++)
        {
            int u=minDistance(sPath,spt);
            spt[u]=true;
            for(int v=0;v<this.vertices;v++)
            {
                if(!spt[v]&&graph[u][v]!=0&&sPath[u]!=Integer.MAX_VALUE&&sPath[u]+graph[u][v]<sPath[v])
                {
                    sPath[v]=sPath[u]+graph[u][v];
                }
            }
            
        }
        
        printPath(sPath);
    }
}
