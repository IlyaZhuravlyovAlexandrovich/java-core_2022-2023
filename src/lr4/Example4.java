package lr4;

import java.util.Scanner;
public class Example4 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Get the size of the right-angled triangle from the user
            System.out.print("Enter the size of the right-angled triangle: ");
            int size = scanner.nextInt();

            // Create a two-dimensional array for the right-angled triangle
            int[][] triangle = new int[size][];

            // Fill the array with values for the right-angled triangle
            for (int i = 0; i < size; i++) {
                triangle[i] = new int[i + 1];
                for (int j = 0; j <= i; j++) {
                    triangle[i][j] = 1;
                }
            }

            // Print the right-angled triangle
            for (int i = 0; i < size; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.print(triangle[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
