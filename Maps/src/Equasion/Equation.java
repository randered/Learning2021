package Equasion;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import java.util.Arrays;
import java.util.Scanner;

public class Equation {
    public static void main(String[] args) {
        String expression = readExpression();
        System.out.println(EvaluateString.evaluate(expression));
        try {
            int[] numbers = extractNumbers(expression);
            String[] operators = extractOperators(expression);
            int result = calculateExpression(numbers, operators);
            System.out.printf("%s = %d \n", expression, result);
        } catch (Exception ex) {
            System.out.println("Invalid expression!");
        }
    }

    static int[] extractNumbers(String expression) {
        String[] splitResult = expression.split("[\\+\\-\\/\\*]");

        int numbersCount = splitResult.length;
        int[] numbers = new int[numbersCount];

        int currentNumber;
        for (int i = 0; i < numbersCount; i++) {
            currentNumber = Integer.parseInt(splitResult[i]);
            numbers[i] = currentNumber;
        }
        return numbers;
    }

    static String[] extractOperators(String expression) {

        String[] operators = expression.split("[0123456789]+");
        int operatorsCount = operators.length;
        if (operatorsCount > 0) {
            operators = Arrays.copyOfRange(operators, 1, operatorsCount);
        }
        return operators;
    }

    static int calculateExpression(int[] numbers, String[] operators) {
        int result = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            String nextOperator = operators[i - 1];
            int nextNumber = numbers[i];
            if (nextOperator.equals("+")) {
                result += nextNumber;
            } else if (nextOperator.equals("-")) {
                result -= nextNumber;
            }
        }
        return result;
    }

    static String readExpression() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter expression: ");
        String expression = input.nextLine();
        return expression;
    }


}
