package arraytasks;

import java.util.Scanner;

public class Task005_FindInArray {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Input a number to find: ");
        int number = input.nextInt();
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        
        System.out.println(findValue(number, arr));
    }
    
    public static String findValue(int a, int[] b) {
        for (int i : b) {
            if (i == a) {
                return "Value found in given array";
            }
        }
        return "Value not found in given array";
    }
}
