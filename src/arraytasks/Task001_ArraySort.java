package arraytasks;

import java.util.Arrays;

public class Task001_ArraySort {

    public static void main(String[] args) {

        int[] arrInt = {1, 3, 5, 7, 9, 11, 2, 4, 6, 8, 10};
        String[] arrString = {"a", "c", "e", "g", "b", "d", "f"};
        
        System.out.println("Original int array is: " + Arrays.toString(arrInt));
        System.out.println("Original String array is: " + Arrays.toString(arrString));
        
        Arrays.sort(arrInt);
        Arrays.sort(arrString);
        
        System.out.println("Sorted int array is: " + Arrays.toString(arrInt));
        System.out.println("Sorted String array is: " + Arrays.toString(arrString));
    }
}
