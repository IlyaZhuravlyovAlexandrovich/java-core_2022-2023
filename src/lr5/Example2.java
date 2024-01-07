package lr5;

class CharacterRange {
    private char start;
    private char end;

    public CharacterRange(char start, char end) {
        this.start = start;
        this.end = end;
    }

    public void printCharactersInRange() {
        for (char c = start; c <= end; c++) {
            System.out.print(c + " ");
        }
        System.out.println();
    }
}

public class Example2 {
    public static void main(String[] args) {
        CharacterRange range = new CharacterRange('A', 'D');
        range.printCharactersInRange();
    }
}

