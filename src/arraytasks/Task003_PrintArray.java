package arraytasks;

import java.util.Arrays;

public class Task003_PrintArray {

    public static void main(String[] args) {
        
        String[][] arr = new String[10][10];
        
        for (int i = 0; i <= arr.length - 1; i++) {
            for (int j = 0; j <= arr.length - 1; j++) {
                arr[i][j] = "-";
                System.out.print(arr[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}
