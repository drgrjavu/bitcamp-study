package com.bitcamp.board;


//7/30까지 app005진행중. 여기서 날짜코드 확인하고 줄바꾸고 구분선 출력 확인 미흡
// 게시판의 번호를 지정해주는 코드확인하기

public class Appx {
  public static void main(String[] args) {

    System.out.println("게시판 애플리케이션!");
    System.out.println();
    System.out.println("환영합니다!");
    System.out.println();

    java.util.Scanner keyboardInput = new java.util.Scanner(System.in);
    java.text.SimpleDateFormat formatter = 
        new java.text.SimpleDateFormat("yyy-MM-dd");


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

      System.out.println("-----------------------------------------");

      if (menuNo == 0) {
        break;//0인경우 if문을 빠져나온다 안녕히가세요로~

      } else if (menuNo == 1) {
        System.out.println("[게시글 목록");
        System.out.println("번호 제목 조회수 작성자 등록일");

        for (int i = 0; i < boardCount; i++) {
          java.util.Date date = new java.util.Date(createdDate[i]);
          String dateStr = formatter.format(date);
          System.out.printf("%d\t%s\t%d\t%s\t%s\n", 
              no[i], title[i], viewCount[i], writer[i], dateStr);
        }

      } else if (menuNo == 2) {
        System.out.println("[게시글 상세보기]");
        System.out.print("조회할 게시글 번호? ");
        String input = keyboardInput.nextLine();
        int boardNo = Integer.parseInt(input);

        //해당 번호의 게시글이 몇 번 배열에 들어 있는지 알아내기
        int boardIndex = -1;
        for(int i = 0; i < boardCount; i++) {
          if(no[i] == boardNo) {
            boardIndex = i;
            break;
          }
        }
        // 사용자가 입력한 번호에 해당하는 게시글을 못 찾았다면
        if (boardIndex == -1) {
          System.out.println("해당 번호의 게시글이 없습니다!");
          continue;
        }

        System.out.printf("번호: %d\n", no[boardIndex]);
        System.out.printf("제목: %s\n", title[boardIndex]);
        System.out.printf("내용: %s\n", content[boardIndex]);
        System.out.printf("조회수: %d\n", viewCount[boardIndex]);
        System.out.printf("작성자: %s\n", writer[boardIndex]);
        java.util.Date date = new java.util.Date(createdDate[boardIndex]);
        System.out.printf("등록일: %tY-%1$tm-%1$td %1$th:%1$tM\n", date);


      } else if (menuNo == 3) {
        System.out.println("[게시글 등록]");
        // 먼저 배열의 크기를 초과하지 않았는지 검사한다
        if (boardCount ==SIZE) {
          System.out.println("게시글을 더이상 저장할 수 없습니다.");
          continue;
        }

        System.out.print("제목? ");
        title[boardCount] = keyboardInput.nextLine();

        System.out.print("내용? ");
        title[boardCount] = keyboardInput.nextLine();

        System.out.print("작성자? ");
        title[boardCount] = keyboardInput.nextLine();

        System.out.print("암호? ");
        title[boardCount] = keyboardInput.nextLine();

        no[boardCount] = boardCount == 0 ? 1 : no[boardCount - 1] + 1;
        viewCount[boardCount] = 0;
        createdDate[boardCount] = System.currentTimeMillis();

      } else {
        System.out.println("메뉴 번호가 옳지 않습니다!");
      }

      System.out.println();//메뉴를 처리한 후 빈 줄 출력하기
    }//while문 여기까지

    System.out.println("안녕히 가세요!");
    keyboardInput.close();

  }
}


