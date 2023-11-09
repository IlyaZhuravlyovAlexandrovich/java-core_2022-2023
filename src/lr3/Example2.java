package lr3;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the name of the day: ");
        String day = scanner.nextLine();

        int ordinalNumber;

        switch (day.toLowerCase()) {
            case "monday":
                ordinalNumber = 1;
                break;
            case "tuesday":
                ordinalNumber = 2;
                break;
            case "wednesday":
                ordinalNumber = 3;
                break;
            case "thursday":
                ordinalNumber = 4;
                break;
            case "friday":
                ordinalNumber = 5;
                break;
            case "saturday":
                ordinalNumber = 6;
                break;
            case "sunday":
                ordinalNumber = 7;
                break;
            default:
                System.out.println("There is no such day.");
                return;
        }

        System.out.println("The ordinal number of " + day + " is " + ordinalNumber + ".");
    }
}


