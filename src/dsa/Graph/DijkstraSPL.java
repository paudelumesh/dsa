/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa.Graph;

import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author sanjeev
 */
public class DijkstraSPL {

    private int vertices;

    private LinkedList<Node> adjList[];

    private class Node {

        private int dest;
        private int wt;

        public Node(int dest, int wt) {
            this.dest = dest;
            this.wt = wt;
        }

        public int getDest() {
            return dest;
        }

        public void setDest(int dest) {
            this.dest = dest;
        }

        public int getWt() {
            return wt;
        }

        public void setWt(int wt) {
            this.wt = wt;
        }

    }

    public DijkstraSPL(int vertices) {
        this.vertices = vertices;
        adjList = new LinkedList[this.vertices];
        for (int i = 0; i < this.vertices; i++) {
            adjList[i] = new LinkedList<Node>();
        }
    }

    public void addEdge(int u, int v, int wt) {
        adjList[u].add(new Node(v, wt));

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

    private void printPath(int[] sPath) {
        System.out.println("===Shortest Path from each Vertices====");
        for (int v = 0; v < this.vertices; v++) {
            System.out.println(v + "\t\t" + sPath[v]);
        }
    }

    public void shortestPath(int src) {

        boolean visited[] = new boolean[this.vertices];

        int[] sPath = new int[this.vertices];

        for (int v = 0; v < this.vertices; v++) {
            visited[v] = false;
            sPath[v] = Integer.MAX_VALUE;
        }

       sPath[src]=0;

        for (int i = 0; i < this.vertices; i++) {
            int u = minDistance(sPath, visited);
           
            visited[u] = true;

            Iterator<Node> itr = adjList[u].listIterator();
            while (itr.hasNext()) {
                Node vNode = itr.next();
                int v = vNode.getDest();
                int wt = vNode.getWt();
                if (!visited[v] && wt != 0 && sPath[u] != Integer.MAX_VALUE && sPath[u] + wt < sPath[v]) {
                    sPath[v] = sPath[u] + wt;
                }

            }
        }

        printPath(sPath);
    }

}
