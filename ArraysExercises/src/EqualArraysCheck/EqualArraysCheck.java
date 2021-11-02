package EqualArraysCheck;

import java.util.Scanner;

public class EqualArraysCheck {
    public static void main(String[] args) {
        // 2.    Да се напише програма, която чете два масива от конзолата и проверява дали са еднакви.
        /*
        1. Need to know the length of both arrays.
        2. Need to fill the arrays
        3. Comparing and false if there is a difference.
        ** Start with created and pre-filled arrays.
         */
        Scanner scanner = new Scanner(System.in);
        boolean arraysAreEqual = true;

        System.out.println("Please Enter the size of the 1st array:");
        int firstArraySize = scanner.nextInt();
        System.out.println("Please Enter the size of the 2nd array:");
        int secondArraySize = scanner.nextInt();

        int[] firstArray = new int[firstArraySize];
        int[] secondArray = new int[secondArraySize];

        System.out.println("Fill the first array:");
        for (int i = 0; i < firstArraySize; i++) {
            firstArray[i] = scanner.nextInt();
        }
        System.out.println("Fill the second array:");

        for (int i = 0; i < secondArraySize; i++) {
            secondArray[i] = scanner.nextInt();
        }

        if (firstArraySize != secondArraySize) {
            arraysAreEqual = false;
        }
        for (int i = 0; i < firstArray.length; i++) {
            if (firstArray[i] != secondArray[i]) {
                arraysAreEqual = false;
                break;
            }
        }
        System.out.println("Are the Arrays Equal ? - " + arraysAreEqual);
    }
}
