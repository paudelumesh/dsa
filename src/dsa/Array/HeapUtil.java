/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa.Array;

/**
 *
 * @author sanjeev
 */
public class HeapUtil {
    
    public static int kthSmallest(int [][] arr,int k)
    {
        if(k<0||k>arr.length*arr[0].length)
        {
            throw new RuntimeException("K is out of bound");
        }
        
        MinHeap mheap=new MinHeap(arr.length*arr[0].length);
        
        for(int i=0;i<arr.length;i++)
        {
            for (int j=0;j<arr[i].length;j++)
            {
                mheap.insert(arr[i][j]);
            }
        }
               mheap.printall();

        for(int i=0;i<k;i++)
        {
            mheap.pop();
        }
        
        System.out.println("");
                mheap.printall();
                
                System.out.println("");
                System.out.println(mheap.pop());

        
        
       
        
        
        return 0;
    }
    
    
    public static void main(String[] args) {
    
        int [][] arr=new int[][]{ {10, 20, 30, 40},
                    {15, 25, 35, 45},
                    {25, 29, 37, 48},
                    {32, 33, 39, 50}
                  };
        kthSmallest(arr,6);
    }
    
}
