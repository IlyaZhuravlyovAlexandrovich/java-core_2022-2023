package lr3;

import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of numbers to sum: ");
        int count = scanner.nextInt();

        int sum = 0;
        int numbersCounted = 0;
        int i = 1;

        while (numbersCounted < count) {
            if (i % 5 == 2 || i % 3 == 1) {
                sum += i;
                numbersCounted++;
                System.out.println("Number " + numbersCounted + ": " + i);
            }
            i++;
        }

        System.out.println("Sum: " + sum);
        scanner.close();
    }
}

