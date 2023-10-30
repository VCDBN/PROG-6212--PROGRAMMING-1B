
package student;

import java.util.List;

public class MainApplication {
     public static void main(String[] args) {
        StudentRepository studentRepository = new StudentRepository();
        
        // Create some students and save them
        Student student1 = new Student(1, "John Doe", 20, "john@example.com", "Computer Science");
        Student student2 = new Student(2, "Jane Smith", 22, "jane@example.com", "Engineering");
        
        studentRepository.save(student1);
        studentRepository.save(student2);
        
        // Retrieve and print all students
        List<Student> students = studentRepository.getAllStudents();
        for (Student student : students) {
            System.out.println(student);
        }
    }
}





