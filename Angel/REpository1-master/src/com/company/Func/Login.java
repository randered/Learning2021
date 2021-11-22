package com.company.Func;

import com.company.Users.User;

import java.util.List;

public abstract class Login {
    private static int state;

    public static int login(List<User> userList, String username, String password) {
        if (username.equals("admin") && password.equals("admin")) {
            state = 1;
        }
        for (User user : userList) {
            if (username.equals(user.getUserName()) && password.equals(user.getPassword())) {
               state = -1;
            }
        }
        return state;
    }
}
