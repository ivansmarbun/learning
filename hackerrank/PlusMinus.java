/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

import java.util.Scanner;

/**
 *
 * @author Ivan
 */
public class PlusMinus {
    static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int x;
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int pos=0, neg=0, zer=0;
        for(int i=0;i<n;i++) {
           arr[i] = Integer.parseInt(scanner.next());
           if(arr[i]>0) {
               pos++;
           } else if(arr[i] < 0) {
               neg++;
           } else {
               zer++;
           }
        }
        System.out.println(String.format("%.6f", (double) pos/n));
        System.out.println(String.format("%.6f", (double) neg/n));
        System.out.println(String.format("%.6f", (double) zer/n));
    }
}
