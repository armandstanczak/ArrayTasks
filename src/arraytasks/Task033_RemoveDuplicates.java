package arraytasks;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Task033_RemoveDuplicates {

    public static void main(String[] args) {
        
        int[] a = {20, 20, 30, 40, 50, 50, 50};
        
        System.out.println("Original array: " + Arrays.toString(a) + " is of length " + a.length);
        
        Set<Integer> hash = new HashSet<>();
        
        for (int i : a) {
            hash.add(i);
        }
        
        System.out.println("New array without duplicates: " + hash + " is of length " + hash.size());
    }
}
