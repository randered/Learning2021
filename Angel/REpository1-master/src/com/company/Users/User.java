package com.company.Users;

import java.util.HashMap;

public class User {
    private String userName;
    private String password;
    private HashMap<String, Double> projectWorkedOn; // Think about something else
    // ToDo добавя проекта по който е работил, ако вече съществува прибавя само времето.

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public HashMap<String, Double> getProjectWorkedOn() {
        return projectWorkedOn;
    }

    public void setProjectWorkedOn(HashMap<String, Double> projectWorkedOn) {
        this.projectWorkedOn = projectWorkedOn;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", projectWorkedOn=" + projectWorkedOn +
                '}';
    }
}
