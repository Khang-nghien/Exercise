/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bubblesort;

import java.util.Scanner;

/**
 *
 * @author Vu Minh Khang - CE191371 -
 */
public class BubbleSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int array[] = {1, 2};
        
        bubbleSort(array);
        
    }

    public static void bubbleSort(int[] array) {
        
        if (array.length == 0) {
            return;
        }
        
        if (array.length == 1) {
            System.out.println(array[0]);
            return;
        }

        int temp;

        for (int i = array.length - 1; i > 0; i--) {

            for (int j = 0; j < i; j++) {

                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        
        print(array);
    }
    
    public static void print(int[] array) {
        
        String output = "";
        
        for (int i = 0 ; i < array.length ; i++) {
            output += array[i] + ", ";
        }
        
        System.out.println(output.trim().substring(0, output.length() - 2));
    }

}
