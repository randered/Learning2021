package AllCardsInDeck;

public class AllCards {
    public static void main(String[] args) {

        for (int cardColor = 0; cardColor < 4; cardColor++) {
            for (int cardValue = 0; cardValue < 13; cardValue++) {
                System.out.printf("%c%s ", ColorValues()[cardColor], CardValues()[cardValue]);
            }
            System.out.println();
        }
    }

    public static String[] CardValues() {
        return new String[]{
                "2",
                "3",
                "4",
                "5",
                "6",
                "7",
                "8",
                "9",
                "10",
                "J",
                "Q",
                "K",
                "A"
        };
    }
    public static char[] ColorValues() {
        return new char[]{
                '\u2663',
                '\u2666',
                '\u2665',
                '\u2660',
        };
    }
}
