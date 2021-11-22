package com.company;

import java.util.Scanner;


public class Login {
    //прави се проверка като какъв искаш да се логнеш : админ или служител - да
    //в main
    //служител

    public void adminLogin(String password, Scanner inpot) throws Exception {
        Admin admin = new Admin();

        if (password.equals("аdmin")) {
            System.out.println("Access granted!");
            admin.menu(inpot);
        } else {
            throw new Exception("Access denied! Invalid password.");
        }
    }

    public void workerLogin(String nickname, String password) throws Exception {
        AddingNewWorker workerList = new AddingNewWorker();
        Worker worker = new Worker(nickname, password);

        if (workerList.workerList.contains(nickname)) {
            if (workerList.workerList.contains(password)) {
                System.out.println("Access granted.");
                System.out.println("The work ID number of: " + nickname + " is: " + workerList.workerList.indexOf(nickname));
                worker.menu();
            } else {
                throw new Exception("Access denied! Invalid password.");
            }
        } else {
            throw new Exception("Access denied! Invalid nickname");
        }
    }
}