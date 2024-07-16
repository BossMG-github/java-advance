package lamda.ex;


@FunctionalInterface
interface Operator {

  public int apply(int x, int y);
}


public class Example02 {

  private static int[] scores = {90, 80, 60, 100, 30, 10};

  public static int maxOrMin(Operator operator) {
    int result = scores[0];
    // scores에서 최대값 또는 최소값을 찾아 리턴하는 코드를 작성하세요.
    for (int i : scores) { // scores 요소(인덱스)동안 루프
      result = operator.apply(result, i); // result 값하고 i 즉, scores 요소들을 매개값으로 전달.
    }
    return result;
  }

  public static void main(String[] args) {
    // 람다식은 함수형 인터페이스 즉 Operator의 apply 추상 메소드를 구현한 객체라고 생각 가능.
    // maxOrMin 메서드를 호출하고 매개변수에 x,y -> Math.max(x,y)를 전달
    // 메서드 실행 부분이 실행되고 operator.apply 호출하였으니깐 apply 메서드에 매개변수 x,y에 result와 i 값을 전달 그리고 반환이 Math.max 이기때문에 result에는 그 둘 중 더 큰 값이 담김
    // 이것을 scores 인덱스 만큼 반복을 함. 그리고 maxOrMin을 호출한 main에 result값을 리턴시킴
    int max = maxOrMin((x, y) -> Math.max(x, y)); // Math api를 활용하여 x,y을 계속 비교하면서 최대값을 반환
    int min = maxOrMin((x, y) -> Math.min(x, y)); // 위에와 전체적인 알고리즘은 같음 최소값을 찾음.

    System.out.println(max);
    System.out.println(min);
  }
}