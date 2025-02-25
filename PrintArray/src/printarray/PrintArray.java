/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package printarray;

import java.util.Scanner;

/**
 *
 * @author Vu Minh Khang - CE191371 -
 */
public class PrintArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of items: ");
        printArray(creatArray(input));
        
    }
    
    public static int[] creatArray(Scanner in) {
        
        final int NUM_ITEMS = Integer.parseInt(in.nextLine().trim());
        
        int[] arr = new int[NUM_ITEMS];
        
        System.out.print("Enter the value of all items (separated by space): ");
        
        for (int i = 0 ; i < NUM_ITEMS ; i++) {
            arr[i] = in.nextInt();
        }
        
        return arr;
    }
    
    public static void printArray(int[] arr) {
        
        String output = "";
        
        for (int i = 0 ; i < arr.length ; i++) {
            
            output += ", " + arr[i];
                    
        }
        
        System.out.println("The values are: [" + output.substring(2, output.length()) + "]");
        
        
    }
    
}
