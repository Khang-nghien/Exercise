/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phonekeypad;

import java.util.Scanner;

/**
 *
 * @author Vu Minh Khang - CE191371 -
 */
public class PhoneKeyPad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        String inputStr;

        System.out.print("Enter a String: ");
        inputStr = input.nextLine().trim().toLowerCase();
        
        testPhoneKeyPad(phoneKeyPad(inputStr));
    }
    
    public static String phoneKeyPad(String inStr) {
        String outputStr = "";
        
        for (Character c : inStr.toCharArray()) {
            
            switch (c) {
                
                case 'a':
                case 'b':
                case 'c':
                    outputStr += 2;
                    break;
                
                case 'd':
                case 'e':
                case 'f':
                    outputStr += 3;
                    break;
                
                case 'g':
                case 'h':
                case 'i':
                    outputStr += 4;
                    break;
                
                case 'j':
                case 'k':
                case 'l':
                    outputStr += 5;
                    break;
                
                case 'm':
                case 'n':
                case 'o':
                    outputStr += 6;
                    break;
                
                case 'p':
                case 'q':
                case 'r':
                case 's':
                    outputStr += 7;
                    break;
                
                case 't':
                case 'u':
                case 'v':
                    outputStr += 8;
                    break;
                
                default:
                    outputStr += 9;
                    break;
            }
        }
            
        return outputStr;
    }
    
    public static void testPhoneKeyPad(String outputStr) {
        System.out.println(outputStr);
    }
    
}
