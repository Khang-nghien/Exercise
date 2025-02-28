/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primefactor;

import java.util.Scanner;

/**
 *
 * @author Vu Minh Khang - CE191371 -
 */
public class PrimeFactor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the upper bound: ");
        getNumber(Integer.parseInt(input.nextLine()));

        //System.out.println(isProductOfPrimeFactors(7));
    }

    public static void getNumber(int num) {

        int count = 0;

        for (int i = 2; i <= num; i++) {
            if (isProductOfPrimeFactors(i)) {
                count++;
                System.out.print(i + " ");
            }
        }

        System.out.printf("[%d numbers found (%.2f%%)]\n", count, (count / (double) num) * 100);
    }

    public static boolean isProductOfPrimeFactors(int aPostInt) {

        int factor = 1;

        for (int i = 1; i < aPostInt; i++) {

            if (aPostInt % i == 0) {

                if (isPrime(i)) {
                    factor *= i;
                }
            }
        }

        return factor == aPostInt;
    }

    public static boolean isPrime(int aPostInt) {

        if (aPostInt == 1) {
            return true;
        }

        if (aPostInt == 2) {
            return true;
        }

        for (int i = 2; i < aPostInt; i++) {

            if (aPostInt % i == 0) {
                return false;
            }
        }

        return true;
    }

}
