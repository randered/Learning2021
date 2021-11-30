package BinaryTreeImpl;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileWriter;
import java.io.IOException;


public class Main {
    static BSTNode mainRoot;

    public static void main(String[] args) throws IOException {
        Gson gson = new GsonBuilder().create();
        FileWriter fileWriter = new FileWriter("CollectionSaved.json");
        BinaryTreeImpl.insert(mainRoot,15);
        BinaryTreeImpl.insert(mainRoot,10);
        BinaryTreeImpl.insert(mainRoot,20);
        BinaryTreeImpl.insert(mainRoot,25);
        BinaryTreeImpl.insert(mainRoot,8);
        BinaryTreeImpl.insert(mainRoot,12);
        gson.toJson(mainRoot, fileWriter);
        BinaryTreeImpl.checkIfExist(mainRoot,12);
        fileWriter.close();

    }
}
