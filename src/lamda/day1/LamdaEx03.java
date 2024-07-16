package lamda.day1;

import java.util.ArrayList;
import java.util.List;

// 1.정수 리스트를 받아 정수를 반환하는 단일 추상 메서드 getMax()를 사용하여 findmax 인터페이스를 생성하세요
// 2.정수 리스트를 반복하고 최대값을 찾는 람다식을 구현합니다.
// 3.최대값은 Integer.MIN_Vaule로 설정 한 후 더 높은 숫자가 나타나면 업데이트 합니다.
//   최대값은 변수 max에 저장합니다.
// 4.정수리스트를 생성
// 5.max 객체에서 getMax() 호출하여 최대값을 출력합니다.


@FunctionalInterface
interface FindMax { // 1번

  int getMax(List<Integer> a);
}

public class LamdaEx03 {

  public static void main(String[] args) {
    /*List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

    FindMax fm = ((arrayList)-> Collections.max(numbers));
    int max = fm.getMax(numbers);
    System.out.println(max);
*/

    FindMax max = numbers -> {
      int maxNumber = Integer.MIN_VALUE;
      for (int number : numbers) {
        if (number > maxNumber) {
          maxNumber = number;
        }
      }
      return maxNumber;
    };

    List<Integer> numberList = new ArrayList<>();
    numberList.add(10);
    numberList.add(20);
    numberList.add(30);
    numberList.add(0);
    numberList.add(100);
    int maxvalue = max.getMax(numberList);
    System.out.println(maxvalue);
  }
}
