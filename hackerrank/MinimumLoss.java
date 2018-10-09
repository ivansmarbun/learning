/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author Ivan
 */
public class MinimumLoss {
    static final Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        int n = scanner.nextInt();
        long[] arr = new long[n];
        for(int i=0;i<n;i++){
            arr[i] = Long.parseLong(scanner.next());
        }
        long min = Long.MAX_VALUE;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i] > arr[j]){
                    if(arr[i] - arr[j] < min){
                        min = arr[i] - arr[j];
                    }
                }
            }
        }
        System.out.println(min);
    }
}
