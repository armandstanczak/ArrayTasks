package arraytasks;

import java.util.Scanner;

public class Task006_FindIndex {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        System.out.print("Input a value to find: ");
        int number = input.nextInt();
        
        System.out.println(indexOf(number, arr));
    }
    
    public static String indexOf(int a, int[] b) {
        for (int i : b) {
            if (i == a) {
                return "The index of value " + a + " is " + (i - 1);
            }
        }
        return "Value not found";
    }
}
