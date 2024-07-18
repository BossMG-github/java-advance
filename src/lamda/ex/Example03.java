package lamda.ex;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

/*
interface BiPredicate<,T2>{
  List cateMethod(T t, T2 t2);
}
*/


public class Example03 {
  // 어디에 어떻게 람다를 사용할까?
  // - 함수형 인터페이스
  // - 함수 디스크립터

  static int sum1;

  public static void main(String[] args) {

    // 5번
    // IntStream 방식
    IntStream.rangeClosed(0, 10).forEach((int value) -> System.out.println(value));
    // forEach 방식
    List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    list.forEach(System.out::println);

    // 6번
    int[] arr = {1, 2, 3, 4, 5};
    int sum = Arrays.stream(arr).sum();
    System.out.println("합 : " + sum);
    // 위 코드를 람다식으로 변경

    List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
    list.stream().forEach((i -> sum1 += i));
    System.out.println(sum1);

    // collection에 담긴 객체를 처리하는 반복자 3가지
    // 1. iterator 구성 방식
    // 2. stream 구성방식
    // 3. while(iter.hasNext() == true){ Onject nex = iter.next();}

    // 7번
    List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 5);
    list2.forEach(System.out::println); // stream을 붙여도 되고 빼도 됨
    list2.stream().forEach(m -> System.out.println(m)); //위에랑 같은 코드

    // 8번
    List<Integer> list3 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

    for (Integer i : list3) {
      int tmp = 0;
      if (i % 2 != 0) {
        tmp = i * i;
        sum += tmp;
      }
    }
    System.out.println("8번의 홀수에 대한 제곱의 합은 : " + sum);

    // stream을 이용하여 홀수의 합 구하기
    List<Integer> list4 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    sum = list4.stream().filter(x -> x % 2 != 0).reduce(0, Integer::sum);
    System.out.println("9번의 스트림을 이용하여 홀수의 합은 : " + sum);

  }
}
