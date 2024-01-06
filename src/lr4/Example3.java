package lr4;

public class Example3 {
        public static void main(String[] args) {
            int[][] rectangle = new int[5][10];

            // Fill the rectangle with 2-digit numbers
            int number = 10;
            for (int i = 0; i < rectangle.length; i++) {
                for (int j = 0; j < rectangle[i].length; j++) {
                    rectangle[i][j] = number++;
                    if (number == 100) {
                        number = 10; // Reset the number to 10 once it reaches 100
                    }
                }
            }

            // Print the rectangle
            for (int i = 0; i < rectangle.length; i++) {
                for (int j = 0; j < rectangle[i].length; j++) {
                    System.out.print(rectangle[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
