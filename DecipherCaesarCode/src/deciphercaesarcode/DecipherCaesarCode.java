/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deciphercaesarcode;

import java.util.Scanner;

/**
 *
 * @author Vu Minh Khang - CE191371 -
 */
public class DecipherCaesarCode {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        String inputStr;

        System.out.print("Enter a String: ");
        inputStr = input.nextLine().trim().toUpperCase();
        
        testDecipherCaesarCode(decipherCaeCode(inputStr));
    }
    
    public static String decipherCaeCode(String inStr) {
        String outputStr = "";
        
        for (Character c : inStr.toCharArray()) {
            outputStr += (char)(c - 3);
        }
        
        return outputStr;
    }
    
    public static void testDecipherCaesarCode(String inStr) {
        System.out.println("The plaintext string is: " + inStr.toUpperCase());
    }
    
}
