package BiggestOfThemAll;

import java.util.Scanner;

public class BiggestNumber {
    public static void main(String[] args) {
        /*
        6.    Напишете програма, която намира най-голямото по стойност число измежду дадени 5 числа.
        1. No need to save them into array
        2. Just comparing the numbers which are entered and saving the biggest.
         */

        Scanner scanner = new Scanner(System.in);
        int numberInput;
        int biggestNumber = Integer.MIN_VALUE;

        for (int i = 0; i < 5; i++) {
            numberInput = Integer.parseInt(scanner.nextLine());
            if(numberInput > biggestNumber){
                biggestNumber = numberInput;
            }
        }
        System.out.println("The biggest number is: " + biggestNumber);
    }
}
