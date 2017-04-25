package com.niit.通信socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServerTest
{

    /**
     *  [一句话功能简述]
     *  [功能详细描述]
     *  @param args    
     * @exception/throws [违例类型] [违例说明]
     * @see [类、类#方法、类#成员]
     */
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(2007);
            Socket socket =serverSocket.accept();
            BufferedReader reader =new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter writer = new PrintWriter(socket.getOutputStream());
            while (true) {
                String str= reader.readLine();
                if (str==null||"".equals(str)) {
                    return;
                    
                }
                System.out.println("accept is "+str);
                writer.println("later is "+(Integer.parseInt(str)+1));
                writer.flush();
                
            }
        }
        catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }finally{
            
        }

    }

}
