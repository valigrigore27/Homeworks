package org.example;

import java.sql.*;

public class GenreDAO {

    public void create(int id, String name) throws SQLException {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/laborator08", "root", "root");
        try (PreparedStatement pstmt = con.prepareStatement("insert into genre (id, name) values (?, ?)")) {
            pstmt.setInt(1, id);
            pstmt.setString(2, name);
            pstmt.executeUpdate();
        }
    }

    public void delete(String name) throws SQLException {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/laborator08", "root", "root");
        try (PreparedStatement pstmt = con.prepareStatement("delete from genre where name=?")) {
            pstmt.setString(1, name);
            int rowsDeleted = pstmt.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("Deleted genre " + name + " from database");
            } else {
                System.out.println("Genre " + name + " not found in database");
            }
        }
    }


    public Integer findByName(String name) throws SQLException {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/laborator08", "root", "root");
        try (Statement stmt = con.createStatement(); ResultSet rs = stmt.executeQuery("select id from genre where name='" + name + "'")) {
            return rs.next() ? rs.getInt(1) : null;
        }
    }

    public String findById(int id) throws SQLException {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/laborator08", "root", "root");
        try (Statement stmt = con.createStatement(); ResultSet rs = stmt.executeQuery("select name from genre where id='" + id + "'")) {
            return rs.next() ? rs.getString("name") : null;
        }
    }
}

