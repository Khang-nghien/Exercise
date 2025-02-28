/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primenumber;

import java.util.Scanner;

/**
 *
 * @author Vu Minh Khang - CE191371 -
 */
public class PrimeNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Please enter the upper bound: ");
        getNumber(Integer.parseInt(input.nextLine()));
        
    }
    
    public static void getNumber(int num) {
        
        int countPrime = 0;
        
        for (int i = 1 ; i <= num ; i++) {
            
            if (isPrime(i)) {
                System.out.println(i);
                countPrime++;
            }
        }
        
        System.out.printf("[%d primes numbers found (%.2f%%)]\n", countPrime, (countPrime / (double)num) * 100);
    }
    
    public static boolean isPrime(int aPostInt) {
        
        if (aPostInt == 1) {
            return true;
        }
        
        if (aPostInt == 2) {
            return true;
        }
        
        for (int i = 2 ; i < aPostInt ; i++) {
            
            if (aPostInt % i == 0) {
                return false;
            } 
        }
        
        return true;
    }
    
}
