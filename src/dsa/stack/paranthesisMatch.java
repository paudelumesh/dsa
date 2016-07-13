/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa.stack;

import java.util.HashMap;
import java.util.Stack;

/**
 *
 * @author sanjeev
 */
public class paranthesisMatch {

    static Stack<Character> stk;

    public static boolean isValid(String str) {
   
        HashMap<Character,Character> keymap=new HashMap<>();
        
        keymap.put('{','}');
        keymap.put('(',')');
        keymap.put('[',']');
        
        Stack <Character> stk=new Stack<>();
        
        for(int i=0;i<str.length();i++)
        {
            char c=str.charAt(i);
            if(keymap.keySet().contains(c))
            {
                stk.push(c);
            }
            else if (keymap.values().contains(c))
            {
                if(!stk.isEmpty()&&keymap.get(stk.peek())==c)
                {
                    stk.pop();
                }
                else
                {
                    return false;
                }
            }
        }
        
        
        return stk.isEmpty();
        
        
    }

    public static void main(String[] args) {

        System.out.println(isValid("{{{()}}}()}"));

        System.out.println(isValid("{{{({({({({})})})})}}}"));

    }

}
