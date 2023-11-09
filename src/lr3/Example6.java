package lr3;

import java.util.Scanner;
public class Example6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = 0;
        while (size <= 0) {
            try {
                System.out.print("Enter the size of the array: ");
                size = Integer.parseInt(scanner.nextLine());
                if (size <= 0) {
                    throw new IllegalArgumentException("Size should be a positive number");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Size should be a positive number.");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        int[] numbers = new int[size];
        int value = 2;
        for (int i = 0; i < size; i++) {
            numbers[i] = value;
            value += 5;
        }

        System.out.println("Generated array with numbers giving 2 in the remainder when divided by 5:");
        for (int num : numbers) {
            System.out.println(num);
        }
    }

}

