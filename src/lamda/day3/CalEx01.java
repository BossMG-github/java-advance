package lamda.day3;

//사용자로 부터 두 개의 정수를 받아서 데이터를 저장하고 있는 메소드
//Calculable 타입을 전달 받아 Calculable 인터페이스의 calculate 메소드로
// 데이터를 처리하는 메소드이다.
// action()메소드

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CalEx01 {

  static void action(int x, int y, Calculable calculable) {
/*int x = 10;
    int y = 20;*/
    calculable.calculate(x, y);
  }

  static String processData() throws IOException { // 예외 상황이 일어날 수 있기 때문에 예외를 던져줘야함
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    return br.readLine();
  }


  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // action 매개변수에 입력 값과 함수형인터페이스를 구현한 람다식을 전달 (x, y) -> System.out.println(x + y)
    // action 실행 부분에서 실행 부분에 calculable의 calculate 메소드를 호출 즉 입력 받은 값을 calculate 매개변수에 전달
    // 그리고 sout x+y와 sout x*y를 실행

    action(sc.nextInt(), sc.nextInt(), (x, y) -> System.out.println(x + y));
    action(sc.nextInt(), sc.nextInt(), (x, y) -> System.out.println(x * y));

/*Person user = new Person();
    user.action((x, y) -> {
      int result = x + y;
      return result;
    });

    user.action((x, y) -> x + y);
    user.action((x, y) -> sum(x, y));
    user.action((x, y) -> {
      return mySum(x, y);
    });
  }

  public static int mySum(int x, int y) {
    return (x + y + 0);
  }*/

  }
}
//실행 어라운드 패턴
