package edu.javacourse.net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class Client
{
    public static void main(String[] args) throws IOException {
        for(int i=0; i<10; i++) {
            sendRequest();
        }
    }

    private static void sendRequest() throws IOException {
        Socket socket = new Socket("127.0.0.1", 25225);

        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

        String sb = "Anton";
        bw.write(sb);
        bw.newLine();
        bw.flush();

        String answer = br.readLine();
        System.out.println("Client got string:" + answer);

        br.close();
        bw.close();

    }
}
