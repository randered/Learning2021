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
        usersFromFile = file.readFile(filePath);
        if (usersFromFile == null) {
            createAdmin();
        } else {
            userList = usersFromFile;
        }
        writeToFile();
    }


    public boolean removeUser(String username) {
        return userList.removeIf(user -> user.getUserName().equals(username));
    }

    public boolean addUser(String username, String password) {
        if (userList.size() == 11) {
            System.out.println("Maximum number of Users reached ! ");
            return false;
        }
        for (User user : userList) {
            if (user.getUserName().equals(username)) {
                System.out.println("User already exist! ");
                return false;
            }
        }
        userList.add(new User(username, password));
        return true;
    }
    public void listAllMembers(){
        System.out.println(userList.toString());
    }

    public void createAdmin() {
        userList.add(new User("admin", "admin"));
    }

    private void writeToFile() {
        file.writeToFile(filePath, userList);
    }
}
