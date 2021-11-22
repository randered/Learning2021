package com.company;

public class Worker extends Login {
    protected String userName;
    protected String password;


    public Worker(String name, String password) {
        this.userName = name;
        this.password = password;
    }


    public void menu() {

    }

    public void createProtocol() {
        // създава протокол, който се въвежа по кoй проект е работил и по колко време е работил
        // ще трябва това да се изкарва в статистиките в админ и да се изписва
        // трябва да съответства с работника

    }
}