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
public class DesignerPDFViewer {
    static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[] arr = new int[26];
        for(int i=0;i<26;i++){
            arr[i] = Integer.parseInt(scanner.next());
        }
        
        String text = scanner.next();
        
        int max = 0;
        for(int i=0;i<text.length();i++){
            int c = (int) text.charAt(i);
            int temp = 96;
            if(arr[c - temp - 1] > max) {
                max = arr[c - temp - 1];
            }

        }
        int result = max * text.length();
        System.out.println(result);
    }
}
