package arraytasks;

import java.util.Arrays;
import java.util.Scanner;

public class Task009_InsertInArray {

    public static void main(String[] args) {
        
        int[] arr1 = {1, 2, 3};
        int[] arr2 = new int[arr1.length + 1];
        System.out.println("Original array is: " + Arrays.toString(arr1));
        Scanner input = new Scanner(System.in);
        System.out.print("Input a number to add to array: ");
        int number = input.nextInt();
        System.out.print("Input an index to where to add the number: ");
        int index = input.nextInt() - 1;
        
        while (index < 1 || index > arr1.length) {
            System.out.print("The position you choose is invalid. Pick another: ");
            index = input.nextInt();
        }
      
        System.out.println(insertValue(arr1, arr2, number, index));
    }
    
    public static String insertValue(int[] arr1, int[] arr2, int number, int index) {
        for (int i = 0; i < index; i++) {
            arr2[i] = arr1[i];
        }
        
        arr2[index] = number;
        
        for (int i = index; i <= arr1.length - 1; i++) {
            arr2[i + 1] = arr1[i];
        }
        return Arrays.toString(arr2);
    }
}