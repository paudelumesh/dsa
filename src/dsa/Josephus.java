/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa;

import java.util.*;

/**
 *
 * @author sanjeev
 */
public class Josephus {

    public static void main(String[] argv) {
        List<Integer> r;
        josephus2(8, 3, 1);
       System.out.println(r = josephus2(8, 3, 1));                     // show entire sequence
        System.out.printf("Person %d is last\n", r.get(r.size() - 1));  // who's last?
    }

// remove N elements in equal steps starting at specific point
    static List<Integer> josephus(int N, int step, int start) {
        if (N < 1 || step < 1 || start < 1) {
            return null;
        }

        List<Integer> p = new LinkedList<Integer>();
        for (int i = 0; i < N; i++) {
            p.add(i + 1);
        }

        List<Integer> r = new LinkedList<Integer>();
        int i = (start - 2) % N;
        for (int j = N; j > 0; j--) {
            i = (i + step) % N--;
            r.add(p.remove(i--));
        }

        return r;
    }

    static List<Integer> josephus2(int N, int step, int start) {
        if (N < 1 || step < 1 || start < 1) {
            return null;
        }

        List<Integer> people = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            people.add(i);
        }

        List<Integer> ret = new LinkedList<>();
        int i = (start - 2) % N;
        for (int j = N; j > 0; j--) {
            i = (i + step) % N--;
            
            ret.add(people.remove(i--));
            

        }

        return ret;
    }

}
