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
public class CyclicDemo {

    public static void main(String[] args) {

        Graph g = new Graph(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
        
        if(g.isCyclic())
        {
            System.out.println("Cyclic");
        }
        else
        {
            System.out.println("ACyclic");
        }
    }

}
