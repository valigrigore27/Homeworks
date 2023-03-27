package org.example;

import java.util.Scanner;

public class AddCommand implements Command {
    private final Catalog catalog;

    public AddCommand(Catalog catalog) {
        this.catalog = catalog;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter document id: ");
        try {
            int id = Integer.parseInt(scanner.nextLine());

            System.out.println("Enter document name: ");
            String name = scanner.nextLine();
            String path="C:\\Users\\Tuf\\OneDrive\\Desktop";
            Document document = new Document(name, id, path);
            catalog.add(document);
        } catch (NumberFormatException e) {
            System.err.println("YOUR ID SHOULD BE AN INTEGER!!");
        }


    }
}
