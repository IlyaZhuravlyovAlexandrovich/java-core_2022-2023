package lr5;

    public class Example1  {

        private char symbol;

        public void setSymbol(char symbol) {
            this.symbol = symbol;
        }

        public int getCharCode() {
            return (int) symbol;
        }

        public void displaySymbolAndCode() {
            System.out.println("Symbol: " + symbol);
            System.out.println("Character Code: " + getCharCode());
        }

        public static void main(String[] args) {
            Example1  characterSymbol = new Example1 ();

            characterSymbol.setSymbol('A');
            characterSymbol.displaySymbolAndCode();

            characterSymbol.setSymbol('Z');
            characterSymbol.displaySymbolAndCode();
        }
    }
