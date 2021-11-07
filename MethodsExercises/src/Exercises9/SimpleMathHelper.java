package Exercises9;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class SimpleMathHelper {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        RenderMenu();
    }

    static void ReverseNumber() {
        System.out.println("Въведете число по-голямо от 0:");
        int number;
        do {
            number = Integer.parseInt(scanner.nextLine());
            if (number < 0) {
                System.out.println("Числото е невалидно, тряба да бъде по-голямо от 0!");
            }
        } while (number < 0);

        StringBuilder reversed = new StringBuilder();
        int temp;
        while (number > 0) {
            temp = number % 10;
            reversed.append(temp);
            number = number / 10;
        }
        System.out.println(reversed);
    }

    static void Average() {
        System.out.println("Въведете число или @ за изход");
        Queue<Integer> test = new ArrayDeque<>();
        String input = "";
        int sum = 0;
        int count = 0;

        while (!input.equals("@")) {
            input = scanner.nextLine();
            if (input.equals("@")) {
                continue;
            }
            test.add(Integer.parseInt(input));
        }
        if (test.isEmpty()) {
            System.out.println("Редицата не трябва да е празна!");
            return;
        }
        while (!test.isEmpty()) {
            sum += test.poll();
            count++;
        }
        System.out.println(sum / count);
    }

    static void Equation() {
        // Решава линейното уравнение a * x + b = 0.
        System.out.print("Въведете а: ");
        int a = scanner.nextInt();
        if (a == 0) {
            do {
                System.out.println("Коефициентът a не трябва да е 0.");
                System.out.println("Въведете коефициентът отново: ");
                a = scanner.nextInt();
            } while (a == 0);
        }
        System.out.print("Въведете b: ");
        int b = scanner.nextInt();
        System.out.printf("X = %.2f", (float) -b / a);
    }
    static void RenderMenu(){
        System.out.println("1: Обръща последователността на цифрите на едно число.");
        System.out.println("2: Пресмята средното аритметично на дадена редица");
        System.out.println("3: Решава линейното уравнение a * x + b = 0.");
        System.out.println("Make your choice:");
        int choice = Integer.parseInt(scanner.nextLine());

        switch (choice) {
            case 1 -> ReverseNumber();
            case 2 -> Average();
            case 3 -> Equation();
            default -> {
                System.out.println("Invalid Input");
                RenderMenu();
            }
        }
    }
}
