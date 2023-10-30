
package randomaccessfilewriteexample;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileWriteExample {

    public static void main(String[] args) {
        try {
            // Open the random access file in read and write mode
            RandomAccessFile file = new RandomAccessFile("randomfile.txt", "rw");

            // Set the position for writing data
            file.seek(0); // Writing at the beginning of the file

            // Writing data to the file
            String data = "Hello,This is my Random Access File!";
            file.writeBytes(data);
            
            
            file.seek(10);
     
            String data2 = "Hi Denzyl!";
            file.writeBytes(data2);
              
            // Close the file
            file.close();
            System.out.println("Data has been written to the random access file.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

