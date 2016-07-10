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
public class SPLDemo {

    public static void main(String[] args) {

//        new int[][]{{0   1  2  3  4  5  6  7  8
//                      0, 4, 0, 0, 0, 0, 0, 8, 0},
//                    1{4, 0, 8, 0, 0, 0, 0, 11, 0},
//                    2{0, 8, 0, 7, 0, 4, 0, 0, 2},
//                    3{0, 0, 7, 0, 9, 14, 0, 0, 0},
//                    4{0, 0, 0, 9, 0, 10, 0, 0, 0},
//                    5{0, 0, 4, 0, 10, 0, 2, 0, 0},
//                    6{0, 0, 0, 14, 0, 2, 0, 1, 6},
//                    7{8, 11, 0, 0, 0, 0, 1, 0, 7},
//                    8{0, 0, 2, 0, 0, 0, 6, 7, 0}
//                                 };
        DijkstraSPL dspl = new DijkstraSPL(9);

        dspl.addEdge(0, 1, 4);
        dspl.addEdge(0, 7, 8);

        dspl.addEdge(1, 0, 4);
        dspl.addEdge(1, 7, 11);
        dspl.addEdge(1, 2, 8);

        dspl.addEdge(2, 1, 8);
        dspl.addEdge(2, 3, 7);
        dspl.addEdge(2, 5, 4);
        dspl.addEdge(2, 8, 2);

        dspl.addEdge(3, 2, 7);
        dspl.addEdge(3, 4, 9);
        dspl.addEdge(3, 5, 14);

        dspl.addEdge(4, 3, 9);
        dspl.addEdge(4, 5, 10);

        dspl.addEdge(5, 2, 4);
        dspl.addEdge(5, 4, 10);
        dspl.addEdge(5, 6, 2);

        dspl.addEdge(6, 3, 14);
        dspl.addEdge(6, 5, 2);
        dspl.addEdge(6, 7, 1);
        dspl.addEdge(6, 8, 6);

        dspl.addEdge(7, 0, 8);
        dspl.addEdge(7, 1, 11);
        dspl.addEdge(7, 6, 1);
        dspl.addEdge(7, 8, 7);
        dspl.addEdge(8, 2, 2);
        dspl.addEdge(8, 6, 6);
        dspl.addEdge(8, 7, 7);
        
          dspl.shortestPath(0);

    }
}
