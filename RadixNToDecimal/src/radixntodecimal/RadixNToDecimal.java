/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radixntodecimal;

import java.util.Scanner;

/**
 *
 * @author Vu Minh Khang - CE191371 -
 */
public class RadixNToDecimal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String radix;
        String inputStr;

        System.out.print("Enter the radix: ");
        radix = input.nextLine().trim().toLowerCase();

        System.out.print("Enter the String: ");
        inputStr = input.nextLine().trim().toLowerCase();
    
        testRadixNToDecimal(inputStr, radixNToDecimal(radix, inputStr), radixNToDecimal(radix, inputStr) != 0);
    }

    public static int radixNToDecimal(String radixNStr, String inStr) {
        String validNum = "";
        int result = 0;
        int base = 0;

        for (int i = 0; i < Integer.parseInt(radixNStr); i++) {

            if (i < 10) {
                validNum += i;
            } else {
                validNum += String.valueOf((char)(i + 87));
            }
        }

        while (inStr.length() != 0) {

            if (validNum.indexOf(inStr.charAt(inStr.length() - 1)) == -1) {
                return 0;
            } else {

                result += validNum.indexOf(inStr.charAt(inStr.length() - 1)) * (int) Math.pow(Integer.parseInt(radixNStr), base);
            }

            inStr = inStr.substring(0, inStr.length() - 1);
            base++;
        }

        return result;
    }

    public static void testRadixNToDecimal(String inStr, int number, boolean check) {
        if (check) {
            System.out.printf("The equivalent decimal number \"%s\" is: %d\n", inStr, number);
        } else {
            System.out.printf("error: invalid string \"%s\"\n", inStr);
        }
    }

}
