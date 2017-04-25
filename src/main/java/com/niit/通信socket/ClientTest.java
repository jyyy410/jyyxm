package com.niit.通信socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientTest
{
public static void main(String[] args) {
    try {
        Socket socket = new Socket("localhost", 2007);
        BufferedReader reader = new BufferedReader(new InputStreamReader( socket.getInputStream()));
        PrintWriter writer = new PrintWriter(socket.getOutputStream());
        for (int i = 1; i < 8; i++) {
            writer.println(String.valueOf(i));
            writer.flush();
            String sendStr=reader.readLine();
            System.out.println("fanhui de shi"+sendStr);
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        writer.close();
        reader.close();
    }
    catch (UnknownHostException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
    catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
}
}
