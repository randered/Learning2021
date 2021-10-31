package TransformNumberToWords;

import java.util.Scanner;

public class NumberToWords {
    public static void main(String[] args) {
        final String ANSI_RED = "\u001B[31m";
        final String ANSI_GREEN = "\u001B[32m";
        final String ANSI_RESET = "\u001B[0m";
        /*
         Write a program which takes a number and convert it to words.
         Глава 5. Условни конструкции - зад 9 + зад 4.
         Could be solved with array as well.
        ToDo:
        1. Numbers from 1-19 should have special handling
        2. Should have initialization for 10/20/30...
        3. Same for 100 / 200 / 300 ...
        4. Number > 100 = > % 100 ,  number % 10...
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println(ANSI_RED + "Enter a number between 0 and 999:" + ANSI_RESET);
        int inputNumber = Integer.parseInt(scanner.nextLine());

        if (ValidNumber(inputNumber)) {
            String result = NumToWord(inputNumber);
            System.out.println(ANSI_GREEN + result.substring(0, 1).toUpperCase() + result.substring(1) + ANSI_RESET);
            inputNumber = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("That's the End, you have entered invalid number :(");
    }

    public static String NumToWord(int number) {
        if (number >= 100) {
            return AboveOrEqualToHundred(number);
        } else if (number >= 20) {
            return AboveOrEqualToTwenty(number);
        }
        return GetZeroToNineteen()[number];
    }

    public static String[] GetHundreds() {
        return new String[]{
                "сто",
                "двеста",
                "триста",
                // милиооонаааа
                "четиристотин",
                "петстотин",
                "шестотин",
                "седемстотин",
                "осемстотин",
                "деветстотин"
        };
    }

    public static String[] GetTens() {
        return new String[]{
                "десет",
                "двадесет",
                "тридесет",
                "четиредесет",
                "пийсе",
                "шестдесет",
                "седемдесет",
                "осемдесет",
                "деведесет"
        };
    }

    public static String[] GetZeroToNineteen() {
        return new String[]{
                "нула",
                "едно",
                "две",
                "три",
                "четири",
                "пет",
                "шест",
                "седем",
                "осем",
                "девет",
                "десет",
                "единадесет",
                "дванадесет",
                "тринадесет",
                "четиринадесет",
                "петнаЙсе",
                "шестнадесет",
                "седемнадесет",
                "осемнадесет",
                "деветнадесет"
        };
    }

    static String AboveOrEqualToHundred(int number) {
        String wordResult;
        if (number % 100 == 0) {
            return GetHundreds()[number / 100 - 1];
        }
        wordResult = GetHundreds()[number / 100 - 1];
        number = number % 100;

        if (number % 10 == 0) {
            return wordResult + " и " + GetTens()[number / 10 - 1];
        }
        wordResult = wordResult + " " + GetTens()[number / 10 - 1];
        number = number % 10;
        return wordResult + " и " + GetZeroToNineteen()[number];
    }

    static String AboveOrEqualToTwenty(int number) {
        String wordResult;
        if (number % 10 == 0) {
            return GetTens()[number / 10 - 1];
        }
        wordResult = GetTens()[number / 10 - 1];
        number = number % 10;
        return wordResult + " и " + GetZeroToNineteen()[number];
    }

    static boolean ValidNumber(int number) {
        return number <= 999 && number >= 0;
    }
}
