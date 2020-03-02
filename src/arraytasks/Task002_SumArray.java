package arraytasks;

import java.util.Arrays;

public class Task002_SumArray {

    public static void main(String[] args) {
        
        int[] arr = {1, 2, 3, 4, 5};
        int sum = 0;
        
        for (int i = 0; i <= arr.length - 1; i++) {
            sum += arr[i];
        }
        
        System.out.println("The sum of values of an array " + Arrays.toString(arr) + " is " + sum);
    }
}
