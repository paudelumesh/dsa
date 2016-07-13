/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa.cache;

/**
 *
 * @author sanjeev
 */
public class LRU2Demo {


    public static void main(String[] args) {
        
        LRU lru=new LRU(10);
        
        lru.display();
        System.out.println("");
        lru.set(1, 100);
        lru.set(2, 40);
        lru.set(3, 500);
        lru.set(4, 600);
        lru.set(5, 700);
        lru.set(6, 800);
        lru.set(7, 900);
        
         System.out.println(lru.get());

        
        
    }
    
}
