
package randomaccessfileexample2datfile;


import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class RandomAccessFileExample2DatFile {

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
            byte[] intBytes1 = new byte[4];
            file.read(intBytes1);
            ByteBuffer buffer1 = ByteBuffer.wrap(intBytes1);
            buffer1.order(ByteOrder.LITTLE_ENDIAN);
            int num1 = buffer1.getInt();
            System.out.println("First Int: " + num1);

            // Reading the second integer value
            byte[] intBytes2 = new byte[4];
            file.read(intBytes2);
            ByteBuffer buffer2 = ByteBuffer.wrap(intBytes2);
            buffer2.order(ByteOrder.LITTLE_ENDIAN);
            int num2 = buffer2.getInt();
            System.out.println("Second Int: " + num2);

            // Move to the position of the decimal value
         //   file.readDouble(); // Skipping the double value

            // Closing the file
            file.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

