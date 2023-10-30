
package studentgrade;


import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] validGrades = {'A', 'B', 'C', 'D', 'F', 'I'};
        int numberOfStudents = 8;
        
        int[] studentIDs = {101, 102, 103, 104, 105, 106, 107, 108};
       
        char[] studentGrades = new char[numberOfStudents];
        
        // Input grades for each student
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print("Enter test letter grade for student " + studentIDs[i] + ": ");
            char grade = scanner.next().toUpperCase().charAt(0);
            
            // Check if the entered grade is valid
            boolean isValidGrade = false;
            for (char validGrade : validGrades) {
                if (grade == validGrade) {
                    isValidGrade = true;
                    break;
                }
            }
            
            // If not valid, set the grade to 'I'
            if (!isValidGrade) {
                System.out.println("Invalid grade. Setting grade to 'I' (Incomplete) for student " + studentIDs[i]);
                grade = 'I';
            }
            
            studentGrades[i] = grade;
        }
        
        // Display student IDs and their corresponding grades
        System.out.println("\nStudent ID\tGrade");
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println(studentIDs[i] + "\t\t" + studentGrades[i]);
        }
        
        scanner.close();
    }
}

