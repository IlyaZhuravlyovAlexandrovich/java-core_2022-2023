package lr4;

public class Example7 {

        public static void main(String[] args) {
            int rows = 5;
            int columns = 4;
            int[][] array = new int[rows][columns];

            int count = 1;
            for (int i = 0; i < rows; i++) {
                if (i % 2 == 0) {
                    for (int j = 0; j < columns; j++) {
                        array[i][j] = count++;
                    }
                } else {
                    for (int j = columns - 1; j >= 0; j--) {
                        array[i][j] = count++;
                    }
                }
            }

            // Print the array
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    System.out.print(array[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
