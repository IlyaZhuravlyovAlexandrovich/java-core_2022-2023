package lr2;

import java.util.Scanner;

public class test2 {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число для проверки: ");
        int number = scanner.nextInt();


        boolean satisfiesCriteria = number % 5 == 2 && number % 7 == 1;
        if (satisfiesCriteria) {
            System.out.println("Число удовлетворяет критериям.");
        } else {
            System.out.println("Число не удовлетворяет критериям.");
        }
    }
}
