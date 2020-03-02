package arraytasks;

import java.util.Arrays;
import java.util.Random;

public class Task004_ArrayAverage {

    public static void main(String[] args) {
        
        int[] arrayInt = new int[11];
        Random randomNumber = new Random();
        double sum = 0;
        double average;
        
        for (int i = 0; i <= arrayInt.length - 1; i++) {
            arrayInt[i] = randomNumber.nextInt(10);
            sum += arrayInt[i];
        }
        
        average = sum / arrayInt.length;
        
        System.out.println("The array is: " + Arrays.toString(arrayInt) + " and the average value is: " + average);
    }
}
