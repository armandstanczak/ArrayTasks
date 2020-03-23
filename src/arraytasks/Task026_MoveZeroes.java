package arraytasks;

import java.util.ArrayList;
import java.util.Arrays;

public class Task026_MoveZeroes {

    public static void main(String[] args) {
        
        int[] arr = {1, 2, 3, 0 ,4 ,5, 0, 6, 7, 8, 0};
        int count_zeroes = 0;
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                count_zeroes++;
                continue;
            }
            list.add(arr[i]);
        }
        
        while (count_zeroes > 0) {
            list.add(0);
            count_zeroes--;
        }
        System.out.println("Original array: " + Arrays.toString(arr));
        System.out.println("New list looks like this: " + list);
        
    }
}
