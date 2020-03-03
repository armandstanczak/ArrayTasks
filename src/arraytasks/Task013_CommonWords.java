package arraytasks;

import java.util.LinkedList;

public class Task013_CommonWords {

    public static void main(String[] args) {
        
        String[] arr1 = {"a", "b", "c", "e"};
        String[] arr2 = {"a", "d", "e", "e"};
        
        LinkedList list = new LinkedList();
        
        for (int i = 0; i <= arr1.length - 1; i++) { 
            for (int j = 0; j <= arr2.length - 1; j++) {
                if (arr1[i].equals(arr2[j])) {
                    list.add(arr1[i]);
                }
            }
        }
        System.out.println(list);
    }
}
