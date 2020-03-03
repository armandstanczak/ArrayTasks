package arraytasks;

import java.util.Arrays;
import java.util.LinkedList;

public class Task015_FindDuplicatesInt {

    public static void main(String[] args) {
        
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 7};
        int[] arr2 = {2, 2, 4, 6, 7};
        LinkedList duplicates = new LinkedList();
        
        for (int i = 0; i <= arr1.length - 1; i++) {
            for (int j = 0; j <= arr2.length - 1; j++) {
                if (arr1[i] == arr2[j]) {
                    if (duplicates.contains(arr1[i]) != true) {
                        duplicates.add(arr1[i]);
                    }
                }
            }
        }
        System.out.println("Two arrays have the same values of: " + duplicates);
    }
}
