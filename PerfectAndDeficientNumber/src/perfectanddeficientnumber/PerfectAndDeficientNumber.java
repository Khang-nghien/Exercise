/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perfectanddeficientnumber;

import java.util.Scanner;

/**
 *
 * @author Vu Minh Khang - CE191371 -
 */
public class PerfectAndDeficientNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the upper bound: ");

        addNumber(Integer.parseInt(input.nextLine()));

    }

    public static void addNumber(int max) {
        
        int countPerfectNumber = 0;

        for (int i = 1; i <= max; i++) {
            if (isPerfect(i)) {
                System.out.print(i + " ");
                countPerfectNumber++;
            }
        }
        
        System.out.printf("[%d perfect numbers found (%.2f%%)]\n", countPerfectNumber, (countPerfectNumber / (double)max) * 100);
    
        int countDeficientNumber = 0;
        
        for (int i = 1; i <= max; i++) {
            if (isDeficient(i)) {
                System.out.print(i + " ");
                countDeficientNumber++;
            }
        }
        
        System.out.println("");
        System.out.printf("[%d numbers found (%.2f%%)]\n", countDeficientNumber, (countDeficientNumber / (double)max) * 100);
    }

    public static boolean isPerfect(int aPosInt) {

        int sum = 0;

        for (int i = 1; i <= aPosInt / 2; i++) {

            if (aPosInt % i == 0) {
                sum += i;
            }

        }

        return sum == aPosInt;
    }

    public static boolean isDeficient(int aPosInt) {

        int sum = 0;

        for (int i = 2; i < aPosInt; i++) {

            if (aPosInt % i == 0) {
                sum += i;
            }
        }
        
        if (sum == aPosInt) {
            return false;
        } else if (sum < aPosInt) {
            return false;
        }

        return true;
    }

}
