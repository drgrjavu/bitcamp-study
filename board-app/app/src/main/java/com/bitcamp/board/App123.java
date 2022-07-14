/*
 * 게시판 관리 애플리케이션
 * 비트캠프20220708
 */
package com.bitcamp.board;

import java.util.Date;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class App {

  static final int SIZE = 5; // 불변하는final은 대문자로 강조표기하여 식별가능하게한다.

  static int[] no = new int[SIZE];
  static String[] title = new String[SIZE];
  static String[] content = new String[SIZE];
  static String[] writer = new String[SIZE];
  static String[] password = new String[SIZE];
  static int[] viewCount = new int[SIZE];
  static long[] createdDate = new long[SIZE];

  static int boardCount = 0; // 저장된 게시글의 개수
  static java.util.Scanner keyboardInput = new java.util.Scanner(System.in);

  public static void main(String[] args) {

  welcome();
  loop: while (true) { // <--반복문
    displayMenu();
    int menuNo = promptMenu();
    displayLine();

    switch (menuNo == 0) {
      case 0:  break loop;
      case 1: processBoardList(); break;
      case 2: processBoardDetail(); break;
      case 3: processBoardInput(); break;
      default: System.out.println("메뉴 번호가 옳지 않습니다!");
      } 
      
      displayBlankLine();
  }

  System.out.println("안녕히 가세요!");keyboardInput.close();
  }// main

  static void welcome() {
    System.out.println("[게시판 애플리케이션]");
    System.out.println();
    System.out.println("환영합니다");
    System.out.println();
  }

  static void processBoardList() {
    System.out.println("[게시글 목록]");
    System.out.println("번호 제목 조회수 작성자 등록일");

    for (int i = 0; i < boardCount; i++) {
      // 밀리초 데이터 ==> Date 도구함 설정
      java.util.Date date = new java.util.Date(createdDate[i]);

      // 날짜정보 ==> "yyy-MM-dd" 형식의 문자열
      String dateStr = formatter.format(date);
      System.out.printf("%d\t%s\t%d\t%s\t%s\n",
          no[i], title[i], viewCount[i], writer[i], dateStr);
      // 날짜 정보에서 값을 추출하여 특정 포맷의 문자열로 만들어줄 도구를 준비
      java.text.SimpleDateFormat formatter = new java.text.SimpleDateFormat("yyyy-MM-dd");
      // i++배열 인덱스를 증가시킨다
    }
  }

  static void processBoardDetail() {
      System.out.println("[게시글 상세보기]");

      System.out.print("조회할 게시글 번호? ");
      String input = keyboardInput.nextLine();
      int boardNo = Integer.parseInt(input);

      // 해당 번호의 게시글이 몇 번 배열에 들어 있는지 알아내기
      int boardIndex = -1;
      
      for (int i = 0; i < boardCount; i++) {
        if (no[i] == boardNo) {
          boardIndex = i;
          break;
        }

      }
    }

  // 사용자가 입력한 번호에 해당하는 게시글을 못 찾았다면
  if(boardIndex==-1)

  {
    System.out.println("해당 번호의 게시글이 없습니다!");
    return;
  }

  System.out.printf("번호: %d\n",no[boardIndex]);System.out.printf("제목: %s\n",title[boardIndex]);System.out.printf("내용: %s\n",content[boardIndex]);System.out.printf("조회수: %d\n",viewCount[boardIndex]);System.out.printf("작성자: %s\n",writer[boardIndex]);
  // Date 도구함의 도구를 쓸 수 있도록 데이터를 준비시킨다.
  // new Date(밀리초)
  // => 지정한 밀리초를 가지고 날짜 관련 도구를 사용할 수 있도록 설정한다.
  // Date date
  // => createdDate 밀리초를 가지고 설정한 날짜 정보
  java.util.Date date = new java.util.Date(createdDate[boardIndex]);

  // Date 도구함을 통해 설정한 날짜 정보를 가지 // %tY : date에 설정된 날

  // ex99, Exam0130참조 날짜설정

  System.out.printf("등록일: %tY-%1$tm-%1$td %1$tH:%1$tM\n",date);

  

  static void processBoardInput() {

    System.out.println("[게시글 등록]");

    // 배열의 크기를 초과하지 않았는지 검사한다
    if (boardCount == SIZE) {
      System.out.println("게시글을 더이상 저장할 수 없습니다.");
      return;
    }

    System.out.print("제목? ");
    title[boardCount] = keyboardInput.nextLine();

    System.out.print("내용? ");
    content[boardCount] = keyboardInput.nextLine();

    System.out.print("작성자? ");
    writer[boardCount] = keyboardInput.nextLine();

    System.out.print("암호? ");
    password[boardCount] = keyboardInput.nextLine();

    /*
     * if (boardCount == 0) {
     * no[boardCount] = 1;
     * } else {
     * no[boardCount] = no[boardCount - 1] +1;
     * }
     * 밑에3항연산자와 같다
     */
    no[boardCount] = boardCount == 0 ? 1 : no[boardCount - 1] + 1;

    viewCount[boardCount] = 0;
    createdDate[boardCount] = System.currentTimeMillis();

    boardCount++;
  }

  static void displayMenu() {
    System.out.println("메뉴:");
    System.out.println("  1: 게시글 목록");
    System.out.println("  2: 게시글 상세보기");
    System.out.println("  3: 게시글 등록");
    System.out.println();
    System.out.print("메뉴를 선택하세요[1..3](0: 종료)");
  }

  static void displayLine() {
    System.out.println("----------------------------------------------");
  }

  static int promptMenu() {
    int menuNo = keyboardInput.nextInt();
  
    return menuNo;
  }
  static displayBlankLine(){
  keyboardInput.nextLine();// 입력한 숫자 뒤에 남아 있는 줄바꿈 코드 제거 **1하고 엔터를 쳤을때 엔터라는 코드값이 남아있음. 이것을 제거함
}
}