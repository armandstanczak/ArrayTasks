package arraytasks;

import java.util.Arrays;

public class Task048_ArrangeNumbers {

    public static void main(String[] args) {
        
        int[] a = {1, 2, 3, 4, -1, 0, -5};
        System.out.println("Unsorted array: " + printArray(a));
        System.out.println("Negatives moved to left side: " + sortArray(a));
    }
    
    public static String printArray(int[] a) { 
        return Arrays.toString(a);
    }
    
    public static String sortArray(int[] a) {
        int i = 0, j = 0;
        while (i < a.length) {
            if (a[i] < 0) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                j++;
            }
            i++;
        }
        return printArray(a);
    }
}
