package com.company.Users;

import java.util.Date;

public class Client {
    final private String name;
    final private String projectName;
    final private Date expiringDate;

    public Client(String name, String projectName, Date expiringDate) {
        this.name = name;
        this.projectName = projectName;
        this.expiringDate = expiringDate;
    }

    public String getName() {
        return name;
    }

    public String getProjectName() {
        return projectName;
    }

    public Date getExpiringDate() {
        return expiringDate;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", projectName='" + projectName + '\'' +
                ", expiringDate=" + expiringDate +
                '}' + "\n\r";
    }
}
