package arraytasks;

public class Task024_MissingNumber {

    public static void main(String[] args) {
        
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 13};
        int len = numbers.length + 1; 
        int expected_sum = len * ((len + 1) / 2);
    
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        
        System.out.println("Missing number is: " + (expected_sum - sum));
    }
}
