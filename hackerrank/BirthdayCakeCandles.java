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
public class BirthdayCakeCandles {
    static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scanner.nextInt();
        int max=0, count=0;
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = Integer.parseInt(scanner.next());
            if(i==0){
                max = arr[i];
            }
            if(arr[i] > max) {
                max = arr[i];
                count = 1;
            } else if(arr[i] == max) {
                count++;
            }
            if(n==1) {
                count = 1;
            }
        }
        System.out.println(count);
    }
}
