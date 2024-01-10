package lr6;

public class Example1 {
        private char character;
        private String text;

        // Method for assigning values to fields when called with symbolic argument
        public void assignValues(char symbol, String symbolicField) {
            character = symbol;
            text = symbolicField;
        }

        // Method for assigning value to text field when called with text argument
        public void assignValues(String textField) {
            text = textField;
        }

        // Method for assigning values to fields when called with character array argument
        public void assignValues(char[] charArray) {
            if (charArray.length == 1) {
                character = charArray[0];
            } else {
                text = new String(charArray);
            }
        }

        public char getCharacter() {
            return character;
        }

        public String getText() {
            return text;
        }

        public static void main(String[] args) {
            Example1 obj = new Example1();

            obj.assignValues('A', "Symbolic Field");
            System.out.println("Character: " + obj.getCharacter());
            System.out.println("Text: " + obj.getText());

            obj.assignValues("Text Field");
            System.out.println("Character: " + obj.getCharacter());
            System.out.println("Text: " + obj.getText());

            char[] charArray = {'J', 'a', 'v', 'a'};
            obj.assignValues(charArray);
            System.out.println("Character: " + obj.getCharacter());
            System.out.println("Text: " + obj.getText());
        }
    }
