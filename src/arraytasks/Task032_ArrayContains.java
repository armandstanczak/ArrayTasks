package arraytasks;

import java.util.Arrays;

public class Task032_ArrayContains {

    public static void main(String[] args) {
        
        int[] arr1 = {65, 77, 100};
        int[] arr2 = {1};
        
        System.out.println("First array: " + printArr(arr1) + " : " + checkArr(arr1));
        System.out.println("Second array: " + printArr(arr2) + " : " + checkArr(arr2));
    }
    
    public static String printArr(int[] a){ 
        return (Arrays.toString(a));
    }
    
    public static boolean checkArr(int[] a){
        int count65 = 0, count77 = 0;
        for (int i : a) {
            if (i == 65) {
                count65++;
            } else if (i == 77) {
                count77++;
            }
        }
        return count65 > 0 && count77 > 0;
    }
}
