/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa.Strings;

import static java.lang.Integer.min;

/**
 *
 * @author sanjeev
 */
public class EditDistance {

    public void printMatrix(int[][] dp) {
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[i].length; j++) {
                System.out.print(dp[i][j] + "\t");
            }
            System.out.println("");
        }
    }
/*
    public int minDistance(String word1, String word2) {

        int len1 = word1.length();
        int len2 = word2.length();

        int[][] dp = new int[len1 + 1][len2 + 1];

        for (int i = 0; i <= len1; i++) {
            dp[i][0] = i;
        }
        for (int j = 0; j <= len2; j++) {
            dp[0][j] = j;
        }

        for (int i = 0; i < len1; i++) {
            char c1 = word1.charAt(i);

            System.out.println("======================================================================");

            for (int j = 0; j < len2; j++) {
                char c2 = word2.charAt(j);
                if (c1 == c2) {
                    //  System.out.println(c1+" "+c2);
                    dp[i + 1][j + 1] = dp[i][j];
                } else {
                    int replace = dp[i][j] + 1;
                    int insert = dp[i+1][j] + 1;
                    int delete = dp[i][j+1] + 1;
                    int min = replace > insert ? insert : replace;
                    min = delete > min ? min : delete;
                    dp[i + 1][j + 1] = min;
                    //System.out.println(replace+ " "+ insert+ " "+delete+" ");
                }
            }

            printMatrix(dp);

        }

        System.out.println(len1 + " " + len2);
        return dp[len1][len2];
    }
   */ 
    
    public int calcMin(int a, int b, int c)
    {
        return min(a,min(b,c));
    }
    
    public int editDistance(String word1, String word2, int len1,int len2)
    {
        if (len1==0)
            return len2;
        
        if(len2==0)
            return len1;
        
        if(word1.charAt(len1-1)==word2.charAt(len2-1))
            return editDistance(word1,word2,len1-1,len2-1);
        else
            return 1+calcMin(editDistance(word1,word2,len1,len2-1),editDistance(word1,word2,len1-1,len2),editDistance(word1,word2,len1-1,len2-1));
        
    }
    
    public int editDistanceDP(String word1, String word2)
    {
        int len1=word1.length();
        int len2=word2.length();
        
        int [][]dp=new int[len1+1][len2+1];
        for(int i=0;i<=len1;i++)
        {
            for(int j=0;j<=len2;j++)
            {
                if(i==0)
                    dp[i][j]=j;
                
                else if(j==0)
                    dp[i][j]=i;
                
                else if(word1.charAt(i-1)==word2.charAt(j-1))
                {
                   dp[i][j]=dp[i-1][j-1];
                }
                else
                {
                    dp[i][j]=1+calcMin(dp[i][j-1],dp[i-1][j],dp[i-1][j-1]);
                }
            }
        }
        printMatrix(dp);
        return dp[len1][len2];
                    
    }

}
