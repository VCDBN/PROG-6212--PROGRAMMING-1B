
package sequentialdatafileexample;


import java.io.*;

public class SequentialDataFileExample {
    public static void main(String[] args) {
        // Writing data to a sequential file
        try (DataOutputStream out = new DataOutputStream(new FileOutputStream("data.bin"))) {
            out.writeInt(100);
            out.writeDouble(3.14159);
            out.writeUTF("Hello, World!");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Reading data from a sequential file
        try (DataInputStream in = new DataInputStream(new FileInputStream("data.bin"))) {
            int intValue = in.readInt();
            double doubleValue = in.readDouble();
            String stringValue = in.readUTF();

            System.out.println("Read int: " + intValue);
            System.out.println("Read double: " + doubleValue);
            System.out.println("Read string: " + stringValue);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

