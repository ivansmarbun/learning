/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author Ivan
 */
public class ElectronicsShop {
    static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int b = Integer.parseInt(scanner.next());
        int n = Integer.parseInt(scanner.next());
        int m = Integer.parseInt(scanner.next());
        Vector usb = new Vector();
        Vector kboard = new Vector();
        for(int i=0;i<n;i++) {
            kboard.add(i, Integer.parseInt(scanner.next()));
        }
        Collections.sort(kboard);
        for(int i=0;i<m;i++){
            usb.add(i,Integer.parseInt(scanner.next()));
        }
        Collections.sort(usb, Collections.reverseOrder());
        int j=0;
        int max =-1;
        int sum=0;
        for(int i=0;i<n;i++) {
            for(;j<m;j++) {
                if((Integer)kboard.get(i) + (Integer) usb.get(j) > b) break;
                if((Integer)kboard.get(i) + (Integer) usb.get(j) > max) {
                    max = (Integer)kboard.get(i) + (Integer) usb.get(j);
                }
            }
        }
        System.out.println(max);
    }
}
