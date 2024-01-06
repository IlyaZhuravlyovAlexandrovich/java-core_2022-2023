package lr4;

import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the text for encryption: ");
        String text = scanner.nextLine();

        System.out.print("Enter the key: ");
        int key = scanner.nextInt();
        scanner.nextLine(); // consume the newline character

        String encryptedText = encrypt(text, key);
        System.out.println("Text after conversion: " + encryptedText);

        System.out.print("Do the reverse conversion? (y/n): ");
        String choice = scanner.nextLine().toLowerCase();

        if (choice.equals("y")) {
            String decryptedText = decrypt(encryptedText, key);
            System.out.println("Text after reverse conversion: " + decryptedText);
        } else if (choice.equals("n")) {
            System.out.println("Goodbye!");
        } else {
            System.out.println("Enter the correct answer.");
        }

        scanner.close();
    }

    public static String encrypt(String text, int key) {
        StringBuilder encryptedText = new StringBuilder();

        for (char ch : text.toCharArray()) {
            if (Character.isLetter(ch)) {
                int shifted = ((ch - 'a' + key) % 26) + 'a';
                encryptedText.append((char) shifted);
            } else {
                encryptedText.append(ch);
            }
        }

        return encryptedText.toString();
    }

    public static String decrypt(String text, int key) {
        StringBuilder decryptedText = new StringBuilder();

        for (char ch : text.toCharArray()) {
            if (Character.isLetter(ch)) {
                int shifted = ((ch - 'a' - key + 26) % 26) + 'a';
                decryptedText.append((char) shifted);
            } else {
                decryptedText.append(ch);
            }
        }

        return decryptedText.toString();
    }
}
