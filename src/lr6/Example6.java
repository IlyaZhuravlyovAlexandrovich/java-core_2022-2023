package lr6;

import java.util.Arrays;

public class Example6 {


    public static int[] getSubsetArray(int[] array, int numElements) {
        if (numElements >= array.length) {
            // Create a copy of the original array and return it
            int[] copyArray = new int[array.length];
            System.arraycopy(array, 0, copyArray, 0, array.length);
            return copyArray;
        } else {
            // Create a new array with the specified number of elements
            int[] subsetArray = new int[numElements];
            System.arraycopy(array, 0, subsetArray, 0, numElements);
            return subsetArray;
        }
    }

    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5};
        int numElements = 3;

        int[] subsetArray = getSubsetArray(originalArray, numElements);

        System.out.println("Original Array: " + Arrays.toString(originalArray));
        System.out.println("Subset Array: " + Arrays.toString(subsetArray));
    }
}
