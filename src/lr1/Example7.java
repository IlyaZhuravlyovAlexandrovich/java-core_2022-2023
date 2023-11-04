package lr1;

import java.util.Scanner;

public class Example7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name;
        int age;
        System.out.println(" please  enter your name and age");
        name = in.nextLine();
        age = in.nextInt();

        System.out.println("Name: "+name+"; "+"Age: "+age+"; ");
        in.close();



    }
}
