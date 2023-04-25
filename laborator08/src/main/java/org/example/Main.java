package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {

    try {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/laborator08", "root", "root");

        Statement statement = connection.createStatement();

        ResultSet resultSet = statement.executeQuery("select * from albums");

        while(resultSet.next()){
            System.out.println(resultSet.getString("title"));
        }
    }
    catch (Exception e){
        e.printStackTrace();
    }
    }
}