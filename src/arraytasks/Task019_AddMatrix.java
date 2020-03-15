package arraytasks;

public class Task019_AddMatrix {

    public static void main(String[] args) {
        
        int[][] arr1 = {{1, 7}, {1, 1}};
        int[][] arr2 = {{2, 2}, {2, 2}};
        int[][] arr3 = new int[arr1.length][arr1[0].length];
        
        for (int i = 0; i <= arr1.length - 1; i++) {
            for (int j = 0; j <= arr2.length - 1; j++) {
                arr3[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        
        for (int i = 0; i <= arr3.length - 1; i++) {
            for (int j = 0; j<= arr3[0].length - 1; j++) {
                if (j == arr3[0].length - 1) {
                    System.out.print(arr3[i][j]);
                } else {
                System.out.print(arr3[i][j] + ", ");
                }
            }
            System.out.println("");
        }
    }
}
