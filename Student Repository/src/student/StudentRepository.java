
package student;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository  {
        private List<Student> students;
        
            public StudentRepository() {
        this.students = new ArrayList<>();
    }

    public void save(Student student) {
        students.add(student);
    }

    public List<Student> getAllStudents() {
        return students;
    }

   public Student findStudentById(int studentID) {
        for (Student student : students) {
            if (student.getStudentID() == studentID) {
                return student; // Found the student with the given ID
            }
        }
        return null; // Student with the given ID not found
    }
}
