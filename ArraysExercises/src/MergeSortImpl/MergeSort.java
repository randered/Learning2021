package MergeSortImpl;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        // 14. Напишете програма, която сортира целочислен масив по алгоритъма "merge sort".

        int[] toBeMergeSorted = {5, 2, -3, 4, -9, 22, 8875, -13144, 554, 2, 1, 0, -3232, 5, 6, 73, 16};
        MergeRecursion(toBeMergeSorted, toBeMergeSorted.length);
        System.out.println(Arrays.toString(toBeMergeSorted));


    }

    static void MergeRecursion(int[] array, int sizeOfTheArray) {

        if (sizeOfTheArray < 2) {
            return;
        }

        int leftSideSize = sizeOfTheArray / 2;
        int rightSideSize = sizeOfTheArray - leftSideSize;
        int[] leftSide = new int[leftSideSize];
        int[] rightSide = new int[rightSideSize];

        for (int i = 0; i < leftSideSize; i++) {
            leftSide[i] = array[i];
        }
        for (int i = leftSideSize; i < sizeOfTheArray; i++) {
            rightSide[i - leftSideSize] = array[i];
        }
        MergeRecursion(leftSide, leftSideSize);
        MergeRecursion(rightSide, rightSideSize);
        DoMerge(array, leftSide, rightSide, leftSideSize, rightSideSize);
    }

    static void DoMerge(int[] mainArray, int[] leftSideArray, int[] rightSideArray, int leftSize, int rightSize) {
        int leftIndex = 0;
        int rightIndex = 0;
        int mainArrayIndex = 0;
        while (leftIndex < leftSize && rightIndex < rightSize) {
            if (leftSideArray[leftIndex] <= rightSideArray[rightIndex]) {
                mainArray[mainArrayIndex++] = leftSideArray[leftIndex++];
            } else {
                mainArray[mainArrayIndex++] = rightSideArray[rightIndex++];
            }
        }
        while (leftIndex < leftSize) {
            mainArray[mainArrayIndex++] = leftSideArray[leftIndex++];
        }
        while (rightIndex < rightSize) {
            mainArray[mainArrayIndex++] = rightSideArray[rightIndex++];
        }

    }
}
