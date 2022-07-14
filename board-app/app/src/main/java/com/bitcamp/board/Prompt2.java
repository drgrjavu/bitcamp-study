/*
 * 키보드 입력을 받는 도구를 구비하고 있다.
 * 
 */
package com.bitcamp.board;

public class Prompt {
  
  static java.util.Scanner keyboardInput = new java.util.Scanner(System.in);
  
  static int inputInt() {
    String str = keyboardInput.nextLine();
    return Integer.parseInt(str); //"123"==> 123, "5" ==>5, "ok"==>tlfgod
  }
  static int inputInt(String title) {
    System.out.print(title);
    String str = keyboardInput.nextLine();
    return Integer.parseInt(str); 
  }
  
  static String inputString() {
    return keyboardInput.nextLine();
  }
  static String inputString() {
    return keyboardInput.nextLine();
  }

  static void close() {
    keyboardInput.close();
  }
}
