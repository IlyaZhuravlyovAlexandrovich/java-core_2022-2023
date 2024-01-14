package lr7;

    class Superclass {
        private String text;

        public Superclass(String text) {
            this.text = text;
        }

        @Override
        public String toString() {
            return getClass().getSimpleName() + ": " + text;
        }
    }

    class Subclass extends Superclass {
        private String message;

        public Subclass(String text, String message) {
            super(text);
            this.message = message;
        }

        public Subclass(String text) {
            this(text, "");
        }

        @Override
        public String toString() {
            return getClass().getSimpleName() + ": " + getText() + ", " + message;
        }

        private String getText() {
            return super.toString().split(": ")[1];
        }
    }

    public class Example1 {
        public static void main(String[] args) {
            Superclass superclass1 = new Superclass("Superclass Text");
            System.out.println(superclass1.toString());

            Superclass superclass2 = new Subclass("Superclass Text", "Subclass Message");
            System.out.println(superclass2.toString());

            Subclass subclass1 = new Subclass("Subclass Text");
            System.out.println(subclass1.toString());

            Subclass subclass2 = new Subclass("Subclass Text", "Another Message");
            System.out.println(subclass2.toString());
        }
    }
