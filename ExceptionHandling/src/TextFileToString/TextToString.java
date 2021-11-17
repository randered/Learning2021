package TextFileToString;

import java.io.*;

public class TextToString {
    public static void main(String[] args) throws IOException {
        boolean error = false;
        InputStreamReader sr = null;
        BufferedReader br = null;
        try {
            sr = new InputStreamReader(new FileInputStream("D:\\SelfTrainingGenericSoft\\java.gitignore4"));
            br = new BufferedReader(sr);
            String line = br.readLine();
            System.out.println(line);
        } catch (IOException e) {
            System.out.println("Cannot Read the text.");
            error = true;
        } finally {
            assert sr != null;
            sr.close();
            assert br != null;
            br.close();
            if (error)
                System.out.println("Please provide a valid text file.");

        }
    }
}
