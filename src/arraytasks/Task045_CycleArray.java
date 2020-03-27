package arraytasks;

import java.util.Arrays;

public class Task045_CycleArray {

    public static void main(String[] args) {
        
        int[] a = {1, 2, 3, 4};
        System.out.println("Original array: " + Arrays.toString(a));
        System.out.println("Rotated array:" + Arrays.toString(rotateArr(a)));
    }
    
    public static int[] rotateArr(int[] a) {
        int temp = a[a.length - 1];
        for (int i = a.length - 2; i >= 0; i--) {
            a[i + 1] = a[i];
        }
        a[0] = temp;
        return a;
    }
}
