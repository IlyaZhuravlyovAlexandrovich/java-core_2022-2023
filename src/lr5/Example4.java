package lr5;

    public class Example4 {
        private char character;
        private int number;

        public Example4(int number, char symbol) {
            this.number = number;
            this.character = symbol;
        }

        public Example4(double value) {
            this.number = (int) (value % 1 * 100);
            this.character = (char) ((int) value);
        }

        public char getCharacter() {
            return character;
        }

        public int getNumber() {
            return number;
        }

        public static void main(String[] args) {
            Example4 obj1 = new Example4(65, 'A');
            System.out.println("Character: " + obj1.getCharacter());
            System.out.println("Number: " + obj1.getNumber());

            Example4 obj2 = new Example4(65.1267);
            System.out.println("Character: " + obj2.getCharacter());
            System.out.println("Number: " + obj2.getNumber());
        }
    }

