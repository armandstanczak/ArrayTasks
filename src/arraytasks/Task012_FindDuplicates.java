package arraytasks;

import java.util.Arrays;

public class Task012_FindDuplicates {

    public static void main(String[] args) {
        
        int[] arr = {1, 1, 5, 2, 6, 3, 2, 1, 2, 8, 12, 1, 2, 3};
        int number = 0;
        Arrays.sort(arr);
        
        
        for (int i = 0; i < arr.length - 1; i++) {
            int count = 1;
            while (arr[i] == arr[i + 1]) {
                count++;
                number = arr[i];
                i++;
            }
            if (count > 1) {
                System.out.println("Duplicated number " + number + " appeared " + count + " times");
            }
        }
    }
}
