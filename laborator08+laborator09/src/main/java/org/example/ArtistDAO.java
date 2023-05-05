package org.example;
import java.sql.*;

public class ArtistDAO {

    public void create(String name) throws SQLException {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/laborator08", "root", "root");
        try (PreparedStatement pstmt = con.prepareStatement(
                "insert into albums (id, name) values (?)")) {
            pstmt.setString(1, name);
            pstmt.executeUpdate();
        }
    }
    public void delete(String name) throws SQLException {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/laborator08", "root", "root");
        try (PreparedStatement pstmt = con.prepareStatement(
                "delete from artists where name=?")) {
            pstmt.setString(1, name);
            int rowsDeleted = pstmt.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("Deleted artist " + name + " from database");
            } else {
                System.out.println("Artist " + name + " not found in database");
            }
        }
    }


    public Integer findByName(String name) throws SQLException {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/laborator08", "root", "root");
        try (Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(
                     "select id from artists where name='" + name + "'")) {
            return rs.next() ? rs.getInt(1) : null;
        }
    }

    public String findById(int id) throws SQLException {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/laborator08", "root", "root");
        try (Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(
                     "select name from artists where id='" + id + "'")) {
            return rs.next() ? rs.getString("name") : null;
        }
    }
}

