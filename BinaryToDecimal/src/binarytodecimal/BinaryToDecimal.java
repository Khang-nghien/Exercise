/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarytodecimal;

import java.util.Scanner;

/**
 *
 * @author Vu Minh Khang - CE191371 -
 */
public class BinaryToDecimal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String inputStr;

        System.out.print("Enter a Binary string: ");
        inputStr = input.nextLine().trim().toLowerCase();
        
        testBinaryToDecimal(inputStr, binaryToDecimal(inputStr), binaryToDecimal(inputStr) != 0);

    }

    public static int binaryToDecimal(String bin_Str) {
        String binaryNum = "01";
        int result = 0;
        int base = 0;

        while (bin_Str.length() != 0) {

            if (binaryNum.indexOf(bin_Str.charAt(bin_Str.length() - 1)) == -1) {
                return 0;
            } else {
                if (bin_Str.charAt(bin_Str.length() - 1) == '1') {
                    result += 1 * (int)Math.pow(2, base);
                }

            }

            bin_Str = bin_Str.substring(0, bin_Str.length() - 1);
            base++;
        }

        return result;
    }

    public static void testBinaryToDecimal(String inStr, int binaryNumber, boolean check) {
        if (check) {
            System.out.printf("The equivalent decimal number for binary \"%s\" is: %d\n", inStr, binaryNumber);
        } else {
            System.out.printf("error: invalid binary string \"%s\"\n", inStr);
        }
    }

}
