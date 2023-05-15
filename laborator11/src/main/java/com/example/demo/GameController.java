package com.example.demo;

import org.springframework.web.bind.annotation.*;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

@RestController
@RequestMapping("/server")
public class GameController {

    private static final int PORT = 5001;
    private static final String ADDRESS = "127.0.0.1";

    @GetMapping("/start")
    public String startServer() {
        try {
            Socket socket = new Socket(ADDRESS, PORT);
            DataInputStream in = new DataInputStream(
                    new BufferedInputStream(socket.getInputStream()));
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());

            String request = "start";
            out.writeUTF(request);

            String response = in.readUTF();

            in.close();
            out.close();
            socket.close();

            return response;
        } catch (IOException e) {
            e.printStackTrace();
            return "Error starting server";
        }
    }

    @GetMapping("/stop")
    public String stopServer() {
        try {
            Socket socket = new Socket(ADDRESS, PORT);
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());

            String request = "stop";
            out.writeUTF(request);

            String response = null;
            if (request.equals("stop")) {
                response = "Server stopped";
            }

            out.close();
            socket.close();

            return response;
        } catch (IOException e) {
            e.printStackTrace();
            return "Error stopping server";
        }
    }
}
