package task_2001;

import java.io.PrintWriter;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int a1 = in.nextInt();
        int b1 = in.nextInt();
        int a2 = in.nextInt();
        int b2 = in.nextInt();
        int a3 = in.nextInt();
        int b3 = in.nextInt();

        int berriest2 = b1 -b2;
        int berriest1 = b3 - berriest2 - b2;

        System.out.println(berriest1 + " " + berriest2);


    }
}
