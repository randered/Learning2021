package WordToIndexFromAlphabet;

import java.util.*;

public class WordToIndex {
    public static void main(String[] args) {

        int[] array = {18, 3, 4, 7, 10, 9, 23, 25, 0, 1};
        System.out.println(CalculateAverageOfTheOdd(array));
        System.out.println(Arrays.toString(SortOdd(array)));

    }

    public static int CalculateAverageOfTheOdd(int[] arr) {
        int sum = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1) {
                sum += arr[i];
                count++;
            }
        }
        return sum / count;
    }

    public static int[] SortOdd(int[] array) {
        int minIndex = 0;
        int temp = 0;
        for (int p = 0; p < array.length; p++) {
            if(array[p]%2==0){
                continue;
            }
            minIndex = p;
            for (int j = p + 1; j < array.length; j++) {
                if(array[j]%2==0){
                    continue;
                }
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != p) {
                temp = array[p];
                array[p] = array[minIndex];
                array[minIndex] = temp;
            }
        }
        return array;
    }
}


//        //12. Да се напише програма, която създава масив с всички букви от латинската азбука.
//        // Да се даде възможност на потребител да въвежда дума от конзолата и в резултат да се извеждат индексите на буквите от думата.
//        char[] alphabet = new char[26];
//        for (int i = 0; i < alphabet.length; i++) {
//            alphabet[i] = (char) (97 + i);
//        }
//        System.out.println(Arrays.toString(alphabet));
//        String word = scanner.nextLine().toLowerCase();
//        for (int w = 0; w < word.length(); w++) {
//            for (int a = 0; a < alphabet.length; a++) {
//                if (word.charAt(w) == alphabet[a]) {
//                    System.out.print((int) alphabet[a] + " ");
//                }
//            }
//        }

