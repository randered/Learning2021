package Max3x3Matrix;

import java.util.Random;
import java.util.Scanner;

public class Max3x3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter the number of rows ( more than 3 )");
        int rows = scanner.nextInt();
        if(rows<3){
            System.out.println("Enter a number bigger or equal to 3");
            rows = scanner.nextInt();
            return;
        }

        System.out.println("Please Enter the number of columns ( more than 3 )");
        int columns = scanner.nextInt();
        if(columns<3){
            System.out.println("Enter a number bigger or equal to 3");
            columns = scanner.nextInt();
            return;
        }

        Random random = new Random();
        int[][] matrix = new int[rows][columns];
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < columns; col++) {
                int answer = random.nextInt(10) + 1;
                matrix[row][col] = answer;
            }
        }

        int bestSum = Integer.MIN_VALUE;
        int bestRow = 0;
        int bestCol = 0;

        for (int row = 0; row < matrix.length - 2; row++) {
            for (int col = 0; col < matrix[0].length - 2; col++) {
                int sum = matrix[row][col] + matrix[row][col + 1] + matrix[row][col + 2]
                        + matrix[row + 1][col] + matrix[row + 1][col + 1] + matrix[row + 1][col + 2]
                        + matrix[row + 2][col] + matrix[row + 2][col + 1] + matrix[row + 2][col + 2];
                if (sum > bestSum) {
                    bestSum = sum;
                    bestRow = row;
                    bestCol = col;
                }
            }
        }

        System.out.println("The best platform is:");
        System.out.printf("  %d %d %d%n",
                matrix[bestRow][bestCol],
                matrix[bestRow][bestCol + 1],
                matrix[bestRow][bestCol + 2]);
        System.out.printf("  %d %d %d%n",
                matrix[bestRow + 1][bestCol],
                matrix[bestRow + 1][bestCol + 1],
                matrix[bestRow + 1][bestCol + 2]);
        System.out.printf("  %d %d %d%n",
                matrix[bestRow + 2][bestCol],
                matrix[bestRow + 2][bestCol + 1],
                matrix[bestRow + 2][bestCol + 2]);
        System.out.printf("The maximum sum is: %d%n", bestSum);
    }
}
