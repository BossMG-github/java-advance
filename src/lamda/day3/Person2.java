package lamda.day3;

public class Person2 {

  public Member getMember1(CreateIdMember creatable) {
    String id = "SSG-manager";
    Member mem = creatable.create(id);
    return mem;
  }

  public Member getMember2(CreateIdNameMember creatable) {
    String id = "SSG-manager";
    String name = "SSG";
    Member mem = creatable.create(id, name);
    return mem;
  }
}
