/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gradestatistics;

import java.util.Scanner;

/**
 *
 * @author Vu Minh Khang - CE191371 -
 */
public class GradeStatistics {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        simpleGradeStatistic(generateStudentGrades(input));
    }
    
    public static int[] generateStudentGrades(Scanner in) {
        int numStudents = Integer.parseInt(in.nextLine().trim());
        
        int[] studentGradeArr = new int[numStudents];
        
        for (int i = 0 ; i < numStudents ; i++) {
            System.out.print("Enter the grade for student " + (i + 1) + ": ");
            studentGradeArr[i] = Integer.parseInt(in.nextLine().trim());
        }
        
        return studentGradeArr;
    }
    
    public static void simpleGradeStatistic(int[] studentGrades) {
        
        int sum = 0;
        int min = studentGrades[0];
        int max = studentGrades[0];
        
        for (int i = 0 ; i < studentGrades.length ; i++) {
            sum += studentGrades[i];
            
            if (studentGrades[i] < min) {
                min = studentGrades[i];
            }
            
            if (studentGrades[i] > max) {
                max = studentGrades[i];
            }
        }
        
        System.out.printf("The average is: %.2f\nThe minimum is: %d\nThe maximum is: %d\n", sum * 1.0 / studentGrades.length, min, max);
    }
    
}
