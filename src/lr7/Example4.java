package lr7;

    // First class with an open character field
    class FirstClass {
        protected char character;

        public FirstClass(char character) {
            this.character = character;
        }

        public FirstClass(FirstClass obj) {
            this.character = obj.character;
        }
    }

    // Second class with an open text field
    class SecondClass extends FirstClass {
        protected String text;

        public SecondClass(char character, String text) {
            super(character);
            this.text = text;
        }

        public SecondClass(SecondClass obj) {
            super(obj);
            this.text = obj.text;
        }
    }

    // Third class with an open integer field
    class ThirdClass extends SecondClass {
        protected int number;

        public ThirdClass(char character, String text, int number) {
            super(character, text);
            this.number = number;
        }

        public ThirdClass(ThirdClass obj) {
            super(obj);
            this.number = obj.number;
        }
    }

    public class Example4 {
        public static void main(String[] args) {
            // Creating objects and testing the constructors
            FirstClass firstObj = new FirstClass('A');
            System.out.println("First Object - character: " + firstObj.character);

            SecondClass secondObj = new SecondClass('B', "Text");
            System.out.println("Second Object - character: " + secondObj.character + ", text: " + secondObj.text);

            ThirdClass thirdObj = new ThirdClass('C', "Sample", 10);
            System.out.println("Third Object - character: " + thirdObj.character + ", text: "
                    + thirdObj.text + ", number: " + thirdObj.number);

            // Creating copy objects using copy constructors
            FirstClass firstCopyObj = new FirstClass(firstObj);
            System.out.println("First Copy Object - character: " + firstCopyObj.character);

            SecondClass secondCopyObj = new SecondClass(secondObj);
            System.out.println("Second Copy Object - character: " + secondCopyObj.character + ", text: " + secondCopyObj.text);

            ThirdClass thirdCopyObj = new ThirdClass(thirdObj);
            System.out.println("Third Copy Object - character: " + thirdCopyObj.character + ", text: "
                    + thirdCopyObj.text + ", number: " + thirdCopyObj.number);
        }
    }
