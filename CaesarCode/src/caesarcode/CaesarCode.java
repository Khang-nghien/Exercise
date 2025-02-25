/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caesarcode;

import java.util.Scanner;

/**
 *
 * @author Vu Minh Khang - CE191371 -
 */
public class CaesarCode {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        String inputStr;

        System.out.print("Enter a String: ");
        inputStr = input.nextLine().trim().toUpperCase();
    
        testCipherCaesarCode(cipherCaesarCode(inputStr));
    }
    
    public static String cipherCaesarCode(String inStr) {
        String outputStr = "";
        
        for (Character c : inStr.toCharArray()) {
            outputStr += (char)(c + 3);
        }
        
        return outputStr;
    }
    
    public static void testCipherCaesarCode(String inStr) {
        System.out.println("The ciphertext string is: " + inStr.toUpperCase());
    }
    
}
