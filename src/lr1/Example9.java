package lr1;

import java.util.Scanner;

public class Example9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String nameOfTheMonth;
        int NumberOfDaysInAMonth;
        System.out.println(" Write the name of the month and the number of days in this month");
        nameOfTheMonth = in.nextLine();
        NumberOfDaysInAMonth = in.nextInt();

        System.out.println("name of the month: " + nameOfTheMonth + "; " + "number of days in a month: " + NumberOfDaysInAMonth + "; ");
        in.close();
    }
}
