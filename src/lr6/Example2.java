package lr6;

public class Example2 {

        private static int zero = 0;

        public static void main(String[] args) {
            System.out.println("Current value: " + zero);
            Example2();
            System.out.println("Current value: " + zero);
            Example2();
            System.out.println("Current value: " + zero);
        }

        public static void Example2() {
            zero++;
        }
    }
