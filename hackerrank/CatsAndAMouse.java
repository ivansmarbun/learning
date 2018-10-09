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
public class CatsAndAMouse {
    static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scanner.nextInt();
        for(int i=0;i<n;i++){
            int ca = Integer.parseInt(scanner.next());
            int cb = Integer.parseInt(scanner.next());
            int m = Integer.parseInt(scanner.next());            
            
            if(Math.abs(ca - m) > Math.abs(cb - m) ){
                System.out.println("Cat B");
            } else if (Math.abs(ca - m) < Math.abs(cb - m) ){
                System.out.println("Cat A");
            } else {
                System.out.println("Mouse C");
            }
        }
    }
}
