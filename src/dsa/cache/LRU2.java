/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa.cache;

import java.util.LinkedHashMap;

/**
 *
 * @author sanjeev
 */
public class LRU2 extends LinkedHashMap<Integer,Integer> {
    
    
    
    int capacity;

    public LRU2(int capacity) {
        super(capacity, 0.75f,true);
        this.capacity = capacity;
    }
    
    @Override
    protected boolean removeEldestEntry(java.util.Map.Entry<Integer,Integer> eldes)
    {
        return this.size()>this.capacity;
    }
    
    
    
}
