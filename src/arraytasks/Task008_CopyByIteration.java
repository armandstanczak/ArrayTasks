package arraytasks;

import java.util.Arrays;

public class Task008_CopyByIteration {

    public static void main(String[] args) {
        
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] arr2 = new int[arr1.length];
        
        for (int i = 0; i <= arr1.length - 1; i++) {
            arr2[i] = -arr1[i];
        }
        
        System.out.println("Original array: " + Arrays.toString(arr1));
        System.out.println("Copied array with negative numbers: " + Arrays.toString(arr2));
        
        arr2 = arr1;
        System.out.println("Copied array without chages: " + Arrays.toString(arr2));
    }
}
