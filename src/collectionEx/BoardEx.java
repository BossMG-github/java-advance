package collectionEx;


import java.util.ArrayList;
import java.util.List;

public class BoardEx {

  public static void main(String[] args) {
    List<Board> boardList = new ArrayList<Board>(); // Board 는 게시물 1개를 의미한다. boardList는 여러개의 게시물을 저장하는 저장소
    boardList.add(new Board("맛있는 점심1", "서유미1","내일은 뭐 먹지1"));
    boardList.add(new Board("맛있는 점심2", "서유미2","내일은 뭐 먹지2"));
    boardList.add(new Board("맛있는 점심3", "서유미3","내일은 뭐 먹지3"));
    boardList.add(new Board("맛있는 점심4", "서유미4","내일은 뭐 먹지4"));
    int boardSize = boardList.size();
    System.out.println(boardSize);

    // 특정 인덱스를 지정하여 객체 가져오기
    Board board = boardList.get(2);
    System.out.println(board.getSubject() + "\t" + board.getWriter() + "\t" + board.getContent());

    // boardList의 모든 게시글을 다 출력해보자 1. 인덱스 이용하기

    for(int i = 0; i < boardList.size(); i++){
      Board board1 = boardList.get(i);
      System.out.println(board1.getSubject() + "\t" + board1.getWriter() + "\t" + board1.getContent());
    }

    System.out.println("================================================");
    // 향상된 for를 이용하여 모든 객체 출력하기
    for(Board board1 : boardList){
      System.out.println(board1.getSubject() + "\t" + board1.getWriter() + "\t" + board1.getContent());
    }
  }
}
