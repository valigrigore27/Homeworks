import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class GameClient {

    public static void main(String[] args) throws IOException {
        Socket socket = null;
        DataInputStream input = null;
        DataOutputStream out = null;

        String address = "127.0.0.1";
        int PORT = 5001;


        try {
            socket = new Socket(address, PORT);
            System.out.println("Connected");

            input = new DataInputStream(System.in);
            out = new DataOutputStream(socket.getOutputStream());
        } catch (UnknownHostException u) {
            System.out.println(u);
            return;
        } catch (IOException i) {
            System.out.println(i);
            return;
        }

        String line = "";

        while (!line.equals("exit")) {
            try {
                line = input.readLine();
                out.writeUTF(line);
            } catch (IOException i) {
                System.out.println(i);
            }
        }

        try {
            input.close();
            out.close();
            socket.close();
        } catch (IOException i) {
            System.out.println(i);
        }
    }
}