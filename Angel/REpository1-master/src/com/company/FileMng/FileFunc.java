package com.company.FileMng;

import com.company.Users.Client;
import com.company.Users.User;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileFunc {
    static Gson gson = new Gson();
    static String json;

    public void writeToFile(String filePath, Object data) {
        // convert java object to JSON format,
        // and returned as JSON formatted string
        json = gson.toJson(data);
        try {
            //write converted json data to a file named "see filePath"
            FileWriter writer = new FileWriter(filePath);
            writer.write(json);
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(json);

//        new Gson().fromJson(json, (Type) data.getClass());
    }

    public List<User> readUserFile(String filePath) {
        try {
            Reader reader = Files.newBufferedReader(Paths.get(filePath));
            List<User> users = new Gson().fromJson(reader, new TypeToken<ArrayList<User>>() {
            }.getType());
            reader.close();
            return users;

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
    public List<Client> readClientFile(String filePath) {
        try {
            Reader reader = Files.newBufferedReader(Paths.get(filePath));
            List<Client> users = new Gson().fromJson(reader, new TypeToken<ArrayList<Client>>() {
            }.getType());
            reader.close();
            return users;

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

}