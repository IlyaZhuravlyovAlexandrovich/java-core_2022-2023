package lr1;

import java.util.Scanner;

public class Example15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        int b;
        System.out.println(" please enter two numbers");
        a = in.nextInt();
        b = in.nextInt();

        int c = a + b;
        int d = a - b;

        System.out.println("the sum of two entered numbers: "+c+"; "+"the difference of two entered numbers: "+d+"; ");
        in.close();
    }
}

