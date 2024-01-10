package lr6;

public class Example8 {

        public static double calculateAverage(int[] arr) {
            int sum = 0;
            for (int num : arr) {
                sum += num;
            }
            return (double) sum / arr.length;
        }

        public static void main(String[] args) {
            int[] array = {4, 7, 1, 9, 2}; // Sample integer array
            double average = calculateAverage(array);
            System.out.println("Average: " + average);
        }
    }