package com.bitcamp.study;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class HttpClient {

  public static void main(String[] args) throws Exception {
    try (
        Socket socket = new Socket("www.etnews.co.kr", 80);
        BufferedReader in2 = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintStream out2 = new PrintStream(socket.getOutputStream());) {

      out.println("Get / HTTP/1.1");
      out.println("Host: www.auction.co.kr");
      out.println();
      String line;
      while ((line = in.readLine()) != null) {
        System.out.println(line);
      }

    }

  }
}
