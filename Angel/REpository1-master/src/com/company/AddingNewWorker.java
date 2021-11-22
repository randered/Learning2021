package com.company;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;


public class AddingNewWorker extends Admin {
    List<Worker> workerList = new ArrayList<>(10);
    Admin admin = new Admin();
    ReplacingExistingWorker replacingExistingWorker = new ReplacingExistingWorker();

    protected void addNewWorker(Scanner input) throws Exception {
        //проверка дали има достатъчно място - да
        // проверка дали вече същестува - да
        //създаване на име и парола. Записване в съответните листове - да
        System.out.println("The current number of workers is: " + workerList.size());
        if (workerList.size() >= 10) {
            System.out.println("Sorry but we reached our capacity of workers. Would you like to replace someone.");
            //направи логика за замяна на елемент от листовете - да
            System.out.println("Do you want to replace someone of the workers?");
            String ans = input.nextLine();
            String ansLowerCase = ans.toLowerCase(Locale.ROOT);

            if (ansLowerCase.equals("yes")) {
                replacingExistingWorker.replace(input);
            } else if (ansLowerCase.equals("no")) {
                //измисли на къде трябва да продължава оттук. Дали да свършва или да дава възможност между изход и началото
            } else {
                throw new Exception("Invalid input!");
            }
        } else {
            System.out.print("Please enter the name ID of the new worker here: ");
            String nickname = input.nextLine();

            if (workerList.contains(nickname)) {
                throw new Exception("This user name is already taken! Please insert new nickname.");
                //провери дали връща на същото място ил трябва да допълня!!!
            } else {
                System.out.println("And choose an unique password for this user here: ");
                String password = input.nextLine();
                Worker worker = new Worker(nickname, password);
                workerList.add(worker);
                System.out.println("Worker " + nickname + " has been successfully added!");
                System.out.println("The work ID of " + nickname + " is: " + workerList.indexOf(worker));
                Gson gson = new GsonBuilder().create();
                JsonArray jsonArray = gson.toJsonTree(workerList).getAsJsonArray();
                FileWriter file = new FileWriter("GsonFile.json");
                file.write(String.valueOf(jsonArray));
                file.flush();
                admin.menu(input);

            }
        }
    }
}
