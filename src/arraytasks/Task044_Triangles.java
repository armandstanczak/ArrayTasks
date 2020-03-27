package arraytasks;

import java.util.Arrays;

public class Task044_Triangles {

    public static void main(String[] args) {
        
        int[] a = {6, 7, 9, 16, 25, 12, 30, 40};
        int count = 0;
        Arrays.sort(a);
        
        for (int i = 0; i < a.length - 2; i++) {
            int k = i + 2;
            for (int j = i + 1; j < a.length; j++) {
                while ( k < a.length && a[i] + a[j] > a[k]) {
                    k++;
                }
                if (k > j) {
                    count += k - j - 1;
                }
            }
        }
        System.out.println("Number of triangles: " + count);
    }
}