package lr3;

import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int num1 = input.nextInt();

        System.out.print("Enter the second integer: ");
        int num2 = input.nextInt();

        int start, end;
        if (num1 < num2) {
            start = num1;
            end = num2;
        } else {
            start = num2;
            end = num1;
        }

        int i = start;
        while (i <= end) {
            System.out.print(i + " ");
            i++;
        }

        input.close();
    }
}



