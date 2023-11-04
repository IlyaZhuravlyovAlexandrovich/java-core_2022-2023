package lr1;

import java.util.Scanner;

public class Example10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int yearOfBirth;
        int thisYear;
        System.out.println(" Please enter your date of birth");
        yearOfBirth = in.nextInt();

        System.out.println(" please enter the current year");
        thisYear = in.nextInt();
        int yourAge = thisYear - yearOfBirth;

        System.out.println("Are you old: "+yourAge);
        in.close();



    }
}

