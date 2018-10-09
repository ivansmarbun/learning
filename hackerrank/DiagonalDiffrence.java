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
public class DiagonalDiffrence {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scanner.nextInt();
        
        int[][] arr = new int[n][n];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++) {
                arr[i][j] = Integer.parseInt(scanner.next());
            }
        }
        
        int hasil = solution(arr);
        System.out.println(hasil);
    }
    
    static int solution(int[][] arr){
        int length = arr.length;
        int row = 0;
        int col = 0;
        int left = 0;
        int right = 0;
        while(true) {
            left += arr[row][col];
            row++;
            col++;
            if(col >= length) {
                break;
            }
        }
        row = 0;
        col = length-1;
        while(true) {
            right += arr[row][col];
            row++;
            col--;
            if(col < 0) {
                break;
            }
        }
        return Math.abs(left - right);
    }
}

