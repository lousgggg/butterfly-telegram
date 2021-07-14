package com.luo.wiley.springbootdemo.test;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Socket_Server {


    public static void main(String[] args) {
        try {
            // 初始化服务端socket并绑定9999端口
            ServerSocket serverSocket = new ServerSocket(9999);

            //等待客户端的连接
            Socket client = serverSocket.accept();

            //获取输入流
            DataInputStream dataInputStream = new DataInputStream(client.getInputStream());

            while (true) {
                byte b = dataInputStream.readByte();

                int len = dataInputStream.readInt();

                byte[] data = new byte[len-5];

                dataInputStream.readFully(data);

                String text = new String(data);

                System.out.println("获取的数据类型为：" + b);
                System.out.println("获取的数据长度为：" + len);
                System.out.println("获取的数据内容为:" + text);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
