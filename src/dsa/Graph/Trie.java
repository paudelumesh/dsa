/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa.Graph;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author sanjeev
 */
public class Trie {

    private class TrieNode {

        Map<Character, TrieNode> character;
        boolean endNode;

        public TrieNode() {
            character = new HashMap<>();
            endNode = false;
        }

        public Map<Character, TrieNode> getCharacter() {
            return character;
        }

        public void setCharacter(Map<Character, TrieNode> character) {
            this.character = character;
        }

        public boolean isEndNode() {
            return endNode;
        }

        public void setEndNode(boolean endNode) {
            this.endNode = endNode;
        }

    }

    private final TrieNode root;

    public Trie() {
        this.root = new TrieNode();
    }

    public void insert(String word) {
        TrieNode current = root;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            TrieNode node = current.character.get(ch);

            if (node == null) {
                node = new TrieNode();
                current.character.put(ch, node);

            }

            current = node;

        }

        current.endNode = true;
    }

    public static void main(String[] args) {

    }

}
