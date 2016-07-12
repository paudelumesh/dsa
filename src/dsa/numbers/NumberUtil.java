/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa.numbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

/**
 *
 * @author sanjeev
 */
public class NumberUtil {

    public static double sqrt(int n) {
        double x, limit = n / 2;

        do {
            x = limit;
            limit = (x + n / x) / 2;
        } while ((x - limit) != 0);

        return limit;
    }

    public static int[] primes(int start, int end) {

        Boolean[] primeTable = new Boolean[end];
        Arrays.fill(primeTable, true);

        primeTable[0] = false;
        primeTable[1] = false;
        ArrayList<Integer> primes = new ArrayList<>();

        for (int i = 2; i < primeTable.length; i++) {
            if (primeTable[i]) {
                for (int j = 2; j * i < primeTable.length; j++) {
                    primeTable[j * i] = false;
                }

            }
        }

        for (int i = 0; i < primeTable.length; i++) {
            if (primeTable[i]) {
                primes.add(i);
            }
        }

        return primes.stream().mapToInt(i -> i).toArray();

    }

    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        if (n % 2 == 0) {
            return false;
        }

        for (int i = 2; i * i < n; i++) {
               if(n%i==0)
               {
                   return false;
               }
        }
        
        return true;

    }

    public static void main(String[] args) {

        int[] pnums = NumberUtil.primes(10, 100);
        
        for(int i:pnums)
        {
            System.out.println(NumberUtil.isPrime(i));
        }
        System.out.println(NumberUtil.isPrime(12));
    }

}
