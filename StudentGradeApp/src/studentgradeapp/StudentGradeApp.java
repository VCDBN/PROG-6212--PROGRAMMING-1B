
package studentgradeapp;


import java.util.Scanner;

class GradeException extends Exception {
    public static final char[] VALID_GRADES = {'A', 'B', 'C', 'D', 'F', 'I'};

    public GradeException(String message) {
        super(message);
    }
}

public class StudentGradeApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfStudents = 8;
        String[] studentIDs = {"123", "456", "789", "101", "202", "303", "404", "505"};
        char[] studentGrades = new char[numberOfStudents];

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print("Enter a test letter grade for student " + studentIDs[i] + ": ");
            char grade = scanner.next().toUpperCase().charAt(0);

            try {
                validateGrade(grade);
                studentGrades[i] = grade;
            } catch (GradeException e) {
                System.out.println("Invalid grade entered for student " + studentIDs[i] + ". Setting grade to 'I'.");
                studentGrades[i] = 'I';
            }
        }

        System.out.println("\nStudent Grades:");
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Student ID: " + studentIDs[i] + ", Grade: " + studentGrades[i]);
        }

        scanner.close();
    }

    public static void validateGrade(char grade) throws GradeException {
        for (char validGrade : GradeException.VALID_GRADES) {
            if (grade == validGrade) {
                return; // Valid grade, no exception thrown
            }
        }
        throw new GradeException("Invalid grade");
    }
}

