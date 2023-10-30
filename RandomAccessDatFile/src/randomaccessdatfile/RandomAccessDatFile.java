
package randomaccessdatfile;

import java.io.IOException;
import java.io.RandomAccessFile;
public class RandomAccessDatFile {

    public static void main(String[] args) {
    try {
        // Writing to a random access file
        RandomAccessFile file = new RandomAccessFile("data.dat", "rw");

        // Writing to the file
        file.writeUTF("Hello, ");
        file.writeInt(25);
        file.writeInt(35);
        file.writeDouble(123.45);

        // Moving the file pointer
        file.seek("Hello, ".getBytes().length); // Move past the string

        // Reading the first integer value
        int num1 = file.readInt();
        System.out.println("First Int: " + num1);

        // Reading the second integer value
        int num2 = file.readInt();
        System.out.println("Second Int: " + num2);

        // Move to the position of the decimal value
        file.readDouble(); // Skipping the double value

        // Closing the file
        file.close();

    } catch (IOException e) {
        e.printStackTrace();
    }
}

    
}
