package arraytasks;

public class Task040_PairsCloseToZero {

    public static void main(String[] args) {
        
        int[] a = {0, 5, -4, 7, 8, -6};
        int first = a[0];
        int second = a[1];
        int min_sum = Math.abs(a[0] + a[1]);
        
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (Math.abs(a[i] + a[j]) < Math.abs(min_sum)) {
                    min_sum = a[i] + a[j];
                    first = a[i];
                    second = a[j];
                }
            }
        }
        System.out.println("Minimal sum is " + min_sum + " made from values " + first + " and " + second);
    }
}
