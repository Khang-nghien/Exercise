/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decimaltohexadecimal;

import java.util.Scanner;

/**
 *
 * @author Vu Minh Khang - CE191371 -
 */
public class DecimalToHexadecimal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        String numInput = input.nextLine().trim();

        testDecimalToHexadecimal(numInput, decimalToHexadecimal(Integer.parseInt(numInput)));
    }

    public static String decimalToHexadecimal(int positiveInteger) {

        String output = "";
        int digit;
        int num = positiveInteger;

        while (num > 0) {
            
            digit = num % 16;

            switch (digit) {

                case 10:
                    output = "A" + output;
                    num = num / 16;
                    break;

                case 11:
                    output = "B" + output;
                    num = num / 16;
                    break;

                case 12:
                    output = "C" + output;
                    num = num / 16;
                    break;

                case 13:
                    output = "D" + output;
                    num = num / 16;
                    break;

                case 14:
                    output = "E" + output;
                    num = num / 16;
                    break;

                case 15:
                    output = "F" + output;
                    num = num / 16;
                    break;

                default:
                    output = digit + output;
                    num = num / 16;

            }

        }

        return output;
    }

    public static void testDecimalToHexadecimal(String inStr, String hexStr) {
        System.out.printf("The equivalent hexadecimal is: %s\n", hexStr);

    }

}
