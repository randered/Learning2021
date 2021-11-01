package RandomFibonachiAndMore;

import java.util.Random;
import java.util.Scanner;

public class RandomAndMore {
    public static void main(String[] args) {
        // 16. Напишете програма, която по дадено число N отпечатва случайно число между 1 и N.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Printing random number between 1 and your entered number");
        System.out.print("Enter your number: ");
        int number = scanner.nextInt();
        System.out.println(new Random().nextInt(number) + 1);

        // 5.    Напишете програма, която чете от конзолата числото N и отпечатва сумата на първите
        // N члена от редицата на Фибоначи: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, ...
        System.out.println("Enter Number for Fibonacci: ");
        int fibonacci = scanner.nextInt();
        for (int i = 0; i <= fibonacci; i++) {
            System.out.print(getFibonacci(i) + ", ");
        }
        System.out.println();

        // 6.    Напишете програма, която пресмята N!/K! за дадени N и K (1<K<N).
        System.out.println("N must be BIGGER than K");
        System.out.println("Enter Number for !N/!K : ");
        int factorialN = scanner.nextInt();
        int factorialK = scanner.nextInt();
        if(factorialN<=factorialK){
            System.out.println("You have entered bad combination");
        }else{
            System.out.println(getFactorial(factorialN) / getFactorial(factorialK));
        }

    }

    public static long getFactorial(int n) {
        long result = 1;
        for (int i = n; i > 1; i--) {
            result *= i;
        }
        return result;
    }

    public static int getFibonacci(int n) {

        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        int first = 0;
        int second = 1;
        int nth = 1;

        for (int i = 2; i <= n; i++) {
            nth = first + second;
            first = second;
            second = nth;
        }
        return nth;
    }
}
