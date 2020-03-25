package arraytasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Task037_ArrayDisplay {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Input array size: ");
        int size = input.nextInt();
        
        int number = 1, counter = 0, counter_display = 1;
        ArrayList<Integer> set = new ArrayList<>();
        
        int[][] array = new int[size][size];
        
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (counter < Math.pow(size, 2)) {
                    array[i][j] = number;
                    counter++;
                    number++;
                } else {
                    break;
                }
            }   
        }
        System.out.println("\nOriginal array:");
        for (int[] arr : array) {
            System.out.println(Arrays.toString(arr));
        }
        
        System.out.println("\n\nOutput: ");
        System.out.println("[");

        for (int i = 0; i < size * 2 - 1; i++) {
            for (int x = 0; x < size; x++) {
                for (int y = 0; y < size; y++) {
                    if (x + y == i) {
                        set.add(counter_display);
                        counter_display++;
                    }
                }
            }
            System.out.println(set);
            set.clear();
        }
        System.out.println("]");
    }
}