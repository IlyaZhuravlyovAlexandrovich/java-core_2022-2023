package lr3;

public class Example8 {
    public static void main(String[] args) {
        // Create a character array of size 10
        char[] letters = new char[10];

        char currentLetter = 'A';

        // Fill the array with large letters of the English alphabet
        for (int i = 0; i < letters.length; i++) {
            // Skip vowel letters (A, E, I, O, U)
            while (currentLetter == 'A' || currentLetter == 'E' || currentLetter == 'I' || currentLetter == 'O' || currentLetter == 'U') {
                currentLetter++;
            }

            letters[i] = currentLetter;
            currentLetter++;
        }

        // Display the contents of the array
        for (char letter : letters) {
            System.out.println(letter);
        }
    }
}

