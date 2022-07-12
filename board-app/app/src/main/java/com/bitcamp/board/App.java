/*
 * 게시판 관리 애플리케이션
 * 비트캠프20220708
 */
package com.bitcamp.board;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class App {
  public static void main(String[] args) {
    System.out.println("[게시판 애플리케이션]");
    System.out.println();
    System.out.println("환영합니다");
    System.out.println();

    java.util.Scanner keyboardInput = new java.util.Scanner(System.in);

    String title = "";
    String content = "";
    String writer = "";
    String password = "";

    while (true) { // <--반복문
      System.out.println("메뉴:");
      System.out.println("  1: 게시글 목록");
      System.out.println("  2: 게시글 상세보기");
      System.out.println("  3: 게시글 등록");
      System.out.println();
      System.out.print("메뉴를 선택하세요[1..3](0: 종료)");

      int menuNo = keyboardInput.nextInt();
      keyboardInput.nextLine();// 입력한 숫자 뒤에 남아 있는 줄바꿈 코드 제거 **1하고 엔터를 쳤을때 엔터라는 코드값이 남아있음. 이것을 제거함

      /*
       * if (menuNo < 1 || menuNo > 2) {
       * System.out.println("1에서 2 사이의 메뉴 번호를 입력하세요:");
       * 
       * } else {
       * System.out.println("메뉴 번호 ==> " + menuNo);
       */

      if (menuNo == 0) {
        break;
      } else if (menuNo == 1) {
        System.out.println("[게시글 목록]");
        System.out.println("번호 제목 조회수 작성자 등록일");
        System.out.print('\t');
        System.out.print(1);
        System.out.print('\t');
        System.out.print("제목입니다1");
        System.out.print('\t');
        System.out.print(20 + "\t");
        System.out.print("홍길동\t");
        System.out.print("2022-07-08\r\n");

        // System.out.print('\t');
        System.out.print("\t" + 2 + "\t" + "제목입니다2\t" + 11 + "\t" + "홍길동\t" + "2022-07-08\n");
        System.out.print("\t" + 3 + "\t" + "제목입니다3\t" + 31 + "\t" + "임꺽정\t" + "2022-07-08\n");
        System.out.printf("\t%d\t%s\t%d\t%s\t%s\n", 4, "제목입니다4", 45, "유관순", "2022-07-08");
        
      } else if (menuNo == 2) {
        System.out.println("[게시글 상세보기]");
        System.out.printf("번호: %d\n", 1);
        System.out.printf("제목: %s\n", title);
        System.out.printf("내용: %s\n", content);
        System.out.printf("조회수: %d\n", 100);
        System.out.printf("작성자: %s\n", writer);
        System.out.printf("등록일: %s\n", "2022-07-09");
        
      } else if (menuNo == 3) {
        System.out.println("[게시글 등록]");
        
        System.out.print("제목? ");
        title = keyboardInput.nextLine();

        System.out.print("내용? ");
        content = keyboardInput.nextLine();

        System.out.print("작성자? ");
        writer = keyboardInput.nextLine();

        System.out.print("암호? ");
        password = keyboardInput.nextLine();
      } else {
        System.out.println("메뉴 번호가 옳지 않습니다!");
      }
    }
    System.out.println("안녕히 가세요!");
    keyboardInput.close();
  }
}
