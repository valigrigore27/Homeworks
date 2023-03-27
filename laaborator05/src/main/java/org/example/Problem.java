package org.example;

import java.util.Scanner;

public class Problem {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Catalog catalog = new Catalog();
        while (true) {
            System.out.println("Enter a command (add, list, quit): ");
            String command = scanner.nextLine();

            if (command.equals("add")) {
                AddCommand addCommand = new AddCommand(catalog);
                addCommand.execute();
            } else if (command.equals("list")) {
                ListCommand listCommand = new ListCommand(catalog);
                listCommand.execute();
            } else if (command.equals("quit")) {
                break;
            }
        }
    }
}