
package randomaccessfileexample2;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileExample2 {

    public static void main(String[] args) {
        try {
            // Writing to a random access file
            RandomAccessFile file = new RandomAccessFile("data.dat", "rw");
//dat files accompany other programs/applications. It contains binary text.
//Generally contains information about the program.
            
            // Writing to the file
            file.writeUTF("Hello, ");// Method for writing String
            file.writeInt(25);//Method for writing integers values
            file.writeInt(35);//Method for writing integers values
            file.writeDouble(123.45);//Method for writing decimal values

            // Moving the file pointer
            file.seek(0);

            // Reading from the file- The following are methods
            String str = file.readUTF();
            int num = file.readInt();
            double decimal = file.readDouble();
            
            //Display
            System.out.println("String: " + str);
            System.out.println("Int: " + num);
            System.out.println("Double: " + decimal);
       
            
              // Display the original string
            System.out.println("Original String: " + str);

            // Moving the file pointer to the position of the string and updating it
            file.seek(0);
            file.writeUTF("Hi, ");

            // Move back to the beginning and read the updated string
            file.seek(0);
            str = file.readUTF();
            System.out.println("Updated String: " + str);

            // Closing the file
            file.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

