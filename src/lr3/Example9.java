package lr3;

import java.util.Random;
public class Example9 {
    public static void main(String[] args) {
        int size = 10; // specify the size of the array
        int[] numbers = new int[size];

        // fill the array with random numbers
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            numbers[i] = random.nextInt(100); // generates random numbers between 0 and 99
        }

        // display the array
        System.out.print("Array: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        // find the minimum value and its corresponding indexes
        int min = numbers[0];
        int[] indexes = new int[size];
        int count = 0;

        for (int i = 1; i < size; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
                count = 0;
            }

            if (numbers[i] == min) {
                indexes[count] = i;
                count++;
            }
        }

        // display the minimum value and its indexes
        System.out.println("Minimum Value: " + min);
        System.out.print("Indexes: ");
        for (int i = 0; i < count; i++) {
            System.out.print(indexes[i] + " ");
        }
    }
}