package lr3;

import java.util.Scanner;
public class Example3 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the number of Fibonacci numbers to generate: ");
            int n = scanner.nextInt();
            scanner.close();

            int first = 1, second = 1;
            System.out.print("Fibonacci sequence: " + first + ", " + second);

            for (int i = 2; i < n; i++) {
                int sum = first + second;
                System.out.print(", " + sum);
                first = second;
                second = sum;
            }
        }
    }

