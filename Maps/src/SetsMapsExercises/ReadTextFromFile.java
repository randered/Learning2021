package SetsMapsExercises;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class ReadTextFromFile {
    public static void main(String[] args) throws FileNotFoundException {
        File outputFile = new File("outputFile.txt");
        Scanner scanner = new Scanner(new File("D:\\SelfTrainingGenericSoft\\Maps\\src\\SetsMapsExercises\\text.txt"));
        while (scanner.hasNextLine()) {
            String[] readRow = scanner.nextLine().split("\\s+");
            if (readRow[2] != null) {
                String[] email = readRow[2].split("[@]");
                if (testMatchUserName(email[0])) {
                    String[] domain = email[1].split("[.]");
                    if (testMatchDomain(domain[0])) {
                        if (domain[1].length() < 2 || domain[1].length() > 4) {
                            continue;
                        }
                        if (testMatchDomain(domain[1])) {
                            try {
                                FileWriter myWriter = new FileWriter("outputFile.txt");
                                myWriter.write(Arrays.toString(readRow) + System.lineSeparator());
                                System.out.println(Arrays.toString(readRow) + "\n\r");
                            } catch (IOException e) {
                                System.out.println("Some Error upsi ! ");
                                e.printStackTrace();
                            }
                        }
                    }
                }
            }
        }

        scanner.close();

    }

    public static boolean testMatchUserName(String s) {
        return s.matches("\\w+$");
    }

    public static boolean testMatchDomain(String s) {
        return s.matches("[a-z]+");
    }

}
