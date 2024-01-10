package lr6;

public class Example10 {

        public static int[] findMaxMin(int... numbers) {
            int[] result = new int[2];
            if (numbers.length > 0) {
                int min = numbers[0];
                int max = numbers[0];
                for (int i = 1; i < numbers.length; i++) {
                    if (numbers[i] < min) {
                        min = numbers[i];
                    } else if (numbers[i] > max) {
                        max = numbers[i];
                    }
                }
                result[0] = max;
                result[1] = min;
            }
            return result;
        }

        public static void main(String[] args) {
            int[] numbers = {5, 10, 2, 8, 15};
            int[] result = findMaxMin(numbers);
            System.out.println("Largest value: " + result[0]);
            System.out.println("Smallest value: " + result[1]);
        }
    }

