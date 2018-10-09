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
public class Staircase {
    static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scanner.nextInt();
        int space = 0;
        int hash = 0;
        for(int i=0;i<n;i++) {
            for(int j=n;j>=1;j--) {
                space = j-1;
                if(space>i) {
                    System.out.print(" ");
                } else {
                    System.out.print("#");
                }
                space--;
            }
            System.out.println("");
        }
    }
}
