package lr5;

public class Example3 {
        private int field1;
        private int field2;

        // Constructor without arguments
        public Example3() {
            this.field1 = 0;
            this.field2 = 0;
        }

        // Constructor with one argument
        public Example3(int value1) {
            this.field1 = value1;
            this.field2 = 0;
        }

        // Constructor with two arguments
        public Example3(int value1, int value2) {
            this.field1 = value1;
            this.field2 = value2;
        }

        // Getters and setters
        public int getField1() {
            return field1;
        }

        public void setField1(int field1) {
            this.field1 = field1;
        }

        public int getField2() {
            return field2;
        }

        public void setField2(int field2) {
            this.field2 = field2;
        }

        public static void main(String[] args) {
            // Creating objects using various constructors
            Example3 object1 = new Example3();
            Example3 object2 = new Example3(10);
            Example3 object3 = new Example3(20, 30);

            // Printing object values
            System.out.println("Object 1: Field1=" + object1.getField1() + ", Field2=" + object1.getField2());
            System.out.println("Object 2: Field1=" + object2.getField1() + ", Field2=" + object2.getField2());
            System.out.println("Object 3: Field1=" + object3.getField1() + ", Field2=" + object3.getField2());
        }
    }
