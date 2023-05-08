import java.io.*;
import java.net.*;
import java.sql.SQLOutput;

public class GameServer {

    public static void main ( String [] args ) throws IOException {
        ClientThread clientThread= new ClientThread();
        clientThread.start();    }

}