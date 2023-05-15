package com.example.demo;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

class GameServer extends Thread {


    private Socket socket = null;
    private ServerSocket server;
    private DataInputStream in = null;

    public Socket getSocket() {
        return socket;
    }

    public void setSocket(Socket socket) {
        this.socket = socket;
    }

    public ServerSocket getServer() {
        return server;
    }

    public void setServer(ServerSocket server) {
        this.server = server;
    }

    public DataInputStream getIn() {
        return in;
    }

    public void setIn(DataInputStream in) {
        this.in = in;
    }

    public void run() {
        try {
            int PORT = 5001;
            setServer(new ServerSocket(PORT));
            System.out.println("Server started");
            System.out.println("Waiting for a client ...");

            setSocket(getServer().accept());
            System.out.println("Client accepted");

            setIn(new DataInputStream(
                    new BufferedInputStream(getSocket().getInputStream())));

            String text = "";


            while (!text.equals("exit")) {
                try {
                    text = getIn().readUTF();
                    System.out.println("Server received the request ... ");
                    //System.out.println(text);

                } catch (IOException i) {
                    System.out.println(i);
                }
            }
            System.out.println("Closing connection");

            getSocket().close();
            getIn().close();
        } catch (IOException i) {
            System.out.println(i);
        }
    }
}