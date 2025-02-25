/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkhexstring;

import java.util.Scanner;

/**
 *
 * @author Vu Minh Khang - CE191371 -
 */
public class CheckHexString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        String inputStr;

        System.out.print("Enter a String: ");
        inputStr = input.nextLine().trim().toUpperCase();
    
        testHexString(isHexString(inputStr), inputStr);  
    }
    
    public static boolean isHexString(String hexStr) {
        return hexStr.matches("[A-F0-9]+");
    }
    
    public static void testHexString(boolean check, String inStr) {
        if (check) {
            System.out.printf("\"%s\" is a hex string\n", inStr);
        } else {
            System.out.printf("\"%s\" is NOT a hex string\n", inStr);
        }
    }
    
}
