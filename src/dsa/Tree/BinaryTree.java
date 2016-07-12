/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa.Tree;

/**
 *
 * @author sanjeev
 */
public class BinaryTree<T> {

   

    Node<T> root;

    public BinaryTree() {
    }

    public void addNode(int key, T value) {
         Node<T> newNode = new Node<>(key, value);

        if (root == null) {
            root = newNode;

        } else {
            Node<T> current = root;

            Node<T> parent;

            while (true) {
               parent=current;
               
               if(key<current.key)
               {
                   current=current.leftChild;
                   if(current==null)
                   {
                       parent.leftChild=newNode;
                       return;
                   }
               }
               else
               {
                   current=current.rightChild;
                   if(current==null)
                   {
                       parent.rightChild=newNode;
                       return;
                   }
               }
            }
        }

    }
    
    public void inorder()
    {
        inorder(root);
    }
    
    public void preorder()
    {
        preorder(root);
    }
    
    public void postorder()
    {
        postorder(root);
    }
    
    public void inorder(Node node)
    {
        if(node==null)
            return;
        
        inorder(node.leftChild);
        System.out.println(node);
        inorder(node.rightChild);
    }

    
    public void postorder(Node node)
    {
        
        if(node==null)
        {
            return;
        }
        postorder(node.leftChild);
        postorder(node.rightChild);
        System.out.println(node);
    }
    
    public void preorder(Node node)
    {
        if(node==null)
        {
            return;
        }
        System.out.println(node);
        preorder(node.leftChild);
        preorder(node.rightChild);
        
    }
    
    public Node search(int key)
    {
        Node<T> current=root;
        
        while(current.key!=key)
        {
           
            if(key<current.key)
            {
                current=current.leftChild;
            }
            else
            {
                current=current.rightChild;
            }
            
            if(current==null)
            {
                return null;
            }
        }
        
        return current;
        
    }
    
    public Node<T> delete(int key)
    {
        Node<T> current=root;
        
        
        
        return null;
    }
    
}


class Node<T> {

        int key;
        T value;

        Node leftChild;
        Node rightChild;

        public Node() {
        }

        public Node(int key, T value) {
            this.key = key;
            this.value = value;
        }

        public Node(int key, T value, Node leftChild, Node rightChild) {
            this.key = key;
            this.value = value;
            this.leftChild = leftChild;
            this.rightChild = rightChild;
        }

        public int getKey() {
            return key;
        }

        public void setKey(int key) {
            this.key = key;
        }

        public T getValue() {
            return value;
        }

        public void setValue(T value) {
            this.value = value;
        }

        public Node getLeftChild() {
            return leftChild;
        }

        public void setLeftChild(Node leftChild) {
            this.leftChild = leftChild;
        }

        public Node getRightChild() {
            return rightChild;
        }

        public void setRightChild(Node rightChild) {
            this.rightChild = rightChild;
        }

        @Override
        public String toString() {
            return "Node{" + "key=" + key + ", value=" + value + '}';
        }

    }