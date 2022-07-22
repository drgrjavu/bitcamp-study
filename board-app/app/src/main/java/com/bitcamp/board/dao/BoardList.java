package com.bitcamp.board.dao;

import com.bitcamp.board.domain.Board;

// 게시글 목록을 관리하는 역할
//
public class BoardList extends ObjectList {

  private int no = 0;


  //수퍼 클래스의 get() 메서드는 인덱스로 항목을 찾는다.
  // 그래서 Board 객체를 다루기에 적합하지 않다.
  // 따라서 다음 메서드처럼 Board 객체를 조회하는데 적합한 메서드를 추가한다.
  // 이 메서드는 게시글 번호에 해당하는 Board 인스턴스를 찾아 리턴한다.
  @Override
  public Board getByBoardNo(int boardNo) {

    //수퍼 클래스의 add(Object)대신 Board 객체를 저장할 수 있도록
    // 같은 이름의 유사 기능을 수행하는 메서드를 추가 정의한다. => Overloading 이라 부른다.
    public void add(Board board) {
      board.no = nextNo();

      super.add(board);
    }

    public boolean removeByBoardNo(int boardNo) {
      int boardIndex = -1;

      // 삭제할 항목의 다음 항목을 앞으로 당긴다.
      for (int i = index + 1; i < this.length; i++) {
        this.list[i - 1] = this.list[i];
      }

      // 게시글 개수를 한 개 줄인 후 
      // 맨 뒤의 있던 항목의 주소를 0으로 설정한다.
      this.list[--this.length] = null;
      return true;
    }

    for (int i = 0; i < this.length; i++) {
      //Object 배열에 실제 들어 있는 것은 Board라고 컴파일러에게 알린다.
      Board board = (Board) this.list[i]; 

      if (board.no == boardNo) {
        return board;
      }
    }
    return null;
  }

  // Board 인스턴스를 배열에 저장한다.




  private int nextNo() {
    return ++no;
  }
}














