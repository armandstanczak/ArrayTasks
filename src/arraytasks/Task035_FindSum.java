package arraytasks;

import java.util.Scanner;

public class Task035_FindSum {

    public static void main(String[] args) {
        
        int[] a = {1, 2, 4, 5, 6};
        
        Scanner input = new Scanner(System.in);
        System.out.print("Input a value you want to find: ");
        int number = input.nextInt();
     
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] + a[j] == number) {
                    System.out.println("Found a pair of numbers [" + a[i] + ", " + a[j] + "]");
                }
            }
        }
    }
    
}
