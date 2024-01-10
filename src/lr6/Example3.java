package lr6;

public class Example3 {

        public static int findLargestValue(int... nums) {
            if (nums.length == 0) {
                throw new IllegalArgumentException("No values provided");
            }

            int largest = nums[0];
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] > largest) {
                    largest = nums[i];
                }
            }
            return largest;
        }

        public static int findSmallestValue(int... nums) {
            if (nums.length == 0) {
                throw new IllegalArgumentException("No values provided");
            }

            int smallest = nums[0];
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] < smallest) {
                    smallest = nums[i];
                }
            }
            return smallest;
        }

        public static double calculateAverage(int... nums) {
            if (nums.length == 0) {
                throw new IllegalArgumentException("No values provided");
            }

            int sum = 0;
            for (int num : nums) {
                sum += num;
            }
            return (double) sum / nums.length;
        }

        public static void main(String[] args) {
            // Pass individual arguments
            System.out.println("Largest value: " + Example3.findLargestValue(10, 5, 20, 15));
            System.out.println("Smallest value: " + Example3.findSmallestValue(10, 5, 20, 15));
            System.out.println("Average value: " + Example3.calculateAverage(10, 5, 20, 15));

            // Pass an integer array
            int[] nums = {30, 25, 35, 40};
            System.out.println("Largest value: " + Example3.findLargestValue(nums));
            System.out.println("Smallest value: " + Example3.findSmallestValue(nums));
            System.out.println("Average value: " + Example3.calculateAverage(nums));
        }
    }
