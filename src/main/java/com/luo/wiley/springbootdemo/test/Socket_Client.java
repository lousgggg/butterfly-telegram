package com.luo.wiley.springbootdemo.test;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Proxy;
import java.net.Socket;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class Socket_Client {

    public static void main(String[] args) {
//        HashMap<String, String> hashMap = new HashMap<String, String>(10, 0.80f);
//
//        hashMap.put("name", "wiley");
//
//        String name = hashMap.get("name");
//        System.out.println(name);
//
//        LinkedList<String> linkedList = new LinkedList<>();
//        linkedList.add("hello");
//        System.out.println(linkedList.get(0));

        try {
            Socket client = new Socket("127.0.0.1",9999);
            OutputStream outputStream = client.getOutputStream();

            DataOutputStream dataOutputStream = new DataOutputStream(outputStream);

            Scanner scanner = new Scanner(System.in);

            if (scanner.hasNext()) {
                String text = scanner.next();

                int type = 1;
                byte[] data = text.getBytes();
                int len = data.length + 5;

                dataOutputStream.writeByte(type);
                dataOutputStream.writeInt(len);
                dataOutputStream.write(data);
                dataOutputStream.flush();

            }

            client.shutdownOutput();


        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
