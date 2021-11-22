package com.company;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;

import java.io.FileWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class AddingNewClient extends Admin {
    List<Client> clientList = new ArrayList<>(10);
    Admin admin = new Admin();
    ReplacingExistingClient replacingExistingClient = new ReplacingExistingClient();

    protected void addNewClient(Scanner input) throws Exception {
        //проверка дали има достатъчно място - да
        //да провери дали вече съществува - да
        //създава нов клиент и го записва в лист - да

        System.out.println("The current number of clients is: " + clientList.size());
        if (clientList.size() >= 10) {
            System.out.println("Sorry but we have reached the capacity of clients. Would you like to replace someone: ");
            System.out.println("Would you like to replace existing client?");
            String ans = input.nextLine();
            String ansLowerCase = ans.toLowerCase(Locale.ROOT);

            if (ansLowerCase.equals("yes")) {
                replacingExistingClient.replace(input);
            } else if (ansLowerCase.equals("no")) {
                //измисли на къде трябва да продължава оттук. Дали да свършва или да дава възможност между изход и началото
            } else {
                throw new Exception("Invalid input!");
            }
        } else {
            System.out.print("Please enter the name ID of the client here: ");
            String name = input.nextLine();

            if (clientList.contains(name)) {
                throw new Exception("This client name is already taken! Please enter new name for this client!");
                //провери дали връща на същото място ил трябва да допълня!!!
            } else {
                System.out.print("Please enter the name of the project here: ");
                String projectName = input.nextLine();
                System.out.println("Please enter the ending date for this project: " + projectName + " in format 'dd/MM/yyyy'.");
                String dateOfExpire = input.nextLine();

                try {
                    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                    LocalDate finalDate = LocalDate.parse(dateOfExpire, dtf);
                    Client client = new Client(name, projectName, finalDate);
                    clientList.add(client);
                    System.out.println("This client " + name + " has client ID: " + clientList.indexOf(client));
                    Gson gson = new GsonBuilder().create();
                    JsonArray jsonArray = gson.toJsonTree(clientList).getAsJsonArray();
                    FileWriter file = new FileWriter("GsonFile.json");
                    file.write(String.valueOf(jsonArray));
                    file.flush();
                    admin.menu(input);
                } catch (Exception e) {
                    new Exception("The date format is not correct!");
                    //провери къде те връща оттук!!!!

                }
            }
        }
    }
}