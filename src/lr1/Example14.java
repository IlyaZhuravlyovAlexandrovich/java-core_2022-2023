package lr1;

import java.util.Scanner;

public class Example14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        System.out.println(" enter a number");
        a = in.nextInt();

        int c = a - 1;
        int b = a + 1;

        double d = (a+c+b)*(a+c+b);

        System.out.println("a number one less than the one entered: "+c+"; "+"entered number: "+a+"; "+"a number one more than the one entered: "+b+"; "+"a number that is the square of the sum of the first three numbers: "+d+"; ");
        in.close();
    }
}
