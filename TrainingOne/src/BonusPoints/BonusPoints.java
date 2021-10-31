package BonusPoints;

import java.util.Scanner;

public class BonusPoints {
    /*
    зад 8. Напишете програма, която прилага бонус точки към дадени точки в интервала [1..9]
    чрез прилагане на следните правила:
-     Ако точките са между 1 и 3, програмата ги умножава по 10.
-     Ако точките са между 4 и 6, ги умножава по 100.
-     Ако точките са между 7 и 9, ги умножава по 1000.
-     Ако точките са 0 или повече от 9, се отпечатва съобщение за грешка.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int points = Integer.parseInt(scanner.nextLine());

        switch (points) {
            case 1, 2, 3 -> System.out.println(points * 10);
            case 4, 5, 6 -> System.out.println(points * 100);
            case 7, 8, 9 -> System.out.println(points * 1000);
            default -> System.out.println("Invalid Points!");
        }
    }
}
