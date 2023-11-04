package lr1;

import java.util.Scanner;

public class Example12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int yourAge;
        int thisYear;
        System.out.println(" Please enter your age");
        yourAge = in.nextInt();

        System.out.println(" please enter the current year");
        thisYear = in.nextInt();
        int yearOfBirth = thisYear - yourAge;

        System.out.println("Are you old: "+yearOfBirth);
        in.close();
    }
}
