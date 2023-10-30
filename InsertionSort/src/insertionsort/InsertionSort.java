
package insertionsort;

import static insertionsort.InsertionSort.insertionSort;

public class InsertionSort {
    
 public static void insertionSort(int[] array) {//Method for Insertion
        int n = array.length;
        
        for (int i = 1; i < n; i++) {
            int key = array[i];
            int j = i - 1;
            
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            
            array[j + 1] = key;
        }
    }
    
    public static void main(String[] args) {
        int[] array = {5, 2, 8, 1, 3};
        
        System.out.println("The original array structure: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        
        insertionSort(array);
        
        System.out.println("\nSorted array structure: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}

  
    

