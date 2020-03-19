package arraytasks;

import java.util.ArrayList;
import java.util.Arrays;

public class Task021_ArrayList2Array {

    public static void main(String[] args) {
        
        ArrayList<Integer> arrList = new ArrayList<>();
        arrList.add(6);
        arrList.add(7);
        
        System.out.println("As ArrayList: " + arrList);

        int[] arr = new int[arrList.size()];
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arrList.get(i) - 1;
        }
        
        System.out.println("As array, value lowered by 1: " + Arrays.toString(arr));
    }
}
