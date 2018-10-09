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
public class TimeConversion {
    static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String time = scanner.nextLine();
        String timeTemp = null;
        String zone = time.substring(time.length()-2);
        if(zone.equals("AM")) {
            timeTemp = time.substring(0, time.length()-2);
            String[] timeSplit = timeTemp.split(":");
            if(timeSplit[0].equals("12")) {
                timeSplit[0] = "00";
                System.out.println(timeSplit[0]+":"+timeSplit[1]+":"+timeSplit[2]);
            } else {
            System.out.println(time.substring(0, time.length()-2));
            }
        } else {
            time = time.substring(0, time.length()-2);
            String[] timeSplit = time.split(":");
            if(!timeSplit[0].equals("12")){
                int hour = Integer.parseInt(timeSplit[0]);
                hour = hour + 12;
                timeSplit[0] = Integer.toString(hour);
            } else {
                timeSplit[0] = "12";
            }
            System.out.println(timeSplit[0]+":"+timeSplit[1]+":"+timeSplit[2]);
            
        }
    }
}
