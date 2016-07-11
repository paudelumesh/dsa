/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa.Strings;

/**
 *
 * @author sanjeev
 */
public class EDDemo {

    public static void main(String[] args) {

        EditDistance ed = new EditDistance();
      
        System.out.println("======Recursion=====");

        System.out.println(ed.editDistance("Sunday", "Saturday", 6, 8));
        System.out.println("======Dynamic Programming=======");
        System.out.println(ed.editDistanceDP("Sunday", "Saturday"));

    }

}
