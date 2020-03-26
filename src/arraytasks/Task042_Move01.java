package arraytasks;

import java.util.Arrays;

public class Task042_Move01 {

    public static void main(String[] args) {
        
        int[] arr = {0, 1, 0, 1, 1, 0, 1, 1, 0, 0, 1};
        int temp;
        
        //Bubble sort
        for (int i = 0; i < arr.length - 1; i++) { 
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
