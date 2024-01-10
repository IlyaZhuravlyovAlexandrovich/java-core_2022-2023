package lr6;

public class Example7 {

        public static void main(String[] args) {
            char[] input = {'A', 'B', 'C', 'D', 'E'};
            int[] output = getCharacterCodes(input);

            // Printing the character codes
            for (int code : output) {
                System.out.println(code);
            }
        }

        public static int[] getCharacterCodes(char[] chars) {
            int[] codes = new int[chars.length];

            for (int i = 0; i < chars.length; i++) {
                codes[i] = (int) chars[i];
            }

            return codes;
        }
    }

