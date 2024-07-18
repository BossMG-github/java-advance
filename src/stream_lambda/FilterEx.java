package stream_lambda;

import java.util.ArrayList;
import java.util.List;

public class FilterEx {

  public static void main(String[] args) {

    List<String> list = new ArrayList<>();
    list.add("김동준");
    list.add("송밍구");
    list.add("박경범");
    list.add("권재민");
    list.add("손민건");
    list.add("손민건");

    //중복 요소를 제거해주세요
    list.stream().distinct().forEach(fre -> System.out.println(fre));
    list.stream().distinct().forEach(System.out::println);

    System.out.println();
    list.stream().filter(fre -> fre.startsWith("박경범")).distinct()
        .forEach(park -> System.out.println(park));

  }
}
