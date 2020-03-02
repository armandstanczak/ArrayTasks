package arraytasks;

import java.util.Arrays;
import java.util.Scanner;

public class Task007_RemoveElement {

    public static void main(String[] args) {
        
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Original array is: " + Arrays.toString(arr));
        
        Scanner input = new Scanner(System.in);
        System.out.print("Number on which position would you want to remove: ");
        int index = input.nextInt();
        
        while (index <0 || index > arr.length) {
            System.out.print("This position does not exist, input another: ");
            index = input.nextInt();
        }
        
        for (int i = index - 1; i <= arr.length - 2; i++) {
            arr[i] = arr[i + 1];
        }
        
        System.out.print("Array after the value on position " + index + " is removed is: ");
        for (int i = 0; i <= arr.length - 2; i++) { 
            if (i == 0) {
                System.out.print("[" + arr[i] + ", ");
            } else if (i == arr.length - 2) {
                System.out.println(arr[i] + "]");
            } else {
                System.out.print(arr[i] + ", ");
            }    
        }
    }
}
