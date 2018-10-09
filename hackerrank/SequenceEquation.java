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
public class SequenceEquation {
    static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scanner.nextInt();
        int[] arr = new int[n+1];
        for(int i=1;i<=n;i++){
            int x = Integer.parseInt(scanner.next());
            arr[x] = i;
        }
        for(int i=1;i<=n;i++){
            System.out.println(arr[arr[i]]);
        }
    }
}
