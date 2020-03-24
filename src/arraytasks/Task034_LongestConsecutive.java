package arraytasks;

import java.util.ArrayList;
import java.util.Arrays;

public class Task034_LongestConsecutive {

    public static void main(String[] args) {
        
        int[] a = {9, 8, 7, 66, 5, 4, 3, 2, 11, 10, 0, 1, -1};
        int longest = 1;
        ArrayList<Integer> list_temp = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        
        System.out.println("Original array: " + Arrays.toString(a));
        Arrays.sort(a);
        
        for (int i = 0; i < a.length - 1; i++) {
            int longest_temp = 1;
            list_temp.clear();
            for (int j = i; j < a.length - 1; j++) {
                
                if (a[j] + 1 == a[j + 1]) {
                    longest_temp++;
                    list_temp.add(a[j]);
                }
            }
            if (longest_temp > longest) {
                longest = longest_temp;
                list.clear();
                for (int x : list_temp) {
                    list.add(x);
                }
                
            }
        }
        System.out.println("The longest increasing by 1 sequence is " + longest + ". The sequence is: "+ list);
    }
}
