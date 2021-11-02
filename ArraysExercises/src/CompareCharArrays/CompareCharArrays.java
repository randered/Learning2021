package CompareCharArrays;

import java.util.Scanner;

public class CompareCharArrays {
    public static void main(String[] args) {
        //3.    Да се напише програма, която сравнява два масива от тип char лексикографски
        // (буква по буква) и проверява кой от двата е по-рано в лексикографската подредба.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please Enter the size of the 1st array:");
        int firstArraySize = scanner.nextInt();

        System.out.println("Please Enter the size of the 2nd array:");
        int secondArraySize = scanner.nextInt();

        char[] firstArray = new char[firstArraySize];
        char[] secondArray = new char[secondArraySize];

        System.out.println("Fill the first array:");
        for (int i = 0; i < firstArraySize; i++) {
            firstArray[i] = scanner.next().charAt(0);
        }
        System.out.println("Fill the second array:");

        for (int i = 0; i < secondArraySize; i++) {
            secondArray[i] = scanner.next().charAt(0);
        }

        if (firstArraySize == secondArraySize) {
            for (int i = 0; i < firstArray.length; i++) {
                if (firstArray[i] < secondArray[i]) {
                    System.out.println("First array is lexicographical winner ! ");
                    break;
                } else if (firstArray[i] > secondArray[i]) {
                    System.out.println("Second array is lexicographical winner ! ");
                    break;
                }
            }
            System.out.println("Arrays are equal lexicographically");
        }
        System.out.println("Arrays cannot be compared.");
    }
}
