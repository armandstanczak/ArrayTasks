package arraytasks;

import java.util.Arrays;

public class Task031_SumOf10s {

    public static void main(String[] args) {
        
        int[] arr1 = {10, 10, 10, 1};
        int[] arr2 = {10, 10, 1, 0};
        
        System.out.println("First array: " + printArr(arr1) + " is " + checkArr(arr1));
        System.out.println("Second array: " + printArr(arr2) + " is " + checkArr(arr2));
    }
    
    public static String printArr(int[] a) {
        String ret = Arrays.toString(a);
        return ret;
    }
    
    public static boolean checkArr(int[] a) {
        int sum = 0;
        for (int i : a) {
            if (i == 10) {
                sum += 10;
            }
        }
        return sum == 30;
    }
}
