package arraytasks;

import java.util.ArrayList;
import java.util.Scanner;

public class Task043_CombinationOf4 {

    public static void main(String[] args) {
        
        int[] a = {10, 20, 30, 40, 1, 2, 1, 1, 1, 50};
        ArrayList<Integer> list = new ArrayList<>();
        
        Scanner input = new Scanner(System.in);
        System.out.print("Input a number to find (I would advise 53): ");
        int sum = input.nextInt();
        
        System.out.println("Those combinations of numbers give sum of " + sum + ":");
        for (int i = 0; i < a.length - 3; i++) {
            for (int j = i + 1; j < a.length - 2; j++) {
                for (int k = j + 1; k < a.length - 1; k++) {
                    for (int l = k + 1; l < a.length; l++) {
                        if (i != j && j != k && k != l && a[i] + a[j] + a[k] + a[l] == sum) {
                            System.out.print(a[i] + ", " + a[j] + ", " + a[k] + ", " + a[l] + ";\n");
                        }
                    }
                }
            }
        }
    }
}
