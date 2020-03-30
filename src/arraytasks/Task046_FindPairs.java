package arraytasks;

import java.util.Arrays;
import java.util.Scanner;

public class Task046_FindPairs {

    public static void main(String[] args) {
        
        int counter = 0;
        int[] arr = {2, 4, 6, 8, 1, 3, 5, 7, 9};
        System.out.println(Arrays.toString(arr));
        
        Scanner input = new Scanner(System.in);
        System.out.print("Input a sum you want to find: ");
        int sum = input.nextInt();
        
        Arrays.sort(arr);
        
        int temp = arr[arr.length - 1];
        
        for (int i = arr.length - 2; i >= 0; i--) {
            arr[i + 1] = arr[i]; 
        }
        arr[0] = temp;
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] + arr[j] == sum) {
                    counter++;
                }
            }
        }
        if (counter == 0) {
            System.out.println("There are no pairs with specified sum");
        } else {
            System.out.println("There is a pair with specified sum");
        }
    }
}
