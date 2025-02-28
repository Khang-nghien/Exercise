/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursivebinarysearch;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Vu Minh Khang - CE191371 -
 */
public class RecursiveBinarySearch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner input = new Scanner(System.in);

        int array[] = {11, 14, 16, 18, 20, 25, 28, 30, 30, 34, 40, 45};
        RecursiveBinarySearch user = new RecursiveBinarySearch();
        
        boolean result = user.binarySearch(array, 16, 0, array.length);
        
        if (result) {
            System.out.println("Found");
        } else {
            System.out.println("Not found");
        }

    }

    public boolean binarySearch(int[] array, int key, int fromIdx, int toIdx) {
        
        if (array.length == 0) {
            return false;
        }
        
        if (array.length == 1 && array[0] == key) {
            return true;
        }
        
        int middleIdx = (int) ((fromIdx + toIdx) / 2);

        if (key == array[middleIdx]) {
            return true;
        } else if (key < array[middleIdx]) {
            toIdx = middleIdx;
            return binarySearch(array, key, fromIdx, toIdx);
        } else {
            fromIdx = middleIdx;
            return binarySearch(array, key, fromIdx, toIdx);
        }

    }

}
