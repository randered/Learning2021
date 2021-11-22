package com.company;

import java.util.Scanner;

public class ReplacingExistingWorker extends AddingNewWorker {
    AddingNewWorker worker = new AddingNewWorker();

    protected void replace(Scanner input) {
        System.out.print("Please enter the name of the new worker: ");
        String name = input.nextLine();
        System.out.print("Please enter a password for the new worker: ");
        String password = input.nextLine();
        System.out.print("Please enter the work ID of the worker you want to replace: ");
        byte id = input.nextByte();

        Worker newWorker = new Worker(name, password);
        worker.workerList.set(id, newWorker);
    }
}
