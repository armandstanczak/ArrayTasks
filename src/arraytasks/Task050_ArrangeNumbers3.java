package arraytasks;

import java.util.Arrays;

public class Task050_ArrangeNumbers3 {

    public static void main(String[] args) {
        
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        
        System.out.println("Original array: " + Arrays.toString(a));
        System.out.println("Sorted array: " + sortedArray(a));
    }
    
    public static String sortedArray(int[] a) {
        int[] b = new int[a.length];
        Arrays.sort(a);
        boolean count = true;
        int small = 0, large = a.length - 1;

        for (int i = 0; i < a.length; i++) {
            if (count) {
                b[i] = a[large--];
            } else {
                b[i] = a[small++];
            }
            count = !count;
        }
        return Arrays.toString(b);
    }
}
