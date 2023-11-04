package lr1;

import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String dayOfTheWeek;
        String nameOfTheMonth;
        int date;

        System.out.println("Please write the names of today's day of the week");
        dayOfTheWeek = in.nextLine();

        System.out.println("Please write the names of today's month and date in numbers");
        nameOfTheMonth = in.nextLine();
        date = in.nextInt();

        System.out.println("names of today's day of the week: "+dayOfTheWeek+"; "+"date in numbers: "+date+"; "+"names of today's month: "+nameOfTheMonth+";" );
        in.close();
    }
}