package arraytasks;

import java.util.Arrays;

public class Task017_SecondLargest {

    public static void main(String[] args) {
        
        int[] arr = {10, 2, 3, 4, 5, 6, 7, 8, 11, 12};
        Arrays.sort(arr);
        
        System.out.println("Second largest number is: " + arr[arr.length - 2]);
    }
}
