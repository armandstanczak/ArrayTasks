package arraytasks;

import java.util.Arrays;

public class Task028_MinMaxArray {

    public static void main(String[] args) {
        
        int[] arr = {1, 1, 2, 3, 4, 10, 0, 10};
        int min = arr[0];
        int max = arr[0];
        
        for (int i : arr) {
            if (i < min) {
                min = i;
            } else if (i > max) {
                max = i;
            }
        }
        
        System.out.println("Array: " + Arrays.toString(arr) + "\nMinimal value is: " + min + "\nMaximal is: " + max);
    }
}
