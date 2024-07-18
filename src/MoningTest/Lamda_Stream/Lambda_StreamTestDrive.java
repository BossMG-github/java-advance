package MoningTest.Lamda_Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class Lambda_StreamTestDrive {

  public static void main(String[] args) {
    // 1번 4
    // 2번 4
    // 3번 2
    // 4번 4
    // 5번 2
    // 6번 4

    // 7번
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    int sum = numbers.stream().filter(num -> num % 2 == 0).mapToInt(num -> num).sum();

    // 8번
    Supplier<String> sp = () -> new String();
    String str = sp.get();

    // 9번
    Supplier<Random> spRan = () -> new Random();
    Random ran = spRan.get();
    // 10번

  }
}
