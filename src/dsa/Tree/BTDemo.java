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
public class BTDemo {

    public static void main(String[] args) {

        BinaryTree<String> btree = new BinaryTree<>();

        btree.addNode(10, "Sanjeev1");
        btree.addNode(21, "Sanjeev2");
        btree.addNode(22, "Sanjeev3");
        btree.addNode(17, "Sanjeev4");
        btree.addNode(43, "Sanjeev5");
        btree.addNode(34, "Sanjeev6");
        btree.addNode(67, "Sanjeev7");
        btree.addNode(52, "Sanjeev8");
        btree.addNode(12, "Sanjeev9");
        btree.addNode(12, "Sanjeev10");
        btree.addNode(14, "Sanjeev11");
        btree.addNode(7, "Sanjeev12");
        btree.addNode(56, "Sanjeev13");

        System.out.println("Inorder");
        btree.inorder();

        System.out.println("Pre order");

        btree.preorder();

        System.out.println("Post order");
        btree.postorder();

        System.out.println("=====SEARCH====");

        System.out.println(btree.search(67));
        System.out.println(btree.search(56));

        System.out.println(btree.search(13));

    }

}
