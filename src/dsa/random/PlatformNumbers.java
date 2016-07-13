/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa.random;

import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author sanjeev
 */
public class PlatformNumbers {

    public static int findPlatforms(int[] arr, int[] dep) {
        
        Arrays.sort(arr);
        Arrays.sort(dep);
        
        int i=0;
        int j=0;
        int n=arr.length;
        
        int inplatform=0;
        
        int result=0;
        
        while(i<n &&j<n)
        {
            if(arr[i]<dep[j])
            {
                inplatform++;
                i++;
            }
            else
            {
                inplatform--;
                j++;
            }
            
            if(result<inplatform)
            {
                result=inplatform;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        int arr[] = {900, 940, 950, 1100, 1500, 1800};
        int dep[] = {910, 1200, 1120, 1130, 1900, 2000};
        System.out.println("Total numbers of platform is  "+ findPlatforms(arr,dep));

    }

}
