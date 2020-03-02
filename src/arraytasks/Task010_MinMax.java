package arraytasks;

import java.util.Arrays;

public class Task010_MinMax {

    public static void main(String[] args) {
        
        int[] arr = {1, -1, 2, -2, 3, -3, 4, -4};
        int min = arr[0];
        int max = arr[0];
        
        for (int i = 1; i <= arr.length - 1; i++) {
            if (arr[i] > max) {
                max = arr[i];
            } else if (arr[i] < min) {
                min = arr[i];
            }
        }
        
        System.out.println("Array: " + Arrays.toString(arr) + " with minimal value of " + min + " and maximum value of " + max);
    }
}
