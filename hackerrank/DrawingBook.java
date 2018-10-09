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
public class DrawingBook {
    static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scanner.nextInt();
        int p = scanner.nextInt();
        
        System.out.println(Math.min(Math.abs(p/2), Math.abs(n/2-p/2)));
    }
}
