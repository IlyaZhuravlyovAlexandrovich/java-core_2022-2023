package lr6;

public class Example4 {
        public static void main(String[] args) {
            int n = 6;
            int doubleFact = calculateDoubleFactorial(n);
            System.out.println(n + "!! = " + doubleFact);
        }

        public static int calculateDoubleFactorial(int n) {
            int result = 1;
            while (n > 0) {
                result *= n;
                n -= 2;
            }
            return result;
        }
    }
