package arraytasks;

import java.util.Arrays;
import java.util.LinkedList;

public class Task016_RemoveDuplicatesOneArray {

    public static void main(String[] args) {
          
        int[] arr = {1, 11, 2, 3, 4, 5, 6, 7, 11, 8, 1, 2, 3, 4, 5, 6, 1};
        System.out.println("Original array is: " + Arrays.toString(arr));
        
        LinkedList list = new LinkedList();
        list.add(arr[0]);
        
        for (int i = 1; i <= arr.length - 2; i++) {
            if (list.contains(arr[i]) != true) {
                list.add(arr[i]);
            }
        }
        
        System.out.println("Array with duplicates removed: " + list);
    }
}
