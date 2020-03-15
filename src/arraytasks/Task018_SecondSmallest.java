package arraytasks;

import java.util.Arrays;

public class Task018_SecondSmallest {

    public static void main(String[] args) {
        
        int[] arr = {10, 2, 3, 4, 5, 6, 7, 8, 11, 12};
        Arrays.sort(arr);
        
        System.out.println("Second smallest number is: " + arr[1]);
    }
}
