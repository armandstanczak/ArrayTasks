package arraytasks;

import java.util.ArrayList;
import java.util.Arrays;

public class Task039_PrintLeaders {

    public static void main(String[] args) {
        
        int[] arr = {1, 2, 3, 4, 5, 4, 3, 2, 1, -9}; //9
        int counter;
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < arr.length; i++) {
            counter = 0;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    counter++;
                }
            }
            if (counter == (arr.length - i - 1)) {
                list.add(arr[i]);
            }
        }
        System.out.println("The leaders in array " + Arrays.toString(arr) + " are: " + list);
    }
}

