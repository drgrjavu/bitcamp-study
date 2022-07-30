package com.bitcamp.board;


//7/30까지 app005진행중. 여기서 날짜코드 확인하고 줄바꾸고 구분선 출력 확인 미흡
// 게시판의 번호를 지정해주는 코드확인하기

public class Appex {
  public static void main(String[] args) {

    System.out.println("게시판 애플리케이션!");
    System.out.println();
    System.out.println("환영합니다!");
    System.out.println();

    java.util.Scanner keyboardInput = new java.util.Scanner(System.in);


    final int SIZE =3; //메뉴수 상수이기때문에 변수대문자를 씀

    int[] no = new int[SIZE];
    String[] title = new String[SIZE];
    String[] content = new String[SIZE];
    String[] writer = new String[SIZE];
    String[] password = new String[SIZE];
    int[] viewCount = new int[SIZE];
    long[] createdDate = new long[SIZE];

    int boardCount = 0;//저장된 게시글의 개수


    while (true) {
      System.out.println("메뉴:");
      System.out.println("  1: 게시글 목록");
      System.out.println("  2: 게시글 상세보기");
      System.out.println("  3: 게시글 등록");

      System.out.println();
      System.out.print("메뉴를 선택하세요[1..3](0: 종료)");

      int menuNo = keyboardInput.nextInt();
      keyboardInput.nextLine(); // 입력한 숫자뒤에 엔터를 치게되면 엔터값이 남아있게되므로 이때 있는 
      //줄바꿈 코드를 제거한다

      if (menuNo == 0) {
        break;//0인경우 if문을 빠져나온다 안녕히가세요로~
      } else if (menuNo == 1) {
        System.out.println("[게시글 목록");
        System.out.println("번호 제목 조회수 작성자 등록일");

        for (int i = 0; i < boardCount; i++) {

        }

      } else if (menuNo == 2) {
        System.out.println("[게시판 상세보기]");
        System.out.printf("번호: %d\n", no);
        System.out.printf("제목: %s\n", title);
        System.out.printf("내용: %s\n", content);
        System.out.printf("조회수: %d\n", viewCount);
        System.out.printf("작성자: %s\n", writer);
        //System.out.printf("등록일: %s\n", "2022-07-30");
        //위 날짜를 Date도구함을 통해 데이터를 준비시키자
        //new Date(밀리초) =>지정한 밀리초를 가지고 날짜 관련 도구를 사용할 수 있도록 설정한다.
        //Date date =>createdDate 밀리초를 가지고 설정한 날짜 정보
        java.util.Date date = new java.util.Date(createdDate);
        System.out.printf("등록일: %tY-%1$tm-%1$td %1$tH:%1$tM\n", date);

      } else if (menuNo == 3) {
        System.out.println("[게시글 등록]");

        System.out.print("제목? ");
        title = keyboardInput.nextLine();

        System.out.print("내용? ");
        title = keyboardInput.nextLine();

        System.out.print("작성자? ");
        title = keyboardInput.nextLine();

        System.out.print("암호? ");
        title = keyboardInput.nextLine();

        no = 1;
        viewCount = 0;
        createdDate = System.currentTimeMillis();

      } else {
        System.out.println("메뉴 번호가 옳지 않습니다!");
      }

      System.out.println();//메뉴를 처리한 후 빈 줄 출력하기
    }//while문 여기까지
    System.out.println("안녕히 가세요!");
    keyboardInput.close();

  }
}


