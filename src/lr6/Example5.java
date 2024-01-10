package lr6;

public class Example5 {

        public static void main(String[] args) {
            int n = 5;  // Example value, can be changed

            int sumOfSquares = calculateSumOfSquares(n);
            System.out.println("Sum of Squares: " + sumOfSquares);
        }

        public static int calculateSumOfSquares(int n) {
            return (n * (n + 1) * (2 * n + 1)) / 6;
        }
    }
