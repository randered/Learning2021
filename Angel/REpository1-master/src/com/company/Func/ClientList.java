package com.company.Func;

import com.company.FileMng.FileFunc;
import com.company.Users.Client;
import com.company.Users.User;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ClientList {
    private static final String filePath = "D:\\SelfTrainingGenericSoft\\Angel\\REpository1-master\\src\\com\\company\\FileMng\\clientFile.json";
    private static FileFunc file = new FileFunc();
    private static List<Client> clientsFile;
    List<Client> clientsFromFile;


    public ClientList() {
        file = new FileFunc();
        clientsFromFile = file.readClientFile(filePath);
        if (clientsFromFile == null) {
            clientsFile = new ArrayList<>();
        } else {
            clientsFile = clientsFromFile;
        }
        writeToClientsFile();
    }

    public void addClient(String name, String projectName, Date expiryDate) {
        if (checkFile()) {
            for (Client client:clientsFile) {
                if(client.getProjectName().equals(projectName)){
                    System.out.println("Project Already Exist");
                    return;
                }
            }
            Client client = new Client(name, projectName, expiryDate);
            clientsFile.add(client);
            writeToClientsFile();
        }
    }

    private boolean checkFile() {
        if (clientsFile == null) {
            clientsFile = new ArrayList<>();
        } else {
            clientsFile = file.readClientFile(filePath);
        }
        return true;
    }

    private void writeToClientsFile() {
        file.writeToFile(filePath, clientsFile);
    }

    public void printClients() {
        System.out.println(clientsFile.toString());
    }
}
