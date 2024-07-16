package lamda.day1;

// 1.두 개의 정수를 받아 정수를 반환하는 단일 메서드 operate가 있는 함수형 인터페이스 LamdaEx02.MathOperation을 정의
// 2.두 개의 정수 a,b를 더하는 람다 표현식을 생성 (a,b)->a+b
// 3.람다 표현식을 사용하여 함수형 인터페이스의 인스턴스를 생성하고 operate() 호출해서 두 숫자의 합을 구한다.

public class LamdaEx02 {

  @FunctionalInterface
  interface MathOperation { // 1번

    int operate(int a, int b);
  }

  @FunctionalInterface
  interface StringOperation {

    int returnStrLength(String a);
  }

  @FunctionalInterface
  interface ArrayOperation {

    int calculateSum(int[] numbers);
  }


  public static void main(String[] args) {
    //2. 두 정수를 받아 그 합을 반환하는 람다식 작성
    MathOperation addition = ((a, b) -> a + b);

    //3. 함수형 인터페이스 인스턴스 생성 operate()호출 결과 반환
    int result = addition.operate(5, 3);
    System.out.println("Result = " + result);

    // 문제2. 문자열을 받아 그 길이를 반환하는 람다 표현식을 작성하세요
    // 인터페이스의 이름 : StringOperation

    StringOperation length = str -> str.length();
    int result2 = length.returnStrLength("안녕하세용");
    System.out.println(result2);

    // 정수 배열을 받아 모든 짝수의 합을 반환하는 람다 표현식 작성 인터페이스명 : ArrayOperation

    ArrayOperation evenSum = numbers -> {
      int sum = 0;
      for (int num : numbers) {
        if (num % 2 == 0) {
          sum += num;
        }
      }
      return sum;
    };

    int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int result3 = evenSum.calculateSum(array);
    System.out.println(result3);
  }
}
