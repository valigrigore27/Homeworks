package org.example;
import java.sql.*;

public class AlbumsDAO {

    public void create(int id, int release_year, String title, String artist, String genre) throws SQLException {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/laborator08", "root", "root");
        try (PreparedStatement pstmt = con.prepareStatement(
                "insert into albums (id, `release year`, title, artist, genre) values (?, ?, ?, ?, ?)")) {
            pstmt.setInt(1, id);
            pstmt.setInt(2,release_year);
            pstmt.setString(3,title);
            pstmt.setString(4,artist);
            pstmt.setString(5,genre);
            pstmt.executeUpdate();
        }
    }
    public void delete(int id) throws SQLException {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/laborator08", "root", "root");
        try (PreparedStatement pstmt = con.prepareStatement(
                "delete from artists where name=?")) {
            pstmt.setInt(1, id);
            int rowsDeleted = pstmt.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("Deleted album " + id + " from database");
            } else {
                System.out.println("Album " + id + " not found in database");
            }
        }
    }

    public String findById(int id) throws SQLException {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/laborator08", "root", "root");
        try (Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(
                     "select 'release year', title, artist, genre from albums where id='" + id + "'")) {
            return rs.next() ? "Release Year: " + rs.getString("release year") +
                    "\nTitle: " + rs.getString("title") +
                    "\nArtist: " + rs.getString("artist") +
                    "\nGenre: " + rs.getString("genre") : null;        }
    }
}

