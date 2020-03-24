package arraytasks;

import java.util.ArrayList;
import java.util.Scanner;

public class Task036_FindSum2 {

    public static void main(String[] args) {
        
        int[] a = {1, -2, 0, 5, -1, -4, -4, 1, 1};
        ArrayList<Integer> list = new ArrayList<>();
        
        Scanner input = new Scanner(System.in);
        System.out.print("Input target value: ");
        int number = input.nextInt();
        
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                for (int k = j + 1; k < a.length; k++) {
                    if (a[i] + a[j] + a[k] == number && a[i] != a[j] && a[j] != a[k]) {
                        list.add(a[i]);
                        list.add(a[j]);
                        list.add(a[k]);
                        System.out.println("Found a set of numbers equal to " + number + " that are: " + list);
                        list.clear();
                    }
                }
            }
        }
    }
    
}
