package TriangleMathExerc;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        // Напишете програма, която по дадени два катета намира хипотенузата на правоъгълен триъгълник.
        // Реализирайте въвеждане на дължините на катетите от стандартния вход,
        // а за пресмятането на хипотенузата използвайте методи на класа Math.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Въведи стана A: ");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.print("Въведи стана B: ");
        int b = Integer.parseInt(scanner.nextLine());
        getHypotenuse(a, b);
    }

    static void getHypotenuse(int a, int b) {
        System.out.printf("Хипотенузата на триъгълника по дадените страни е: %.2f",
                Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)));
    }

}
