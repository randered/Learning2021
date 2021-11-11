package Fibonaci;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("n = ");
        int n = input.nextInt();
        long result = fib(n);
        long resultIter = fibIter(n);
        System.out.printf("F%d = %d%n", n, result);
        System.out.printf("F%d = %d%n", n, resultIter);
    }

    public static long fib(int n) {
        if (n <= 2) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }

    public static long fibIter(int n) {
        int ppNumber = 0;
        int pNumber = 0;
        int currentNumber = 1;
        while (n > 1) {
            ppNumber = pNumber;
            pNumber = currentNumber;
            currentNumber = ppNumber + pNumber;
            n--;
        }
        return currentNumber;
    }
}