package arraytasks;

import java.util.ArrayList;

public class Task020_Array2ArrayList {

    public static void main(String[] args) {
        
        int[] arr = {1, 2, 3, 4};
        ArrayList<Integer> arrayList = new ArrayList<Integer>(arr.length);
        for (int i : arr) arrayList.add(i);
        
        System.out.println(arrayList);
    }
}
