package lr7;


    class SuperClass {
        protected int number;

        public void setNumber(int number) {
            this.number = number;
        }

        public SuperClass(int number) {
            this.number = number;
        }

        @Override
        public String toString() {
            return "SuperClass{" +
                    "number=" + number +
                    '}';
        }
    }

    class SubClass1 extends SuperClass {
        protected char character;

        public void setValues(int number, char character) {
            this.number = number;
            this.character = character;
        }

        public SubClass1(int number, char character) {
            super(number);
            this.character = character;
        }

        @Override
        public String toString() {
            return "SubClass1{" +
                    "number=" + number +
                    ", character=" + character +
                    '}';
        }
    }

    class SubClass2 extends SubClass1 {
        protected String text;

        public void setValues(int number, char character, String text) {
            this.number = number;
            this.character = character;
            this.text = text;
        }

        public SubClass2(int number, char character, String text) {
            super(number, character);
            this.text = text;
        }

        @Override
        public String toString() {
            return "SubClass2{" +
                    "number=" + number +
                    ", character=" + character +
                    ", text='" + text + '\'' +
                    '}';
        }
    }

    public class Example3 {
        public static void main(String[] args) {
            SuperClass superClassObj = new SuperClass(10);
            System.out.println(superClassObj);

            SubClass1 subClass1Obj = new SubClass1(20, 'A');
            System.out.println(subClass1Obj);

            SubClass2 subClass2Obj = new SubClass2(30, 'B', "Hello");
            System.out.println(subClass2Obj);
        }
    }
