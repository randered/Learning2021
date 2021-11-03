package MostOccurrencesOfANumber;

public class MostOccurrences {
    public static void main(String[] args) {
        //8.    Напишете програма, която намира най-често срещания елемент в масив. Пример: {4, 1, 1, 4, 2, 3, 4, 4, 1, 2, 4, 9, 3} à 4 (5 times).

        // Scanner scanner = new Scanner(System.in);
//        System.out.println("Please Enter the size of the 1st array:");
//        int ArraySize = scanner.nextInt();
//        System.out.println("Fill the first array:");
////        int[] array = new int[ArraySize];
////        for (int i = 0; i < ArraySize; i++) {
////            array[i] = scanner.next().charAt(0);
////        }
        int repeatingNumber = 0;
        int count = 0;
        int tempCount = 0;

        int[] array = {4, 3, 5, 676, 2, 1, -3, 5, 8, 99, 5};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    tempCount++;
                }
                if (tempCount > count) {
                    repeatingNumber = array[i];
                    count = tempCount;
                }
            }
            tempCount = 0;
        }
        System.out.printf("Number \"%d\" is appearing %d times", repeatingNumber, count);
    }
}
