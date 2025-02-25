/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hexadecimaltodecimal;

import java.util.Scanner;

/**
 *
 * @author Vu Minh Khang - CE191371 -
 */
public class HexadecimalToDecimal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        String inputStr;

        System.out.print("Enter a Hexadecimal string: ");
        inputStr = input.nextLine().trim().toLowerCase();
        
        testHexadecimalToDecimal(inputStr, hexadecimalToDecimal(inputStr), hexadecimalToDecimal(inputStr) != 0);
    }
    
    public static int hexadecimalToDecimal(String hexStr) {
        String hexNum = "0123456789abcdef";
        int result = 0;
        int base = 0;

        while (hexStr.length() != 0) {

            if (hexNum.indexOf(hexStr.charAt(hexStr.length() - 1)) == -1) {
                return 0;
            } else {
                
                result += hexNum.indexOf(hexStr.charAt(hexStr.length() - 1)) * (int)Math.pow(16, base);
            }

            hexStr = hexStr.substring(0, hexStr.length() - 1);
            base++;
        }

        return result;
    }
    
    public static void testHexadecimalToDecimal(String inStr, int hexNumber, boolean check) {
        if (check) {
            System.out.printf("The equivalent decimal number for hexadecimal \"%s\" is: %d\n", inStr, hexNumber);
        } else {
            System.out.printf("error: invalid hexadecimal string \"%s\"\n", inStr);
        }
    }
}
