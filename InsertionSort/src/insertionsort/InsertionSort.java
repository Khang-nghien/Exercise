/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insertionsort;

/**
 *
 * @author Vu Minh Khang - CE191371 -
 */
public class InsertionSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int array[] = {9, 6, 4, 1, 5, 2, 7};
        
        
        insertionSort(array);
    }
    
    public static void insertionSort(int[] array) {
        
        if (array.length == 0) {
            return;
        }
        
        if (array.length == 1) {
            System.out.println(array[0]);
            return;
        }
        
        int temp, j;
        
        for (int i = 1 ; i < array.length ; i++) {
            
            temp = array[i];
            j = i - 1;

            while (j >= 0 && array[j] > temp) {
                array[j + 1] = array[j];
                j--;
            }

            array[j + 1] = temp;
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
