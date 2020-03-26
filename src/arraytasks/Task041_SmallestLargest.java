package arraytasks;

import java.util.Arrays;

public class Task041_SmallestLargest {

    public static void main(String[] args) {
        
        int[] a = {1, 3, 5, 7};
        int max = a[0];
        int min = a[0];
        
        for (int i = 1; i < a.length; i++) { 
            if (a[i] < min) {
                min = a[i];
            } else if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println("Array: " + Arrays.toString(a) + "\nMinimal value: " + min + "\nMaximal value: " + max);
    }
    
}
