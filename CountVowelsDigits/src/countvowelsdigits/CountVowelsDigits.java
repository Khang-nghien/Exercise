/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countvowelsdigits;

import java.util.Scanner;

/**
 *
 * @author Vu Minh Khang - CE191371 -
 */
public class CountVowelsDigits {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String inputStr;

        System.out.print("Enter a String: ");
        inputStr = input.nextLine().trim().toLowerCase();

        testCountVowelsDigits(countVowels(inputStr), countDigits(inputStr), calPercentAppear(countVowels(inputStr), inputStr.length()), calPercentAppear(countDigits(inputStr), inputStr.length()));
    }

    public static void testCountVowelsDigits(int numberVowels, int numberDigits, double vowelsPercent, double digtisPercent) {
        System.out.printf("Number of vowels: %d (%.2f%%)\n", numberVowels, vowelsPercent);
        System.out.printf("Number of digits: %d (%.2f%%)\n", numberDigits, digtisPercent);
    }

    public static int countVowels(String inStr) {
        int count = 0;

        for (int i = 0; i < inStr.length(); i++) {

            if (inStr.charAt(i) == 'i' || inStr.charAt(i) == 'u' || inStr.charAt(i) == 'e' || inStr.charAt(i) == 'o' || inStr.charAt(i) == 'a') {
                count++;
            }
        }

        return count;
    }

    public static int countDigits(String inStr) {
        int count = 0;
        String number = "0123456789";
        
        for (int i = 0; i < inStr.length(); i++) {

            if (number.indexOf(inStr.charAt(i)) != -1) {
                count++;
            }
        }

        return count;
    }

    public static double calPercentAppear(int number, int max) {
        return (double) (number) / max * 100;
    }

}
