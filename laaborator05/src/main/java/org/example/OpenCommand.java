package org.example;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class OpenCommand implements Command {
    private Scanner scanner;
    private Catalog catalog;

    public OpenCommand(Scanner scanner, Catalog catalog) {
        this.scanner = scanner;
        this.catalog = catalog;
    }

    @Override
    public void execute() {
        System.out.println("Enter document ID: ");
        int id = Integer.parseInt(scanner.nextLine());

        Document document = catalog.findDocumentById(id);
        if (document == null) {
            System.out.println("Document not found.");
        }


    }
}
