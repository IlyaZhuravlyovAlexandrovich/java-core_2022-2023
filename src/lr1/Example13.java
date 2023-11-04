package lr1;

import java.util.Scanner;

public class Example13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        int b;
        System.out.println(" enter the value of the first and second terms");
        a = in.nextInt();
        b = in.nextInt();

        int c = a + b;

        System.out.println("the sum of the numbers is: "+c+"; ");
        in.close();
    }
}