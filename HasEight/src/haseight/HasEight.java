/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package haseight;

import java.util.Scanner;

/**
 *
 * @author Vu Minh Khang - CE191371 -
 */
public class HasEight {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner input = new Scanner(System.in);
        
        System.out.println("The magic sum is: " + testMagicSum(input));
        
    }

    public static boolean hasEight(int number) {
        return String.valueOf(number).contains("8");
    }
    
    public static int testMagicSum(Scanner in) {
        
        String num;
        int sum = 0;
        
        do {
            
            System.out.print("Enter a positive integer (or -1 to end): ");
            num = in.nextLine().trim();
            
            if (hasEight(Integer.parseInt(num))) {
                sum += Integer.parseInt(num);
            }
            
        } while (!num.equals("-1"));
        
        return sum;
    }

}
