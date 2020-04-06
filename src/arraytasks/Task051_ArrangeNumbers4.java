package arraytasks;

import java.util.Arrays;

public class Task051_ArrangeNumbers4 {

    public static void main(String[] args) {
        
        int[] a = {1, 0, 1, 0, 1, 0, 1};
        
        System.out.println("Original array: " + Arrays.toString(a));
        System.out.println("Sorted array: " + sortedArray(a));
    }
    
    public static String sortedArray(int[] a) {
        int[] b = new int[a.length];
        int min = 0, max = a.length - 1;
        
        for (int i = 0; i < a.length - 1; i++) { 
            if (a[i] == 0) {
                b[min++] = a[i];
            } else {
                b[max--] = a[i];
            }
        }
        return Arrays.toString(b);
    }
}
