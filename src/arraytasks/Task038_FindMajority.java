package arraytasks;

import java.util.Arrays;

public class Task038_FindMajority {

    public static void main(String[] args) {
        
        //int[] arr = {1, 1, 1, 1, 2, 3, 3, 3, 3, 3, 3, 3}; //3
        int[] arr = {1, 3}; //no elements
        
        int major = checkArr(arr);
        
        if (major != 0) {
            System.out.println("The majority element is: " + major + " in array " + Arrays.toString(arr));
        } else {
            System.out.println("There are no majority elements in " + Arrays.toString(arr));
        }
    }
    
    public static int checkArr(int[] a) {
        int len_major = a.length / 2;
        int counter;
        
        for (int i = 0; i < a.length; i++) {
            counter = 1;
            for (int j = 1; j < a.length; j++) {
                if (i != j && a[i] == a[j]) {
                    counter++;
                }
            }
            if (counter > len_major) {
                return a[i];
            }
        }
        return 0;
    }
}
