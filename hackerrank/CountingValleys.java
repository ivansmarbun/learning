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
public class CountingValleys {
    static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.nextLine();
        String step = scanner.nextLine();
        int count=0;
        int val = 0;
        for(int i=0;i<n;i++) {
            if(step.charAt(i) == 'D') {
                count--;
            } if(step.charAt(i) == 'U') {
                count++;
                if(count==0) {
                    val++;
                }
            }
        }
        System.out.println(val);
    }
}
