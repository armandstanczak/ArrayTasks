package arraytasks;

import java.util.Arrays;

public class Task052_ArrangeNumbers5 {

    public static void main(String[] args) {
        
        int[] a = {1, 2, 3, 4, 5, 6, 7};
        int min = 0, max = a.length - 1;
        
        System.out.println("Original array: " + Arrays.toString(a));
        
        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            if(a[i] % 2 == 0) {
                b[min++] = a[i];
            } else {
                b[max--] = a[i];
            }
        }
        
        System.out.println("Sorted array: " + Arrays.toString(b));
    }
}
