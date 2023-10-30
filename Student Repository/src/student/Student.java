
package student;


public class Student {
 private int studentID;
    private String name;
    private int age;
    private String email;
    private String course;
 
    public Student(int studentID, String name, int age, String email, String course) {
        this.studentID = studentID;
        this.name = name;
        this.age = age;
        this.email = email;
        this.course = course;
    }

 
    // Getter methods
    public int getStudentID() {
        return studentID;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getCourse() {
        return course;
    }

    // Setter methods
    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCourse(String course) {
        this.course = course;
    }

     public boolean isAgeValid() {
        return age <= 19;
    }
    
      @Override
    public String toString() {
        return "Student{" +
                "studentID=" + studentID +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", course='" + course + '\'' +
                '}';
    }
    
}
