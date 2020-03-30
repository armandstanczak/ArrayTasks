package arraytasks;

import java.util.Arrays;

public class Task047_BubbleSort {

    public static void main(String[] args) {
        
         int[] a = {3, 4, 6, 9, 1, 0, 12, 10};
         System.out.println("Unsorted array: " + Arrays.toString(a));
         
         for (int i = 0; i < a.length - 1; i++) {
             for (int j = 0; j < a.length - i - 1; j++) {
                 if (a[j] > a[j + 1]) {
                     int temp = a[j];
                     a[j] = a[j + 1];
                     a[j + 1] = temp;
                 }
             }
         }
         System.out.println("Sorted array: " + Arrays.toString(a));
    }
}
