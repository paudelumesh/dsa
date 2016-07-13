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
public class ArrayUtil {

    public static void transpose(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr[0].length; j++) {
                int tmp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = tmp;
            }
        }

    }

    private static void transpose2(int[][] m) {

        for (int i = 0; i < m.length; i++) {
            for (int j = i; j < m[0].length; j++) {
                int x = m[i][j];
                m[i][j] = m[j][i];
                m[j][i] = x;
            }
        }
    }

    public static void rotateArrayLeftInPlace(int[][] arr) throws RuntimeException {
        if (arr.length != arr[0].length) {
            throw new RuntimeException("For inplace rotation, the matrix should be square");
        }
        transpose(arr);

        int len = arr.length;
        for (int i = 0; i < len / 2; i++) {
            for (int j = 0; j < len; j++) {
                int tmp = arr[i][j];
                arr[i][j] = arr[len - i - 1][j];
                arr[len - i - 1][j] = tmp;
            }
        }
    }

    public static void rotateArrayRightInPlace(int[][] arr) throws RuntimeException {
        if (arr.length != arr[0].length) {
            throw new RuntimeException("For inplace rotation, the matrix should be square");
        }
        transpose(arr);

        int len = arr.length;
        for (int i = 0; i < len / 2; i++) {
            for (int j = 0; j < len; j++) {
                int tmp = arr[j][i];
                arr[j][i] = arr[j][len - i - 1];
                arr[j][len - i - 1] = tmp;
            }
        }
    }

    public static void rotateByNinetyToLeft(int[][] m) {

        int e = m.length - 1;
        int c = e / 2;
        int b = e % 2;
        for (int r = c; r >= 0; r--) {
            for (int d = c - r; d < c + r + b; d++) {
                int t = m[c - r][d];
                m[c - r][d] = m[d][e - c + r];
                m[d][e - c + r] = m[e - c + r][e - d];
                m[e - c + r][e - d] = m[e - d][c - r];
                m[e - d][c - r] = t;
            }
        }
    }

    
    
    public static void main(String[] args) {

        int[][] array = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};

        try {
            for (int[] i : array) {
                for (int j : i) {
                    System.out.print(j + "\t");
                }
                System.out.println("");
            }
            rotateByNinetyToLeft(array);
            System.out.println("=====================");
            for (int[] i : array) {
                for (int j : i) {
                    System.out.print(j + "\t");
                }
                System.out.println("");
            }

            System.out.println("=====================");

        } catch (RuntimeException ex) {
            ex.printStackTrace();
        } finally {

        }
    }

}
