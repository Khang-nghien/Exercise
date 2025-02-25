/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reversestring;

import java.util.Scanner;

/**
 *
 * @author Vu Minh Khang - CE191371 -
 */
public class ReverseString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String inputStr;

        System.out.print("Enter a String: ");
        inputStr = input.nextLine().trim();

        testReverseString(inputStr, reverseString(inputStr));

    }

    public static String reverseString(String inStr) {
        String outputStr = "";

        for (int i = inStr.length() - 1; i >= 0; i--) {
            outputStr += inStr.charAt(i);
        }

        return outputStr;
    }
    
    public static void testReverseString(String inputStr, String outputStr) {
        System.out.println("The reverse of the String " + "\"" + inputStr + "\"" + " is " + "\"" + reverseString(inputStr) + "\".");
    }

}
