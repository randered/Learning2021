package com.company.Users;

import java.time.LocalDate;
import java.util.Date;

public class Client {
    private String name;
    private String projectName;
    private Date expiringDate;

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public Date getExpiringDate() {
        return expiringDate;
    }

    public void setExpiringDate(Date expiringDate) {this.expiringDate = expiringDate;}
}
