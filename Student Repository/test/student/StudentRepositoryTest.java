
package student;

import org.junit.Test;
//import static org.junit.Assert.*;
//import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;


public class StudentRepositoryTest {
 private StudentRepository studentRepository;

  

    @Test
    public void testSaveAndGetAllStudents() {
        // Create some test students
      Student student1 = new Student(1, "John Doe", 20, "john@example.com", "Computer Science");
  Student student2 = new Student(2, "Jane Smith", 22, "jane@example.com", "Engineering");
  
          studentRepository = new StudentRepository();
        // Save students
        
        studentRepository.save(student1);
        
        studentRepository.save(student2);

        // Retrieve all students
        List<Student> students = studentRepository.getAllStudents();

        // Check if the list contains the saved students
        assertEquals(2, students.size()); // Check that there are two students in the list

        assertEquals(student1, students.get(0)); // Check the first student

        assertEquals(student2, students.get(1)); // Check the second student
    }
 
     @Test
    public void testIsAgeValid_ValidAge() {
         studentRepository = new StudentRepository();
// Create a student with a valid age (<= 19)
        Student student = new Student(1, "John Doe", 16, "john@example.com", "Computer Science");
 
        // Check if the age is valid
        assertTrue(student.isAgeValid(), "Age should be valid for student <= 19");
        }
    
     @Test
    public void testIsAgeValid_InvalidAge() {
        // Create a student with an invalid age (< 19)
        Student student = new Student(2, "Jane Smith", 9, "jane@example.com", "Engineering");

        // Check if the age is valid
        assertFalse(student.isAgeValid(), "Age should be invalid for student > 19");
    }
    
     @Test
    public void testFindStudentById_StudentFound() {
       studentRepository = new StudentRepository();
        
// Create some test students
        Student student1 = new Student(1, "John Doe", 19, "john@example.com", "Computer Science");
        Student student2 = new Student(2, "Jane Smith", 18, "jane@example.com", "Engineering");

        // Save students
        studentRepository.save(student1);
        studentRepository.save(student2);

        // Search for a student by ID
        Student foundStudent = studentRepository.findStudentById(1);

        // Check if the student is found and has the correct ID
        assertNotNull(foundStudent, "Student should be found");
        assertEquals(1, foundStudent.getStudentID(), "Found student should have ID 1");
    }
}

