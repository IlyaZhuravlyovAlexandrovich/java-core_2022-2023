package lr3;

import java.util.Arrays;
import java.util.Random;
public class Example10 {
    public static void main(String[] args) {
        // Create an integer array of size 10
        int[] arr = new int[10];

        // Fill the array with random numbers
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100);
        }

        // Print the original array
        System.out.println("Original Array: " + Arrays.toString(arr));

        // Sort the array in descending order
        Arrays.sort(arr);
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }

        // Print the sorted array
        System.out.println("Sorted Array in Descending Order: " + Arrays.toString(arr));
    }
}
