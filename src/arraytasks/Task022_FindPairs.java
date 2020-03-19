package arraytasks;

import java.util.ArrayList;
import java.util.Scanner;

public class Task022_FindPairs {

    public static void main(String[] args) {
        
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 1, 3, 2, 4, 5, 1, 2, 1, 3, 0, -1};
        ArrayList<Integer> list = new ArrayList<>();

        Scanner input = new Scanner(System.in);
        System.out.print("Input a sum value you want to find: ");
        int sum = input.nextInt();
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if  (sum == arr[i] + arr[j]) {
                    System.out.println("Pair of numbers is: " + arr[i] + " from position " + (i + 1) + ", and " + arr[j] + " from position " + (j + 1));
                    list.add(arr[i]);
                    list.add(arr[j]);
                }
            }
        }
        System.out.println(list);
    }
}
