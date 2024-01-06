package lr4;

public class Example3_1 {
        public static void main(String[] args) {
            int rows = 2;
            int columns = 2;

            // Create a two-dimensional array
            int[][] rectangle = new int[rows][columns];

            // Fill the array with values
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    rectangle[i][j] = 2;
                }
            }

            // Output the rectangle
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    System.out.print(rectangle[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

