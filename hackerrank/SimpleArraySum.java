/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author Ivan
 */
public class SimpleArraySum {
    static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scanner.nextInt();
        int hasil = 0;
        Vector vec = new Vector();
        for(int i=0;i<n;i++) {
            vec.add(i, Integer.parseInt(scanner.next()));
            hasil+= (Integer) vec.get(i);
        }
        System.out.println(hasil);
    }
}
