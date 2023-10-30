package studentrandomaccessfileexample;

import java.io.IOException;
import java.io.RandomAccessFile;

public class StudentRandomAccessFileExample {

    public static class Student {
        private String name;
        private int age;
        private double gpa;

        public Student(String name, int age, double gpa) {
            this.name = name;
            this.age = age;
            this.gpa = gpa;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public double getGpa() {
            return gpa;
        }
    }

    public static void writeStudentRecord(String fileName, int recordNumber, Student student) {
        try {
            RandomAccessFile file = new RandomAccessFile(fileName, "rw");
            long position = recordNumber * 100; // Each record size is 100 bytes

            file.seek(position);

            // Writing the student record
            file.writeUTF(String.format("%-20s", student.getName()));
            file.writeInt(student.getAge());
            file.writeDouble(student.getGpa());

            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Student readStudentRecord(String fileName, int recordNumber) {
        try {
            RandomAccessFile file = new RandomAccessFile(fileName, "r");
            long position = recordNumber * 100; // Each record size is 100 bytes

            file.seek(position);

            // Reading the student record
            String name = file.readUTF().trim();
            int age = file.readInt();
            double gpa = file.readDouble();

            file.close();

            return new Student(name, age, gpa);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static void main(String[] args) {
        String fileName = "students.dat";

        // Writing a student record
        Student student1 = new Student("John Doe", 20, 3.5);
        writeStudentRecord(fileName, 0, student1);

        // Reading a student record
        Student readStudent = readStudentRecord(fileName, 0);
        if (readStudent != null) {
            System.out.println("Name: " + readStudent.getName());
            System.out.println("Age: " + readStudent.getAge());
            System.out.println("GPA: " + readStudent.getGpa());
        }
    }
}
