package SelectionSortAlg;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        // 7.    Сортиране на масив означава да подредим елементите му в нарастващ (намаляващ) ред.
        // Напишете програма, която сортира масив. Да се използва алгоритъма "Selection sort".

       // Scanner scanner = new Scanner(System.in);
//        System.out.println("Please Enter the size of the 1st array:");
//        int ArraySize = scanner.nextInt();
//        System.out.println("Fill the first array:");
////        int[] array = new int[ArraySize];
////        for (int i = 0; i < ArraySize; i++) {
////            array[i] = scanner.next().charAt(0);
////        }
        int minIndex;
        int temp;
        int[] array = {4, 3, 5, 676, 2, 1, -3, 5, 8, 99, 5};

        for (int p = 0; p < array.length; p++) {
            minIndex = p;
            for (int j = p + 1; j < array.length; j++) {
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
        System.out.println(Arrays.toString(array));
    }
}
