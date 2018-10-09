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
public class MiniMax {
    static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        long[] arr = new long[5]; 
        long min = 0, max = 0;
        long sum=0;
        for(int i=0;i<5;i++){
            arr[i] = Integer.parseInt(scanner.next());
            if(i==0){
                min = arr[i];
                max = arr[i];
            }
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min) {
                min = arr[i];
            }
            sum+=arr[i];
        }
        System.out.print((sum-max) +" "+ (sum-min));
        System.out.println("");
    }
}
