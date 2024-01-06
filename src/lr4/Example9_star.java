package lr4;

import java.util.Scanner;
public class Example9_star {
        private static final String ALPHABET = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the text for encryption: ");
            String text = scanner.nextLine();

            System.out.print("Enter the key: ");
            int key = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            String encryptedText = encrypt(text, key);
            System.out.println("Text after conversion: " + encryptedText);

            System.out.print("Do the reverse conversion? (y/n): ");
            String choice = scanner.nextLine();

            if (choice.equalsIgnoreCase("y")) {
                String decryptedText = decrypt(encryptedText, key);
                System.out.println("Text after reverse conversion: " + decryptedText);
            } else if (choice.equalsIgnoreCase("n")) {
                System.out.println("Goodbye!");
            } else {
                System.out.println("Enter the correct answer.");
            }
        }

        private static String encrypt(String text, int key) {
            StringBuilder encrypted = new StringBuilder();

            for (char c : text.toCharArray()) {
                int index = (ALPHABET.indexOf(c) + key) % ALPHABET.length();
                encrypted.append(ALPHABET.charAt(index));
            }

            return encrypted.toString();
        }

        private static String decrypt(String text, int key) {
            StringBuilder decrypted = new StringBuilder();

            for (char c : text.toCharArray()) {
                int index = (ALPHABET.indexOf(c) - key + ALPHABET.length()) % ALPHABET.length();
                decrypted.append(ALPHABET.charAt(index));
            }

            return decrypted.toString();
        }
    }


