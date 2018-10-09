/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Ivan
 */
public class ClimbingTheLeaderboard {
    static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scanner.nextInt();
        int[] scores = new int[n];
        for(int i=0;i<n;i++) {
            scores[i] = Integer.parseInt(scanner.next());
        }      
        
        int m = scanner.nextInt();
        int[] alice = new int[m];
        for(int i=0;i<m;i++) {
            alice[i] = Integer.parseInt(scanner.next());
        }
        int[] arr = Arrays.stream(scores).distinct().sorted().toArray();
        
        
        int j = 0;
        for(int i=0;i<m;i++){
            while(true){
                j = Arrays.binarySearch(arr, alice[i]);
                if(j < 0) {
                    j = arr.length - (-1 * (j + 1)) + 1;
                    System.out.println(j);
                    break;
                } else {
                    j = arr.length - j;
                    System.out.println(j);
                    break;
                }
            }
        }     
    }
}
