package arraytasks;

import java.util.Arrays;

public class Task030_CheckArray {

    public static void main(String[] args) {
        
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7};
        int[] arr2 = {0, 1, 2, 3, 4, 5, 6, 7};
        int[] arr3 = {-1, 1, 2, 3, 4, 5, 6, 7};
        
        System.out.println("Checking is array has 0 or -1\nFirst array: " + Arrays.toString(arr1) + check(arr1) + "\nSecond array: " + Arrays.toString(arr2) + check(arr2) + "\nThird array: " + Arrays.toString(arr3) + check(arr3));
    }
    
    public static String check(int[] a) {
        for (int i : a) {
            if (i == 0) {
                return " has 0";
            } else if (i == -1) {
                return " has -1";
            }
        }
        return " doesn't have 0's or -1's";
    }
}
