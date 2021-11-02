package SameNumbersInARow;

import java.util.ArrayList;
import java.util.Scanner;

public class SameNumbersRow {
    public static void main(String[] args) {
        //4.    Напишете програма, която намира максималната редица от еднакви елементи в масив.
        // Пример: {2, 1, 1, 2, 3, 3, 2, 2, 2, 1} à {2, 2, 2}.

        Scanner scanner = new Scanner(System.in);
        int maxSequence = 0;
        int tempSequence = 0;
        int number = 0;

        System.out.println("Please Enter the size of the array:");
        int arrayLength = scanner.nextInt();
        int[] array = new int[arrayLength];

        System.out.println("Fill the array:");
        for (int i = 0; i < arrayLength; i++) {
            array[i] = scanner.nextInt();
        }

        for (int i = 0; i < arrayLength - 1; i++) {
            if (array[i] == array[i + 1]) {
                tempSequence += 1;
            } else tempSequence = 0;
            if (tempSequence > maxSequence) {
                maxSequence = tempSequence;
                number = array[i];
            }
        }

        for (int i = 0; i <= maxSequence; i++) {
            System.out.print(number + ", ");
        }
    }
}
