
package booktitles;

import java.util.Arrays;
public class BookTitles {

    public static void insertionSort(String[] books) {
         int bookCount = books.length;
        for (int currentIndex = 1; currentIndex < bookCount; currentIndex++) 
        {
            String currentBook = books[currentIndex];
            
            int previousIndex = currentIndex - 1;

            while (previousIndex >= 0 && books[previousIndex].compareTo(currentBook) > 0) {
                books[previousIndex + 1] = books[previousIndex];
                previousIndex = previousIndex - 1;
        }
            
            books[previousIndex + 1] = currentBook;
        }
    }
        
    
 
    public static void main(String[] args) {
     String[] books = {"Harry Potter", "The Great Gatsby", "To Kill a mocking bird", "Pride and Prejudice", "Othello"};

        System.out.println("This the original layout of the array:");
        System.out.println(Arrays.toString(books));

        insertionSort(books);

        System.out.println("This is the array after being sorted array:");
        System.out.println(Arrays.toString(books));
    }
    
}
