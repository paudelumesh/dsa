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
public class MinHeap {

    private int[] Heap;

    private int size;
    private int maxsize;

    public MinHeap(int maxsize) {

        this.maxsize = maxsize;
        Heap = new int[maxsize+1];
        size = 0;
        Heap[0] = Integer.MIN_VALUE;
    }

    public int getParent(int i) {
        return i / 2;
    }

    public int getLeftChild(int i) {
        return i * 2;
    }

    public int getRightChild(int i) {
        return i * 2 + 1;
    }

    public void swap(int pos1, int pos2) {
        int tmp = Heap[pos1];
        Heap[pos1] = Heap[pos2];
        Heap[pos2] = tmp;
    }

    public boolean isLeaf(int i) {
        if (i >= (size / 2) && i <= size) {
            return true;
        }
        return false;
    }

    public void insert(int num) {

        Heap[++size] = num;

        int current = size;
        while(Heap[current]<Heap[getParent(current)])
        {
            swap(current,getParent(current));
            current=getParent(current);
        }
    }
    
    public void printall()
    {
//        for (int i = 1; i <= size / 2; i++ )
//        {
//            System.out.println(i+" "+2*i+" "+(2*i+1));
//            System.out.print(" PARENT : " + Heap[i] + " LEFT CHILD : " + Heap[2*i] + " RIGHT CHILD :" + Heap[2 * i  + 1]);
//            System.out.println();
//        }
        
        for(int i=1;i<=size;i++)
        {
            System.out.print(Heap[i]+" ");
        }
        
    }
    
    public int pop()
    {
        int x=Heap[1];
        
        Heap[1]=Heap[size--];

        minHeapify(1);
        return x;
    }

    public void minHeapify(int i) {
        
        if(!isLeaf(i))
        {
            if(Heap[i]>Heap[getLeftChild(i)]||Heap[i]>Heap[getRightChild(i)])
            {
                if(Heap[getLeftChild(i)]>=Heap[getRightChild(i)])
                {
                    swap(i,getRightChild(i));
                    minHeapify(getRightChild(i));
                }
                else
                {
                    swap(i,getLeftChild(i));
                    minHeapify(getLeftChild(i));
                }
            }
        }
        
        

    }
    
    public void minHeap()
    {
        for (int pos = (size / 2); pos >= 1 ; pos--)
        {
            minHeapify(pos);
        }
    }

    
    public static void main(String[] args) {
        
        MinHeap mheap=new MinHeap(20);
        mheap.insert(10);
        mheap.insert(11);
        mheap.insert(8);
        mheap.insert(20);
        mheap.printall();
        System.out.println("");
        mheap.minHeap();
                mheap.printall();
        System.out.println("");
    }
}
