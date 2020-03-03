package arraytasks;

import java.util.Arrays;

public class Task014_FindDuplicatesString {

    public static void main(String[] args) {
        
        String[] arr = {"a", "a", "b", "b", "c"};
        String word = "";
        Arrays.sort(arr);
        
        for (int i = 0; i < arr.length - 2; i++) {
            int count = 1;
            while (arr[i] == arr[i + 1]) {
                count++;
                word = arr[i];
                i++;
            }
            if (count > 1) {
                System.out.println("Duplicated word " + word + " appeared " + count + " times");
            }
        }
    }
}
