package PrintRandomNumber;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber {
    public static void main(String[] args) {
        // 16. Напишете програма, която по дадено число N отпечатва случайно число между 1 и N.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Printing random number between 1 and your entered number");
        System.out.print("Enter your number: ");
        int number = scanner.nextInt();
        System.out.println(new Random().nextInt(number)+1);

    }
}
