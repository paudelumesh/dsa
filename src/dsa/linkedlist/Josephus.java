/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa.linkedlist;

/**
 *
 * @author sanjeev
 */
public class Josephus {

    private int pNum;
    private int cNum;
    
    Circular cPeople;
    Node head;
    Node tail;
    public Josephus() {
        cPeople=new Circular();
        
    }

    public Josephus(int pNum, int cNum) {
        this.pNum = pNum;
        this.cNum = cNum;
        cPeople=new Circular();
    }
    
    public void init()
    {
        for(int i=1;i<=pNum;i++)
        {
            cPeople.add(i);
        }
    }
    
    public void display()
    {
        System.out.print("Alive: ");
        cPeople.printall();
        System.out.println("");
    }
    
    public void move()
    {
        for(int i=0;i<cNum-1;i++)
        {
            tail=head;
            head=head.next;
        }
        System.out.println("Killed "+head.val);
    }
    
    public void execute()
    {
        tail=null;
        head=cPeople.getFirst();
        
        
        while(pNum!=1)
        {
            move();
            cPeople.delete(head.val);
            tail=tail.next;
            head=head.next;
            pNum--;
            display();
            
        }
    }
    
    
    
    public static void main(String[] args) {
        
        Josephus j=new Josephus(8,3);
        j.init();
        j.display();
        j.execute();
        
    }
    
   
    
}
