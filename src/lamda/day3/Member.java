package lamda.day3;

import lombok.Data;

@Data
public class Member {

  private String id;
  private String name;

  public Member() {
  }

  public Member(String id) {
    this.id = id;
  }

  public Member(String id, String name) {
    this.id = id;
    this.name = name;
  }

  @Override
  public String toString() {
    return "id : " + id + "\t" + "name : " + name;
  }
}
// Member 클래스는 id로 객체를 생성하는 생성자와 id와 name으로 객체를 생성하는 생성자를 작성하고
// 필드값을 확인 하도록 toString() 오버라이딩 해주세요