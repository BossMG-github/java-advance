package tree.treeSet;

import java.util.Map;
import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetEx {

  public static void main(String[] args) {
    // 랜덤한 학생 점수를 TreeSet 구조에 저장 관리해보자.

    TreeSet<Integer> scores = new TreeSet<>();

    //학생 점수를 저장 함과 동시에 정렬완성


    scores.add(88);
    scores.add(98);
    scores.add(75);
    scores.add(95);
    scores.add(80);
    scores.add(60);

    // 정렬된 점수를 하나씩 가져오기
    for(Integer integer : scores){
      System.out.println(integer);
    }


    // 특정 점수를 가져오기
    System.out.println("최저 점수 : " + scores.first());
    System.out.println("최고 점수 : " + scores.last());
    System.out.println("95점 아래 점수 " + scores.lower(95));
    System.out.println("95점 위의 점수 " + scores.higher(95));
    System.out.println("95점 이거나 바로 아래 점수 : " + scores.floor(95));
    System.out.println("85점 이거나 바로 위의 점수 : " + scores.ceiling(85));

    // desc(내림차순) 정렬
    System.out.println("=================[내림차순 정렬]======================");
    NavigableSet<Integer> descScroes = scores.descendingSet();
    for(Integer score : descScroes){
      System.out.print(score + " ");
    }
    System.out.println("\n");


    System.out.println("=================[범위 검색]======================");
    // 범위 검색 가능.
    NavigableSet<Integer> rangeScores = scores.tailSet(80,true);
    for(Integer score : rangeScores){
      System.out.print(score + " ");
    }
    System.out.println("\n");

    System.out.println("=================[구간 검색]======================");
    // 구간 검색 가능.
    NavigableSet<Integer> subScores = scores.subSet(80,true ,95,false);
    for(Integer score : subScores){
      System.out.print(score + " ");
    }
    System.out.println("\n");
  }
}
