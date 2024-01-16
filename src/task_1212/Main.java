package task_1212;

    import java.util.Scanner;

    public class Main {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Read input values
            int N = scanner.nextInt();
            int M = scanner.nextInt();
            int L = scanner.nextInt();

            // Initialize the field matrix
            boolean[][] field = new boolean[N + 1][M + 1];

            // Mark occupied cells on the field
            for (int i = 0; i < L; i++) {
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                int size = scanner.nextInt();
                char orientation = scanner.next().charAt(0);

                markShipCells(field, x, y, size, orientation);
            }

            // Read the number of decks of the ship to be delivered
            int K = scanner.nextInt();

            // Calculate and print the number of ways to place the ship
            int ways = calculateWays(field, K);
            System.out.println(ways);
        }

        private static void markShipCells(boolean[][] field, int x, int y, int size, char orientation) {
            if (orientation == 'H') {
                for (int i = y; i < y + size; i++) {
                    field[x][i] = true;
                }
            } else {
                for (int i = x; i < x + size; i++) {
                    field[i][y] = true;
                }
            }
        }

        private static int calculateWays(boolean[][] field, int K) {
            int ways = 0;

            for (int i = 1; i < field.length; i++) {
                for (int j = 1; j < field[0].length; j++) {
                    if (!field[i][j] && checkAvailableSpace(field, i, j, K)) {
                        ways++;
                    }
                }
            }

            return ways;
        }

        private static boolean checkAvailableSpace(boolean[][] field, int x, int y, int size) {
            for (int i = x; i < x + size; i++) {
                for (int j = y; j < y + 1; j++) {
                    if (i < 1 || i >= field.length || j < 1 || j >= field[0].length || field[i][j]) {
                        return false;
                    }
                }
            }
            return true;
        }
    }
