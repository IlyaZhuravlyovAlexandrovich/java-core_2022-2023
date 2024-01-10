package lr6;

import java.util.Arrays;
public class Example9 {

        public static void main(String[] args) {
            char[] arr = {'a', 'b', 'c', 'd', 'e'};

            System.out.println("Original array: " + Arrays.toString(arr));
            swapElementsInPairs(arr);
            System.out.println("Swapped array: " + Arrays.toString(arr));
        }

        public static void swapElementsInPairs(char[] arr) {
            int left = 0;
            int right = arr.length - 1;

            while (left < right) {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
        }
    }
