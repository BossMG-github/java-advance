package compare.CompareEx;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class PersonTestDrive {

  public static void main(String[] args) {
    TreeSet<Person> peoples = new TreeSet<Person>(new PersonComparator());

    peoples.add(new Person("동현", 26));
    peoples.add(new Person("은희", 25));
    peoples.add(new Person("민규", 24));
    peoples.add(new Person("경범", 29));
    peoples.add(new Person("동준", 30));

    for(Person person : peoples){
      System.out.println(person.getName() + "\t" + person.getAge());
    }

    /* List<Person> personList = new ArrayList<>();
    TreeSet<Person> personTreeSet = new TreeSet<>();

    personList.add(new Person("동현", 26));
    personList.add(new Person("은희", 25));
    personList.add(new Person("민규", 24));
    personList.add(new Person("경범", 29));
    personList.add(new Person("동준", 24));

    Collections.sort(personList); // 정렬

    for (int i = 0; i < personList.size(); i++) { // 길이 만큼 반복
      personTreeSet.add(personList.get(i)); // TreeSet에 리스트 해당 객체를 add
    }
    for (Person ps : personTreeSet) {
      System.out.println(ps.getName() + "\t" + ps.getAge()); // 출력
    }*/
  }
}