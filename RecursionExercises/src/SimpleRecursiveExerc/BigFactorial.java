package SimpleRecursiveExerc;

import java.math.BigInteger;
import java.util.Scanner;

public class BigFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        BigInteger result = new BigInteger(String.valueOf(1));
        for (int j = 1; j < number; j++) {
            result = result.multiply(BigInteger.valueOf(Integer.parseInt(String.valueOf(j))));
        }
        System.out.println(result);
    }
}
