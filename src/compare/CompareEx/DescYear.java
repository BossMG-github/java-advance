package compare.CompareEx;

import java.util.Comparator;

public class DescYear implements Comparator<Book> {

  @Override
  public int compare(Book o1, Book o2) {
    return (o1.getYear()-(o2.getYear()))*(-1);
  }
}
