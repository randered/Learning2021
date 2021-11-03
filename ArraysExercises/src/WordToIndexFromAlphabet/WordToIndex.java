package WordToIndexFromAlphabet;

import java.util.Arrays;
import java.util.Scanner;

public class WordToIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //12. Да се напише програма, която създава масив с всички букви от латинската азбука.
        // Да се даде възможност на потребител да въвежда дума от конзолата и в резултат да се извеждат индексите на буквите от думата.
        char[] alphabet = new char[26];
        for (int i = 0; i < alphabet.length; i++) {
            alphabet[i] = (char) (97 + i);
        }
        System.out.println(Arrays.toString(alphabet));
        String word = scanner.nextLine();
        for (int w = 0; w < word.length(); w++) {
            for (int a = 0; a < alphabet.length; a++) {
                if (word.charAt(w) == alphabet[a]) {
                    System.out.print((int) alphabet[a] + " ");
                }
            }
        }
    }

}
