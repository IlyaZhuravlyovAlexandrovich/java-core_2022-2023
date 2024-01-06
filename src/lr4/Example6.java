package lr4;

import java.util.Random;
public class Example6 {

        public static void main(String[] args) {
            // Create and initialize the array
            int[][] array = {
                    {1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9}
            };

            // Display the original array
            System.out.println("Original Array:");
            displayArray(array);

            // Generate random indexes
            Random random = new Random();
            int rowIndexToDelete = random.nextInt(array.length);
            int columnIndexToDelete = random.nextInt(array[0].length);

            // Create a new array with one less row and one less column
            int[][] updatedArray = new int[array.length - 1][array[0].length - 1];

            // Copy elements to the new array, skipping the row and column to delete
            int newRow = 0;
            for (int i = 0; i < array.length; i++) {
                if (i == rowIndexToDelete) {
                    continue; // Skip the row to delete
                }

                int newColumn = 0;
                for (int j = 0; j < array[i].length; j++) {
                    if (j == columnIndexToDelete) {
                        continue; // Skip the column to delete
                    }

                    updatedArray[newRow][newColumn] = array[i][j];
                    newColumn++;
                }

                newRow++;
            }

            // Display the updated array
            System.out.println("\nUpdated Array:");
            displayArray(updatedArray);

            // Display the indexes of the row and column deleted
            System.out.println("\nDeleted Row Index: " + rowIndexToDelete);
            System.out.println("Deleted Column Index: " + columnIndexToDelete);
        }

        // Helper method to display the array
        public static void displayArray(int[][] arr) {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

