package lr4;

import java.util.Arrays;
import java.util.Random;
public class Example5 {
        public static void main(String[] args) {
            int rows = 3;
            int cols = 5;

            // Create the original array
            int[][] originalArray = createRandomArray(rows, cols);

            // Print the original array
            System.out.println("Original Array:");
            printArray(originalArray);

            // Swap the rows and columns
            int[][] swappedArray = swapRowsColumns(originalArray);

            // Print the swapped array
            System.out.println("Swapped Array:");
            printArray(swappedArray);
        }

        public static int[][] createRandomArray(int rows, int cols) {
            int[][] array = new int[rows][cols];
            Random random = new Random();

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    array[i][j] = random.nextInt(100);
                }
            }

            return array;
        }

        public static int[][] swapRowsColumns(int[][] originalArray) {
            int rows = originalArray.length;
            int cols = originalArray[0].length;
            int[][] swappedArray = new int[cols][rows];

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    swappedArray[j][i] = originalArray[i][j];
                }
            }

            return swappedArray;
        }

        public static void printArray(int[][] array) {
            for (int i = 0; i < array.length; i++) {
                System.out.println(Arrays.toString(array[i]));
            }
            System.out.println();
        }
    }

