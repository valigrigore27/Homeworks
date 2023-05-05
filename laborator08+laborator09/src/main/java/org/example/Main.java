package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.Buffer;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.persistence.jpa.PersistenceProvider;

import javax.persistence.*;

import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) {

//    try {
//        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/laborator08", "root", "root");
//
//        Statement statement = connection.createStatement();
//
//        ResultSet resultSet = statement.executeQuery("select * from albums");
//
//        while(resultSet.next()){
//            System.out.println(resultSet.getString("genre"));
//        }
//    }
//    catch (Exception e){
//        e.printStackTrace();
//    }
//        //ADAUG ARTISTI SI STERG
//        try {
//            var artists = new ArtistDAO();
//            //artists.create("Pink Floyd");
//            artists.create("Michael Jackson");
//            //artists.delete("Michael Jackson");
//        }
//        catch (Exception e){
//        e.printStackTrace();
//    }
        //CAUT ID DUPA NUME
//        try {
//            var artists = new ArtistDAO();
//            Integer michaelJacksonId = artists.findByName("Michael Jackson");
//            if (michaelJacksonId != null) {
//                System.out.println("Michael Jackson's ID is " + michaelJacksonId);
//            } else {
//                System.out.println("Michael Jackson not found in database");
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        //CAUT ARTIST DUPA ID
//        try {
//            var artists = new ArtistDAO();
//            String name = String.valueOf(artists.findById(23));
//            if (name != null) {
//                System.out.println("artist with ID 23 is " + name);
//            } else {
//                System.out.println("id not found in database");
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        //ADAUG ALBUM NOU
//        try {
//            var album = new AlbumsDAO();
//            //album.create(16, 2003,"Yeah","Gogore","Symphony");
//            System.out.println(album.findById(16));
//
//        }
//        catch (Exception e){
//        e.printStackTrace();
//    }

        //ADAUG GENURI SI STERG
//        try {
//            var genre = new GenreDAO();
//            genre.create(16,"folk");
//        }
//        catch (Exception e){
//        e.printStackTrace();
//    }
//        //CAUT ID DUPA NUME LA GENURI
//        try {
//            var artists = new ArtistDAO();
//            Integer michaelJacksonId = artists.findByName("Michael Jackson");
//            if (michaelJacksonId != null) {
//                System.out.println("Michael Jackson's ID is " + michaelJacksonId);
//            } else {
//                System.out.println("Michael Jackson not found in database");
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//
//        Artist artist = new Artist(1, "Michael Jackson");
//        Album album1 = new Album(1, 1982, "Thriller", artist, "Pop");
//        Album album2 = new Album(2, 1987, "Bad", artist, "Pop");
//
//        artist.addAlbum(album1);
//        artist.addAlbum(album2);
//

        //IMPORT DATA FROM REAL DATASET (CSV FILE)


//        try {
//            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/laborator08", "root", "root");
//            connection.setAutoCommit(false);
//
//            String sql = "insert into albums(id, release year, title, artist, genre) values (?,?,?,?,?)";
//
//            PreparedStatement statement=connection.prepareStatement(sql);
//
//            BufferedReader lineReader = new BufferedReader(new FileReader("C:\\Users\\Tuf\\OneDrive\\Desktop\\JaVaSeM2\\laborator08\\albumlist.csv"));
//
//
//            String lineText = null;
//            int count =0 ;
//
//
//            lineReader.readLine();
//
//
//            while ((lineText=lineReader.readLine())!=null){
//                String[] data = lineText.split(",");
//
//                String id=data[0];
//                String release_year = data[1];
//                String title = data[2];
//                String artist = data[3];
//                String genre = data[4];
//
//                statement.setInt(1,parseInt(id));
//                statement.setString(2,release_year);
//                statement.setString(3,title);
//                statement.setString(4,artist);
//                statement.setString(5,genre);
//                statement.addBatch();
//                int batchSize=20;
//                if(count%batchSize==0){
//                    statement.executeBatch();
//                }
//            }
//            lineReader.close();
//            statement.executeBatch();
//            connection.commit();
//            connection.close();
//            System.out.println("succes");
//
//        }
//        catch (Exception exception){
//            exception.printStackTrace();
//        }

//

    }
}