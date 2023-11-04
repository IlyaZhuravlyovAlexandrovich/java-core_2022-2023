package lr1;

import java.util.Scanner;

public class Example11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name;
        int yearOfBirth;
        int thisYear;
        System.out.println(" Please enter your date of birth and your name");
        yearOfBirth = in.nextInt();
        name = in.nextLine();

        System.out.println(" please enter the current year");
        thisYear = in.nextInt();
        int yourAge = thisYear - yearOfBirth;

        System.out.println("Your name: "+ name +"; "+"Are you old: "+yourAge+"; ");
        in.close();
    }
}
