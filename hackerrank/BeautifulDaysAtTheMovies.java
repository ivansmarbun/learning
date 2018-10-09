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
public class BeautifulDaysAtTheMovies {
    static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int s = Integer.parseInt(scanner.next());
        int e = Integer.parseInt(scanner.next());
        int d = Integer.parseInt(scanner.next());
        
        int count = 0;
        for(int i=s;i<=e;i++) {
            int x = i;
            int temp = 0;
            do{
               temp = (temp * 10) + (x%10);
               x/=10;
            } while(x!=0);
            int result = (Math.abs(i - temp))%d;
            if(result==0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
