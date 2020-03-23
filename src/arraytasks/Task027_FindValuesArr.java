package arraytasks;

import java.util.Arrays;

public class Task027_FindValuesArr {

    public static void main(String[] args) {
        
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int odd = 0, even = 0;
        
        for(int i : arr) {
            if (i % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        
        System.out.println("In array " + Arrays.toString(arr) + " there are " + even + " even numbers and " + odd + " odd numbers");
    }
}
