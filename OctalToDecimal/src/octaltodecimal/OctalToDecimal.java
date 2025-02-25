/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package octaltodecimal;

import java.util.Scanner;

/**
 *
 * @author Vu Minh Khang - CE191371 -
 */
public class OctalToDecimal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        String inputStr;

        System.out.print("Enter a Octal string: ");
        inputStr = input.nextLine().trim().toLowerCase();
    
        testOctalToDecimal(inputStr, octalToDecimal(inputStr), octalToDecimal(inputStr) != 0);
    }
    
    public static int octalToDecimal(String octalStr) {
        String octalNum = "01234567";
        int result = 0;
        int base = 0;

        while (octalStr.length() != 0) {

            if (octalNum.indexOf(octalStr.charAt(octalStr.length() - 1)) == -1) {
                return 0;
            } else {
                
                result += octalNum.indexOf(octalStr.charAt(octalStr.length() - 1)) * (int)Math.pow(8, base);
            }

            octalStr = octalStr.substring(0, octalStr.length() - 1);
            base++;
        }

        return result;
    }
    
    public static void testOctalToDecimal(String inStr, int octalNumber, boolean check) {
        if (check) {
            System.out.printf("The equivalent decimal number for octal \"%s\" is: %d\n", inStr, octalNumber);
        } else {
            System.out.printf("error: invalid octal string \"%s\"\n", inStr);
        }
    }
    
}
