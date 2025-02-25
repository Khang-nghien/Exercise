/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hexadecimaltobinary;

import java.util.Scanner;

/**
 *
 * @author Vu Minh Khang - CE191371 -
 */
public class HexadecimalToBinary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a Hexadecimal string: ");
        String hexStr = input.nextLine().trim().toLowerCase();
        
        testHexadecimalToBinary(hexStr, hexadecimalToBinary(hexStr));
    }

    public static String hexadecimalToBinary(String hexStr) {
        
        String output = "";
        final String validHex = "0123456789abcdef";

        final String[] HEX_BITS = {"0000", "0001", "0010", "0011",
            "0100", "0101", "0110", "0111",
            "1000", "1001", "1010", "1011",
            "1100", "1101", "1110", "1111"
        };

        for (int i = 0; i < hexStr.length(); i++) {

            if (validHex.indexOf(hexStr.charAt(i)) == -1) {
                return "";
            }
            
            output += " " + HEX_BITS[validHex.indexOf(hexStr.charAt(i))];

        }

        return output.trim();
    }

    public static void testHexadecimalToBinary(String inStr, String binaryNum) {
        if (binaryNum.length() != 0) {
            System.out.printf("The equivalent binary for hexadecimal \"%s\" is: %s\n", inStr, binaryNum);
        } else {
            System.out.printf("error: invalid string \"%s\"\n", inStr);
        }
    }

}
