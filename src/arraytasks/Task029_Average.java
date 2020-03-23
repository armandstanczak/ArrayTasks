package arraytasks;

import java.util.Arrays;

public class Task029_Average {

    public static void main(String[] args) {
        
        int[] arr = {5, 7, 2, 4, 9};
        int[] arr_temp = Arrays.copyOf(arr, arr.length);
        
        Arrays.sort(arr_temp);
        
        double sum = 0;
        int counter = 0;
        double average;
        
        for (int i = 1; i < arr_temp.length - 1; i++) {
            sum += arr_temp[i];
            counter++;
        }
        
        average = sum / counter;
        
        System.out.println("Array: " + Arrays.toString(arr) + "\nAverage is " + average + " when min and max values are removed");
    }
}
