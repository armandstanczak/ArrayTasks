package arraytasks;

import java.util.Arrays;

public class Task023_CompareArrays {

    public static void main(String[] args) {
        
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 3, 4, 6};
        
        System.out.println("First arrays is: " + Arrays.toString(arr1));
        System.out.println("Second arrays is: " + Arrays.toString(arr2));
        System.out.println("The arrays are " + compare(arr1, arr2));
    }
    
    public static String compare(int[] a, int[] b) {
        
        if (a.length != b.length) {
            return "not equal";
        }
        
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return "not equal";
            }
        }
        
        return "equal";
    }
}
