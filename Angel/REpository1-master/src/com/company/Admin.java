package com.company;

import java.util.Scanner;

public class Admin extends Login {
    // да може да добавя нови клиенти и служители, които имена и пароли да се съдържат в съответните листове - да

    public void menu(Scanner input) throws Exception {
        AddingNewWorker worked = new AddingNewWorker();
        AddingNewClient client = new AddingNewClient();
        WorkerStatistics stats = new WorkerStatistics();

        System.out.println("Hello and welcome to admin.");
        System.out.println("What would you like to do: ");
        System.out.println("1 - add new worker");
        System.out.println("2 - add new client");
        System.out.println("3 - check worker statistics");
        System.out.print("Here: ");
        byte adminMenuChoosing = input.nextByte();

        switch (adminMenuChoosing) {
            case 1 -> worked.addNewWorker(input);
            case 2 -> client.addNewClient(input);
            case 3 -> stats.menu(input);
            default -> throw new Exception("Invalid input!");
        }
    }
    //да се направи метод, в който да търси по дадена седмица и да вижда статистики на служителите
}
