package compare.CompareEx;

import java.util.Comparator;
// 제목 기준 내림차순 비교기
public class DescSubject implements Comparator<Book> {

  @Override
  public int compare(Book o1, Book o2) {
    int result = (o1.getSubject().compareTo(o2.getSubject()))*(-1);
    return result;
  }
}
