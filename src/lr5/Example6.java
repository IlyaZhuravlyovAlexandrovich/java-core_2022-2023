package lr5;

    public class Example6 {
        private int min;
        private int max;

        public Example6() {
            this.min = Integer.MAX_VALUE;
            this.max = Integer.MIN_VALUE;
        }

        public void setMinMaxValues(int... values) {
            for (int value : values) {
                if (value < min) {
                    min = value;
                }
                if (value > max) {
                    max = value;
                }
            }
        }

        public void displayMinMaxValues() {
            System.out.println("Min value: " + min);
            System.out.println("Max value: " + max);
        }

        public static void main(String[] args) {
            Example6 values = new Example6();
            values.setMinMaxValues(5, 8);
            values.displayMinMaxValues();

            values.setMinMaxValues(10, 3, 7);
            values.displayMinMaxValues();
        }
    }

