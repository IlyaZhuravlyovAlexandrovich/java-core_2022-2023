package lr5;

    public class Example5 {
        private Integer field;

        public void assignValue(Integer value) {
            if (value != null && value <= 100) {
                this.field = value;
            } else {
                this.field = 100;
            }
        }

        public Integer getValue() {
            return this.field;
        }

        public Example5() {
            assignValue(null);
        }

        public Example5(Integer value) {
            assignValue(value);
        }

        public static void main(String[] args) {
            Example5 obj1 = new Example5();
            System.out.println(obj1.getValue());  // Output: null

            Example5 obj2 = new Example5(50);
            System.out.println(obj2.getValue());  // Output: 50

            Example5 obj3 = new Example5(150);
            System.out.println(obj3.getValue());  // Output: 100
        }
    }
