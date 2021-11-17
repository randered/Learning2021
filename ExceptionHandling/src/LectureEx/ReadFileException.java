package LectureEx;
import java.io.IOException;

public class ReadFileException {
    public static void main(String[] args){
        String path = "D:\\SelfTrainingGenericSoft\\java.gitignore6";
        try {
            Read.readFile(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}

