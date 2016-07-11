/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa.Strings;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

/**
 *
 * @author sanjeev
 */
public class WordLadder {
    
    private class WordNode
    {
        String word;
        int numSteps;

        public WordNode(String word, int numSteps) {
            this.word = word;
            this.numSteps = numSteps;
        }
        
    }
    
    public int ladderLength(String beginWord, String endWord, Set<String> dict)
    {
        LinkedList<WordNode> queue=new LinkedList<>();
        queue.add(new WordNode(beginWord,1));
        dict.add(endWord);
        
        while(!queue.isEmpty())
        {
            WordNode top=queue.remove();
            String word=top.word;
            
            if(word.equals(endWord))
            {
                return top.numSteps;
            }
            
            
            
           char [] arr=word.toCharArray();
            for(int i=0;i<arr.length;i++)
            {
                for(char c='a';c<='z';c++)
                {
                    char temp=arr[i];
                    if(arr[i]!=c)
                    {
                        arr[i]=c;
                    }
                    
                    String newWord=new String(arr);
                    if(dict.contains(newWord))
                    {
                        System.out.println(newWord);
                        queue.add(new WordNode(newWord,top.numSteps+1));
                        dict.remove(newWord);
                    }
                    arr[i]=temp;
                }
            }
            
        }
        
        
        return 0;
    }
    
    public static void main(String[] args) {
        
        WordLadder wl=new WordLadder();
        
        System.out.println(wl.ladderLength("hot", "cog", new HashSet<>(Arrays.asList("hot","dot","dog","lot","log"))));
        
    }
    
}
