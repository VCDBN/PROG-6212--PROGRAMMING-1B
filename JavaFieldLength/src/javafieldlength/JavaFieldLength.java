
package javafieldlength;

import java.util.Arrays;
public class JavaFieldLength {

    public static void main(String[] args) {
             
        // Creating a 2D array with 3 rows and 4 columns
        int[][] twoDArray = {
            {1, 2, 3, 4},
            {5, 8, 7, 6},
            {9, 12, 11, 10}
        };

        // Get the number of rows in the 2D array
        int numRows = twoDArray.length;

        System.out.println("Number of rows: " + numRows);

        // Get the number of columns in the first row (all rows must have the same length)
        int numColumns = twoDArray[0].length;

        System.out.println("Number of columns: " + numColumns);

        // Accessing elements of the 2D array
        int element = twoDArray[1][2];
        System.out.println("Element at row 1, column 2: " + element);
        
        // How can you search an array for an element?
        int key = 12;
        int index = Arrays.binarySearch(twoDArray[2], key);

        if (index >= 0) {
            System.out.println("Element found at index " + index);
        } else {
            System.out.println("Element not found");
        }
        
        //How can we sort an array?
        for (int i =0;i < numRows;i++)
        {
                Arrays.sort(twoDArray[i]);
        }
        //You use deepToString for two dimensional arrays- 
        System.out.println("Sorted array: " + Arrays.deepToString(twoDArray));
    }
}
     
        

