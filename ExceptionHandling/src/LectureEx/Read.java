package LectureEx;

import java.io.*;

abstract class Read {
    static void readFile(String fileName) throws IOException {
        FileInputStream fis = null;
        BufferedReader in = null;
        try {
            fis = new FileInputStream(fileName);
            in = new BufferedReader(new InputStreamReader(fis));
            String temp = null;
            while ((temp = in.readLine()) != null) {
                System.out.println(temp);
            }
        } catch (FileNotFoundException e) {
            System.out.println("The file \"" + fileName
                    + "\" does not exist! Unable to read it.");
        } finally {
            if (in != null) {
                in.close();
            }
            if (fis != null) {
                fis.close();
            }
        }
    }
}