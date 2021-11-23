package com.company.Func;

import com.company.FileMng.FileFunc;
import com.company.Users.User;

import java.util.ArrayList;
import java.util.List;

public class UserFunctions {
    final static String filePath = "D:\\SelfTrainingGenericSoft\\Angel\\REpository1-master\\src\\com\\company\\FileMng\\userFile.json";
    static FileFunc file;
    private List<User> userList = new ArrayList<>();
    List<User> usersFromFile;

    public UserFunctions() {
        file = new FileFunc();
        usersFromFile = file.readUserFile(filePath);
        if (usersFromFile == null) {
            createAdmin();
        } else {
            userList = usersFromFile;
        }
        writeToFile();
    }


    public boolean removeUser(String username) {
        if(username.equals("admin")){
            System.out.println("Admin Cannot be deleted!");
            return false;
        }
        if (userList.removeIf(user -> user.getUserName().equals(username))) {
            writeToFile();
            System.out.printf("User %s removed successfully!\n\r", username);
            return true;
        }
        System.out.println("User doesn't exist!");
        return false;
    }

    public boolean addUser(String username, String password) {
        for (User user : usersFromFile) {
            if (user.getUserName().equals(username)) {
                System.out.println("User already exist! ");
                return false;
            }
        }
        if (userList.size() == 11) {
            System.out.println("Maximum number of Users reached ! ");
            return false;
        } else {
            userList.add(new User(username, password));
            writeToFile();
            return true;
        }

    }

    public void listAllMembers() {
        System.out.println(userList.toString());
    }

    public void createAdmin() {
        userList.add(new User("admin", "admin"));
    }

    private void writeToFile() {
        file.writeToFile(filePath, userList);
    }
}
