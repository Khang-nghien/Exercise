/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selectionsort;

/**
 *
 * @author Vu Minh Khang - CE191371 -
 */
public class SelectionSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int array[] = {9, 6, 4, 1, 5};
        
        selectionSort(array);
        
    }
    
    public static void selectionSort(int[] array) {
        
        if (array.length == 0) {
            return;
        }
        
        if (array.length == 1) {
            System.out.println(array[0]);
            return;
        }
        
        int max, temp;
        
        for (int i = 0 ; i < array.length; i++) {
            
            max = i;
            
            for (int j = i + 1 ; j < array.length ; j++) {
                
                if (array[j] < array[max]) {
                    max = j;
                }
                
            }
            
            temp = array[i];
            array[i] = array[max];
            array[max] = temp;
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
