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
public class Circular {

    

    Node first;
    Node last;
    Node current;
    int size;

    public Circular() {

        first = null;
        last = null;
        current = null;
        size = 0;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void step() {
        current = current.next;
    }

    public void add(int x) {
        Node newNode = new Node(x);

        if (isEmpty()) {
            first = newNode;
            current = first;
        } else {
            current.next = newNode;
        }

        newNode.next = first;
        last = newNode;
        step();
        size++;
    }

    public Node search(int x) {
        if (isEmpty()) {
            System.out.println("The list is empty");
            return null;
        }

        Node curr = first;
        int i = 0;
        while (curr.val != x && i < size) {
            curr = curr.next;
            i++;

        }

        if (curr.val == x) {
            System.out.println("Found!!");
            return curr;
        }
        System.out.println("Not found");
        return null;
    }

    void delete(int x) {
        if (isEmpty()) {
            System.out.println("The list is empty");
            return;
        }

        Node prev=first;
        Node curr = prev.next;

        int i = 0;
        while (curr.val != x ) {
            prev=curr;
            curr=curr.next;
        }
        
        if(size==1)
        {
            first=null;
            size--;
        }
        else if(curr==first)
        {
            prev.next=curr.next;
            first=curr.next;
            size--;
            
        }
        else
        {
            prev.next=curr.next;
            size--;
        }
        

    }

    public void printall() {

        if (isEmpty()) {
            System.out.println("The List is empty");
            return;
        }
        Node curr = first;

        for (int i = 0; i < size; i++) {
            System.out.print(curr.val + "\t");

            curr = curr.next;

        }
    }

    public Node getFirst()
    {
        return first;
    }
    public static void main(String[] args) {

        Circular c = new Circular();
        c.add(10);
        c.add(20);
        c.add(30);
        c.printall();
        c.search(20);
        c.search(45);
        c.delete(30);
        c.printall();
    }
    
    

}
 class Node {

        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }



        public Node() {
        }

        @Override
        public String toString() {
            return "Node{" + "val=" + val + ",  next=" + next + '}';
        }

    }