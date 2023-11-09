package lr3;

public class Example7 {
    public static void main(String[] args) {
        int size = 10;
        char[] charArray = new char[size];

        // Fill the array with letters "through one"
        char letter = 'a';
        for (int i = 0; i < size; i++) {
            charArray[i] = letter;
            letter += 2; // Increment by 2 to get the next letter "through one"
        }

        // Display the array in forward order
        System.out.println("Array in forward order:");
        for (char c : charArray) {
            System.out.print(c + " ");
        }
        System.out.println();

        // Display the array in reverse order
        System.out.println("\nArray in reverse order:");
        for (int i = size - 1; i >= 0; i--) {
            System.out.print(charArray[i] + " ");
        }
    }
}

