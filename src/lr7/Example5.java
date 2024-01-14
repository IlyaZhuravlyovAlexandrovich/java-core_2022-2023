package lr7;

    class Superclass {
        protected String text;

        public Superclass(String text) {
            this.text = text;
        }

        public void display() {
            System.out.println("Superclass: " + text);
        }
    }

    class Subclass1 extends Superclass {
        protected int number;

        public Subclass1(String text, int number) {
            super(text);
            this.number = number;
        }

        @Override
        public void display() {
            System.out.println("Subclass1: " + text + ", " + number);
        }
    }

    class Subclass2 extends Superclass {
        protected char letter;

        public Subclass2(String text, char letter) {
            super(text);
            this.letter = letter;
        }

        @Override
        public void display() {
            System.out.println("Subclass2: " + text + ", " + letter);
        }
    }

    public class Example5 {
        public static void main(String[] args) {
            Superclass superClassObject = new Subclass1("Hello", 10);
            superClassObject.display();

            Subclass1 subClass1Object = new Subclass1("World", 20);
            subClass1Object.display();

            Subclass2 subClass2Object = new Subclass2("Java", 'A');
            subClass2Object.display();
        }
    }
