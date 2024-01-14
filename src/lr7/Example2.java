package lr7;

    class Superclass {
        private String text;

        public Superclass() {
            text = "";
        }

        public Superclass(String text) {
            this.text = text;
        }

        public void setText() {
            this.text = "";
        }

        public void setText(String text) {
            this.text = text;
        }

        public int getLength() {
            return text.length();
        }
    }

    class Subclass extends Superclass {
        int openField;

        public Subclass(int openField, String text) {
            super(text);
            this.openField = openField;
        }

        public void setOpenField() {
            this.openField = 0;
        }

        public void setOpenField(int openField) {
            this.openField = openField;
        }

        public void setText() {
            super.setText();
        }

        public void setText(String text) {
            super.setText(text);
        }

        public void setText(int openField) {
            this.openField = openField;
        }

        public void setText(String text, int openField) {
            super.setText(text);
            this.openField = openField;
        }
    }

    public class Example2 {
        public static void main(String[] args) {
            Subclass obj = new Subclass(10, "Hello World");
            System.out.println("Length of the text: " + obj.getLength());
            System.out.println("Value of the open field: " + obj.openField);

            obj.setText();
            System.out.println("Length of the text after calling setText(): " + obj.getLength());
            System.out.println("Value of the open field after calling setText(): " + obj.openField);

            obj.setText("Hello");
            System.out.println("Length of the text after calling setText(String): " + obj.getLength());
            System.out.println("Value of the open field after calling setText(String): " + obj.openField);

            obj.setText(20);
            System.out.println("Length of the text after calling setText(int): " + obj.getLength());
            System.out.println("Value of the open field after calling setText(int): " + obj.openField);

            obj.setText("Hello Java", 30);
            System.out.println("Length of the text after calling setText(String, int): " + obj.getLength());
            System.out.println("Value of the open field after calling setText(String, int): " + obj.openField);
        }
    }
