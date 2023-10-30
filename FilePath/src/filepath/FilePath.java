
package filepath;

import java.io.*;
import java.nio.file.*;

public class FilePath {
    public static void main(String[] args) {
        // Define the directory and file name
        String directory = "C:/Users/dengovender/OneDrive - ADvTECH Ltd/Desktop/VC WORK 2023";
        String fileName = "Example.txt";

        // Create a Path object using Paths.get()
        Path filePath = Paths.get(directory, fileName);

        // Convert the Path to a String for file operations
        String filePathString = filePath.toString();

       // Read from the file
        try {
            FileReader fileReader = new FileReader(filePathString);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            System.out.println("Reading from the file:");
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            bufferedReader.close();
        } catch (IOException e) {
            System.err.println("Error reading from the file: " + e.getMessage());
        }
           
       
        
    }
}

