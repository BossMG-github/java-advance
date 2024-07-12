package compare.CompareEx;

import java.util.Comparator;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Person  {

  private String name;
  private int age;

 /* @Override
  public int compareTo(Person o) {
    if (this.age < o.age) {
      return -1;
    } else if (this.age == o.age) {
      return 0;
    } else {
      return 1;
    }
  }
*/
  /*@Override
  public int compare(Person o1, Person o2) {
    if (o1.age < o2.age) {
      return -1;
    } else if (o1.age == o2.age) {
      return 0;
    } else {
      return 1;
    }
  }*/
}
