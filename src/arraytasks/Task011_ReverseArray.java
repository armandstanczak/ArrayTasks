package arraytasks;

import java.util.Arrays;

public class Task011_ReverseArray {

    public static void main(String[] args) {
        
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] arr2 = new int[arr1.length];
        
        System.out.println("Original array: " + Arrays.toString(arr1));
       
        for (int i = arr2.length - 1; i >= 0; i--) {
            arr2[arr2.length - 1 - i] = arr1[i];
        }
        
        System.out.println("Reversed array: " + Arrays.toString(arr2));
    }
}
