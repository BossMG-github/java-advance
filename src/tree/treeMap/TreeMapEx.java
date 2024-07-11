package tree.treeMap;

import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapEx {

  public static void main(String[] args) {
    TreeMap<String, Integer> treeMap = new TreeMap<>();

    // 엔트리 저장
    treeMap.put("손민규",90);
    treeMap.put("김동준",80);
    treeMap.put("고태우",87);
    treeMap.put("권재민",70);
    treeMap.put("이상묵",83);
    treeMap.put("박경범",93);
    treeMap.put("김현우",70);

    // 정렬된 엔트리 하나씩 가져오기
    Set<Entry<String, Integer>> entrySet = treeMap.entrySet();
    for(Entry<String, Integer> student : entrySet){
      System.out.println(student.getKey() + " --- " + student.getValue());
    }

    System.out.println("=========================");
    // 특정 키 검색하여 값 가져오기.
    Entry<String, Integer> entry = null;
    entry = treeMap.firstEntry();
    System.out.println(entry.getKey() + "--------" + entry.getValue());

    entry = treeMap.lastEntry();
    System.out.println(entry.getKey() + "--------" + entry.getValue());

    entry = treeMap.lowerEntry(treeMap.lastKey());
    System.out.println(entry.getKey() + "--------" + entry.getValue());

    // desc(내림차순) 정렬
    System.out.println("=================[내림차순 정렬]======================");
    NavigableMap<String,Integer> descStudent = treeMap.descendingMap();
    Set<Entry<String, Integer>> descScores = descStudent.entrySet();
    for(Entry<String,Integer> student : descScores){
      System.out.print(student.getKey() + " --- " + student.getValue() + "  ");
    }
    System.out.println("\n");

    System.out.println("=================[구간 검색]======================");
    // 구간 검색 가능.
    NavigableMap<String,Integer> rangestudent = treeMap.subMap("김",true,"이",false);
    for(Entry<String,Integer> rangeMap : rangestudent.entrySet()){
      System.out.print(rangeMap.getKey() + " --- " + rangeMap.getValue() + "  ");
    }
    System.out.println("\n");

    System.out.println("=================[범위 검색]======================");
    // 범위 검색 가능.
    NavigableMap<String,Integer> subStudent = treeMap.tailMap("김",true);
    for(Entry<String,Integer> submap : subStudent.entrySet()){
      System.out.print(submap.getKey() + " --- " + submap.getValue() + "  ");
    }
    System.out.println("\n");

  }
}
