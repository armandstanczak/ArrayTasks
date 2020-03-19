package arraytasks;

import java.util.ArrayList;
import java.util.Arrays;

public class Task025_CommonElements {

    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<>();
        int x = 0, y = 0, z = 0;
        int[] a = {1, 3, 5, 7, 8};
        int[] b = {2, 4, 6, 7, 8, 11};
        int[] c = {7, 8, 9, 10, 13, 14, 0};
        
        Arrays.sort(a);
        Arrays.sort(b);
        Arrays.sort(c);
        
        while (x < a.length && y < b.length && z < c.length) {
            if (a[x] == b[y] && b[y] == c[z]) {
                list.add(a[x]);
                x++;
                y++;
                z++;
            } else if (a[x] < b[y]) {
                x++;
            } else if (b[y] < c[z]) {
                y++;
            } else {
                z++;
            }
        }
        System.out.println("Common numbers are: " + list);
    }
}
