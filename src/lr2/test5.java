package lr2;

import java.util.Scanner;

public class test5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        int thousandthDigit = (number / 1000) % 10;

        System.out.println("В числе " + number + " четвертая цифра справа: " + thousandthDigit);
    }
}