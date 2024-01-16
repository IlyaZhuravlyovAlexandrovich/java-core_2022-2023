package task_1567;

    import java.util.Scanner;

    public class Main {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Read the advertising chant
            String chant = scanner.nextLine();

            // Calculate the cost of the speech
            int cost = calculateCost(chant);

            // Print the result
            System.out.println(cost);
        }

        private static int calculateCost(String chant) {
            // Define the layout mapping
            String[] layout = {
                    "abc", "def", "ghi",
                    "jkl", "mno", "pqr",
                    "stu", "vwx", "yz",
                    "0.", "!#_"
            };

            int totalCost = 0;

            // Iterate through each character in the chant
            for (char c : chant.toCharArray()) {
                // Find the index of the character in the layout
                int index = findIndex(layout, c);

                // If the character is found, add its position + 1 to the total cost
                if (index != -1) {
                    totalCost += (index % 3) + 1;
                }
            }

            return totalCost;
        }

        private static int findIndex(String[] layout, char c) {
            // Iterate through each group of characters in the layout
            for (int i = 0; i < layout.length; i++) {
                // Find the index of the character in the current group
                int index = layout[i].indexOf(c);

                // If found, return the overall index in the layout
                if (index != -1) {
                    return i;
                }
            }

            // If not found, return -1
            return -1;
        }
    }
